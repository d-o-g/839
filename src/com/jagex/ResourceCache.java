package com.jagex;

import java.io.EOFException;
import java.io.IOException;

public final class ResourceCache {

    static byte[] buffer = new byte[520];

    private final int offset; //2000000 if not native, 8000000 if native
    private final int id;

    BufferedFile index;
    BufferedFile data = null;

    public ResourceCache(int id, BufferedFile data, BufferedFile index, int offset) {
        this.id = -1302912469 * id;
        this.data = data;
        this.index = index;
        this.offset = 1602294053 * offset;
    }

    public byte[] read(int i) {
        synchronized (data) {
            byte[] is;
            try {
                if (index.method13554(317271712) < 6 * i + 6) {
                    return null;
                }
                index.seek(6 * i);
                index.read(buffer, 0, 6);
                int i_2_ = ((buffer[0] & 0xff) << 16) + ((buffer[1] & 0xff) << 8) + (buffer[2] & 0xff);
                int i_3_ = (buffer[5] & 0xff) + ((buffer[4] & 0xff) << 8) + ((buffer[3] & 0xff) << 16);
                if (i_2_ < 0 || i_2_ > 1691787949 * offset) {
                    return null;
                }
                if (i_3_ <= 0 || i_3_ > data.method13554(317271712) / 520L) {
                    return null;
                }
                byte[] is_6_ = new byte[i_2_];
                int i_7_ = 0;
                int i_8_ = 0;
                while (i_7_ < i_2_) {
                    if (i_3_ == 0) {
                        return null;
                    }
                    data.seek(i_3_ * 520L);
                    int i_10_ = i_2_ - i_7_;
                    int i_11_;
                    int i_12_;
                    int i_13_;
                    int i_14_;
                    int i_15_;
                    if (i > 65535) {
                        if (i_10_ > 510) {
                            i_10_ = 510;
                        }
                        i_11_ = 10;
                        data.read(buffer, 0, i_11_ + i_10_);
                        i_12_ = ((buffer[2] & 0xff) << 8) + ((buffer[1] & 0xff) << 16) + ((buffer[0] & 0xff) << 24)
                                + (buffer[3] & 0xff);
                        i_13_ = ((buffer[4] & 0xff) << 8) + (buffer[5] & 0xff);
                        i_14_ = (buffer[8] & 0xff) + ((buffer[7] & 0xff) << 8) + ((buffer[6] & 0xff) << 16);
                        i_15_ = buffer[9] & 0xff;
                    } else {
                        if (i_10_ > 512) {
                            i_10_ = 512;
                        }
                        i_11_ = 8;
                        data.read(buffer, 0, i_10_ + i_11_);
                        i_12_ = (buffer[1] & 0xff) + ((buffer[0] & 0xff) << 8);
                        i_13_ = (buffer[3] & 0xff) + ((buffer[2] & 0xff) << 8);
                        i_14_ = (buffer[6] & 0xff) + ((buffer[5] & 0xff) << 8) + ((buffer[4] & 0xff) << 16);
                        i_15_ = buffer[7] & 0xff;
                    }
                    if (i != i_12_ || i_13_ != i_8_ || i_15_ != id * 1496222851) {
                        return null;
                    }
                    if (i_14_ < 0 || i_14_ > data.method13554(317271712) / 520L) {
                        return null;
                    }
                    int i_18_ = i_10_ + i_11_;
                    for (int i_19_ = i_11_; i_19_ < i_18_; i_19_++) {
                        is_6_[i_7_++] = buffer[i_19_];
                    }
                    i_3_ = i_14_;
                    i_8_++;
                }
                is = is_6_;
            } catch (IOException ioexception) {
                return null;
            }
            return is;
        }
    }

    public boolean write(byte[] is, int i, int i_21_) {
        synchronized (data) {
            if (i_21_ < 0 || i_21_ > 1691787949 * offset) {
                throw new IllegalArgumentException(new StringBuilder().append(1496222851 * id)
                        .append(',').append(i).append(',').append(i_21_).toString());
            }
            boolean bool = write(i, is, i_21_, true, -1366483542);
            if (!bool) {
                bool = write(i, is, i_21_, false, -304326257);
            }
            return bool;
        }
    }

    @Override
    public String toString() {
        return new StringBuilder().append(1496222851 * id).toString();
    }

