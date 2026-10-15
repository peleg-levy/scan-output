package com.uxcam.video.screen.codec.b;

import java.io.Closeable;
import java.nio.channels.ByteChannel;
import java.nio.channels.Channel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/b/i.class */
public interface i extends Closeable, ByteChannel, Channel, ReadableByteChannel, WritableByteChannel {
    long a();

    i a(long j);
}
