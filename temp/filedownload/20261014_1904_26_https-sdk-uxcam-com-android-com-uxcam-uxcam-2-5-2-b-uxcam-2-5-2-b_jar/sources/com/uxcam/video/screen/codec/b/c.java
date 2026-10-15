package com.uxcam.video.screen.codec.b;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/b/c.class */
public final class c implements i {
    private FileChannel a;

    public c(FileChannel fileChannel) {
        this.a = fileChannel;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        return this.a.read(byteBuffer);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        this.a.close();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        return this.a.write(byteBuffer);
    }

    @Override // com.uxcam.video.screen.codec.b.i
    public final long a() {
        return this.a.position();
    }

    @Override // com.uxcam.video.screen.codec.b.i
    public final i a(long j) {
        this.a.position(j);
        return this;
    }
}