    boolean write(int i, byte[] is, int i_24_, boolean bool, int i_25_) {
        synchronized (data) {
            boolean bool_26_;
            try {
                int i_27_;
                if (bool) {
                    if (index.method13554(317271712) < i * 6 + 6) {
                        return false;
                    }
                    index.seek(i * 6);
                    index.read(buffer, 0, 6);
                    i_27_ = ((buffer[3] & 0xff) << 16) + ((buffer[4] & 0xff) << 8) + (buffer[5] & 0xff);
                    if (i_27_ <= 0 || i_27_ > data.method13554(317271712) / 520L) {
                        return false;
                    }
                } else {
                    i_27_ = (int) ((data.method13554(317271712) + 519L) / 520L);
                    if (0 == i_27_) {
                        i_27_ = 1;
                    }
                }
                buffer[0] = (byte) (i_24_ >> 16);
                buffer[1] = (byte) (i_24_ >> 8);
                buffer[2] = (byte) i_24_;
                buffer[3] = (byte) (i_27_ >> 16);
                buffer[4] = (byte) (i_27_ >> 8);
                buffer[5] = (byte) i_27_;
                index.seek(6 * i);
                index.write(buffer, 0, 6);
                int i_30_ = 0;
                int i_31_ = 0;
                while (i_30_ < i_24_) {
                    int i_32_ = 0;
                    if (bool) {
                        data.seek(520L * i_27_);
                        int i_33_;
                        int i_34_;
                        int i_35_;
                        if (i > 65535) {
                            try {
                                data.read(buffer, 0, 10);
                            } catch (EOFException eofexception) {
                                break;
                            }
                            i_33_ = ((buffer[1] & 0xff) << 16) + ((buffer[0] & 0xff) << 24) + ((buffer[2] & 0xff) << 8)
                                    + (buffer[3] & 0xff);
                            i_34_ = (buffer[5] & 0xff) + ((buffer[4] & 0xff) << 8);
                            i_32_ = (buffer[8] & 0xff) + ((buffer[6] & 0xff) << 16) + ((buffer[7] & 0xff) << 8);
                            i_35_ = buffer[9] & 0xff;
                        } else {
                            try {
                                data.read(buffer, 0, 8);
                            } catch (EOFException eofexception) {
                                break;
                            }
                            i_33_ = (buffer[1] & 0xff) + ((buffer[0] & 0xff) << 8);
                            i_34_ = ((buffer[2] & 0xff) << 8) + (buffer[3] & 0xff);
                            i_32_ = (buffer[6] & 0xff) + ((buffer[5] & 0xff) << 8) + ((buffer[4] & 0xff) << 16);
                            i_35_ = buffer[7] & 0xff;
                        }
                        if (i != i_33_ || i_31_ != i_34_ || i_35_ != id * 1496222851) {
                            return false;
                        }
                        if (i_32_ < 0 || i_32_ > data.method13554(317271712) / 520L) {
                            return false;
                        }
                    }
                    if (0 == i_32_) {
                        bool = false;
                        i_32_ = (int) ((data.method13554(317271712) + 519L) / 520L);
                        if (i_32_ == 0) {
                            i_32_++;
                        }
                        if (i_32_ == i_27_) {
                            i_32_++;
                        }
                    }
                    if (i > 65535) {
                        if (i_24_ - i_30_ <= 510) {
                            i_32_ = 0;
                        }
                        buffer[0] = (byte) (i >> 24);
                        buffer[1] = (byte) (i >> 16);
                        buffer[2] = (byte) (i >> 8);
                        buffer[3] = (byte) i;
                        buffer[4] = (byte) (i_31_ >> 8);
                        buffer[5] = (byte) i_31_;
                        buffer[6] = (byte) (i_32_ >> 16);
                        buffer[7] = (byte) (i_32_ >> 8);
                        buffer[8] = (byte) i_32_;
                        buffer[9] = (byte) (id * 1496222851);
                        data.seek(i_27_ * 520L);
                        data.write(buffer, 0, 10);
                        int i_38_ = i_24_ - i_30_;
                        if (i_38_ > 510) {
                            i_38_ = 510;
                        }
                        data.write(is, i_30_, i_38_);
                        i_30_ += i_38_;
                    } else {
                        if (i_24_ - i_30_ <= 512) {
                            i_32_ = 0;
                        }
                        buffer[0] = (byte) (i >> 8);
                        buffer[1] = (byte) i;
                        buffer[2] = (byte) (i_31_ >> 8);
                        buffer[3] = (byte) i_31_;
                        buffer[4] = (byte) (i_32_ >> 16);
                        buffer[5] = (byte) (i_32_ >> 8);
                        buffer[6] = (byte) i_32_;
                        buffer[7] = (byte) (1496222851 * id);
                        data.seek(i_27_ * 520L);
                        data.write(buffer, 0, 8);
                        int i_39_ = i_24_ - i_30_;
                        if (i_39_ > 512) {
                            i_39_ = 512;
                        }
                        data.write(is, i_30_, i_39_);
                        i_30_ += i_39_;
                    }
                    i_27_ = i_32_;
                    i_31_++;
                }
                bool_26_ = true;
            } catch (IOException ioexception) {
                return false;
            }
            return bool_26_;
        }
    }
}
