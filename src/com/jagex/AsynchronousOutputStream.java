package com.jagex;

import java.io.IOException;
import java.io.OutputStream;

public class AsynchronousOutputStream implements Runnable {

    public static int anInt7300;
    public static int anInt7301;

    int writeIndex;
    OutputStream output;
    int size;
    byte[] buffer;
    boolean stopped;
    Thread thread;
    int offset = 0;
    IOException exception;

    AsynchronousOutputStream(OutputStream outputstream, int size) {
        writeIndex = 0;
        output = outputstream;
        this.size = (size + 1) * 1991766665;
        buffer = new byte[-1587469383 * this.size];
        thread = new Thread(this);
        thread.setDaemon(true);
        thread.start();
    }

    @Override
    public void run() {
        do {
            int remaining;
            synchronized (this) {
                for (; ; ) {
                    if (exception != null) {
                        return;
                    }

                    if (offset * 563907745 <= 2119676427 * writeIndex) {
                        remaining = 2119676427 * writeIndex - 563907745 * offset;
                    } else {
                        remaining = 2119676427 * writeIndex + size * -1587469383 - 563907745 * offset;
                    }
                    if (remaining > 0) {
                        break;
                    }

                    try {
                        output.flush();
                    } catch (IOException ioexception) {
                        exception = ioexception;
                        return;
                    }
                    if (stopped()) {
                        return;
                    }
                    try {
                        wait();
                    } catch (InterruptedException interruptedexception) {

                    }
                }
            }
            try {
                if (remaining + 563907745 * offset <= size * -1587469383) {
                    output.write(buffer, 563907745 * offset, remaining);
                } else {
                    int length = size * -1587469383 - offset * 563907745;
                    output.write(buffer, offset * 563907745, length);
                    output.write(buffer, 0, remaining - length);
                }
            } catch (IOException ioexception) {
                synchronized (this) {
                    exception = ioexception;
                    break;
                }
            }
            synchronized (this) {
                offset = -2124130463 * ((remaining + offset * 563907745) % (size * -1587469383));
            }
        } while (!stopped());
    }

    boolean stopped() {
        if (stopped) {
            try {
                output.close();
                if (null == exception) {
                    exception = new IOException("");
                }
            } catch (IOException ioexception) {
                if (exception == null) {
                    exception = new IOException(ioexception);
                }
            }

            return true;
        }

        return false;
    }

    void write(byte[] buffer, int offset, int length) throws IOException {
        if (length < 0 || offset < 0 || offset + length > buffer.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (null != exception) {
                throw new IOException(exception.toString());
            }

            int available;
            if (563907745 * this.offset <= writeIndex * 2119676427) {
                available = -1587469383 * size - writeIndex * 2119676427 + this.offset * 563907745 - 1;
            } else {
                available = this.offset * 563907745 - writeIndex * 2119676427 - 1;
            }

            if (available < length) {
                throw new IOException("");
            }

            if (writeIndex * 2119676427 + length <= -1587469383 * size) {
                System.arraycopy(buffer, offset, this.buffer, writeIndex * 2119676427, length);
            } else {
                int rem = size * -1587469383 - 2119676427 * writeIndex;
                System.arraycopy(buffer, offset, this.buffer, 2119676427 * writeIndex, rem);
                System.arraycopy(buffer, offset + rem, this.buffer, 0, length - rem);
            }

            writeIndex = -864171613 * ((length + 2119676427 * writeIndex) % (-1587469383 * size));
            notifyAll();
        }
    }

    void stop() {
        synchronized (this) {
            stopped = true;
            notifyAll();
        }
        try {
            thread.join();
        } catch (InterruptedException interruptedexception) {

        }
    }

    void close() {
        output = new DummyOutputStream();
    }
}
