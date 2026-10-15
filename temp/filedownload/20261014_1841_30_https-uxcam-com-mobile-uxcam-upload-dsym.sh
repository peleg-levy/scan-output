#!/bin/sh

# MIT License
# Copyright (c) 2024 UXCam
# See full license at: https://opensource.org/licenses/MIT

# Check if app key is provided
if [ "$#" -ne 1 ]; then
echo "Usage: $0 <app_key>"
exit 1
fi

UXCAM_BASE_URL=${UXCAM_BASE_URL:="https://verify.uxcam.com"}
UXCAM_APP_KEY="$1"

DSYM_LOCATION="${DWARF_DSYM_FOLDER_PATH}/${DWARF_DSYM_FILE_NAME}"

# Check if DSYM_LOCATION exists
if [ ! -d "$DSYM_LOCATION" ]; then
echo "Error: dSYM location does not exist: $DSYM_LOCATION"
exit 0
fi

#Move to dsym folder path
cd $DWARF_DSYM_FOLDER_PATH

DSYM_CONTENT="${DSYM_LOCATION}/Contents/Resources/DWARF/${TARGET_NAME}"

echo "content:${DSYM_CONTENT}"

if [ ! -f "$DSYM_CONTENT" ]; then
echo "Error: dSYM file does not exist: $DSYM_CONTENT"
exit 0
fi

for UUID in $(dwarfdump --uuid "${DSYM_CONTENT}" | cut -d ' ' -f 2 | tr '[:upper:]' '[:lower:]' | tr -d '-'); do

# Check if UUID is empty
if [ -z "$UUID" ]; then
echo "Error: Failed to extract UUID from dSYM file"
continue
fi

UXCAM_UPLOAD_URL="$UXCAM_BASE_URL/v4/dsym"
response=$(curl -s -X POST -H "Content-Type: application/json" -d "{\"appKey\":\"$UXCAM_APP_KEY\"}" $UXCAM_UPLOAD_URL)

status=$(echo "$response" | jq -r '.status')

if [ "$status" = "true" ]; then
# Extract URL and body
url=$(echo "$response" | jq -r '.data.url')
body=$(echo "$response" | jq -r '.data.body')

key=$(echo "$body" | jq -r '.key')
upload_name="${key}${UUID}.dSYM.zip"

# Change the key value to the upload name
body=$(echo "$body" | jq --arg new_key "$upload_name" '.key = $new_key')

# Rename dSYM file before zipping
file_to_upload="${UUID}.dSYM"
mv "$DWARF_DSYM_FILE_NAME" "$file_to_upload"
zip_file="${file_to_upload}.zip"

# Zip dSYM file to upload
zip -r $zip_file  $file_to_upload

# Revert the changed dsym file to original name
mv "$file_to_upload" "$DWARF_DSYM_FILE_NAME"

# Remove the 'file' field from body
body=$(echo "$body" | jq 'del(.file)')

# Create array for curl parameters
curl_params=()

# Get all keys from the body
keys=$(echo "$body" | jq -r 'keys[]')

# Iterate through each key
for key in $keys; do
value=$(echo "$body" | jq -r --arg k "$key" '.[$k]')
curl_params+=("-F")
curl_params+=("$key=$value")
done

curl -X POST "$url" \
"${curl_params[@]}" \
-F "file=@$zip_file"

# Delete zipped file
rm -r $zip_file

echo "Uploaded dSYM to UXCam for UUID: ${UUID}"

fi
done
