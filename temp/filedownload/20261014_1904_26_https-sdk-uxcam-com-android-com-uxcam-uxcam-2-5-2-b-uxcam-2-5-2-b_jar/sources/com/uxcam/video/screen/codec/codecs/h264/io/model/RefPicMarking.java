package com.uxcam.video.screen.codec.codecs.h264.io.model;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/codecs/h264/io/model/RefPicMarking.class */
public class RefPicMarking {
    private Instruction[] instructions;

    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/codecs/h264/io/model/RefPicMarking$InstrType.class */
    public enum InstrType {
        REMOVE_SHORT,
        REMOVE_LONG,
        CONVERT_INTO_LONG,
        TRUNK_LONG,
        CLEAR,
        MARK_LONG
    }

    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/codecs/h264/io/model/RefPicMarking$Instruction.class */
    public static class Instruction {
        private InstrType type;
        private int arg1;
        private int arg2;

        public Instruction(InstrType instrType, int i, int i2) {
            this.type = instrType;
            this.arg1 = i;
            this.arg2 = i2;
        }

        public InstrType getType() {
            return this.type;
        }

        public int getArg1() {
            return this.arg1;
        }

        public int getArg2() {
            return this.arg2;
        }
    }

    public RefPicMarking(Instruction[] instructionArr) {
        this.instructions = instructionArr;
    }

    public Instruction[] getInstructions() {
        return this.instructions;
    }
}
