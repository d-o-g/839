package com.jagex;

import java.io.EOFException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public final class Varcs extends HashedVariableCollection {

    static final int anInt8689 = 1;
    public static VarDefinitionLoader varcLoader; //renamed from VarpDefinitionLoader, since it's also used for other var types like varcs

    public long aLong8687 = 1919865964466079015L;
    public boolean aBool8692 = false;
    long updateTime = -956803499012045599L;
    Set<Integer> ids;
    boolean aBool8688;
    int anInt8690;
    DefaultMapEntry[] entries;
    VarcType[] types;

    public Varcs(DefaultProvidingVarpLoader loader) {
        super(loader);

        types = new VarcType[loader.count()];
        for (int index = 0; index < loader.count(); index++) {
            types[index] = loader.get(index).aVarc_1514Type;
        }

        ids = new HashSet<>(loader.count());
    }

    public static void method14046(String string, int i) {
        if (6 == -1501875989 * Client.connectionState) {
            OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4007,
                    Client.lobbyConnection.encryptor);
            frame.payload.writeShort(0);
            int start = -165875887 * frame.payload.caret;
            frame.payload.writeCString(string);
            frame.payload.caret += 217060311;
            frame.payload.encodeXtea(Class34.anIntArray447, start, frame.payload.caret * -165875887);
            frame.payload.writeSizeShort(frame.payload.caret * -165875887 - start, 64776330);
            Client.lobbyConnection.sendFrame(frame);
            Class34.aClass637_448 = Class637.aClass637_8133;
        }
    }

    /**
     * Writes the varcs to the server
     */
    public void writeFrame() {
        if (TimeUtil.time() >= updateTime * -7831315304988999457L) {
            if (entries == null) {
                if (!aBool8688) {
                    return;
                }

                entries = new DefaultMapEntry[ids.size()];
                int i = 0;
                for (int id : ids) {
                    entries[i++] = new DefaultMapEntry(id, map.getOrDefaultObject(id));
                }

                anInt8690 = 0;
                aBool8688 = false;
                ids.clear();
            }

            if (entries != null && anInt8690 * 644319277 < entries.length) {
                BufferedConnectionContext connection = Client.getActiveConnection();
                if (381339389 * connection.buffered <= 1200) {
                    OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.WRITE_VARCS, connection.encryptor);
                    frame.payload.writeShort(0);
                    int start = -165875887 * frame.payload.caret;
                    frame.payload.caret += 1258142129;
                    while (anInt8690 * 644319277 < entries.length) {
                        DefaultMapEntry entry = entries[anInt8690 * 644319277];
                        if (frame.payload.caret * -165875887 + connection.buffered * 381339389 + varcLoader.getEncodedSize(entry) > 1500) {
                            break;
                        }

                        varcLoader.encode(frame.payload, entry);
                        anInt8690 += -2143549531;
                    }

                    frame.payload.writeSizeShort(frame.payload.caret * -165875887 - start, 128940071);

                    if (anInt8690 * 644319277 >= entries.length) {
                        frame.payload.payload[start] = (byte) 1;
                    } else {
                        frame.payload.payload[start] = (byte) 0;
                    }

                    connection.sendFrame(frame);
                    updateTime = (TimeUtil.time() + 1000L) * 956803499012045599L;
                }
            }
        }
    }

    public void reset() {
        for (int i = 0; i < types.length; i++) {
            if (types[i] == VarcType.aVarcType_4652 || types[i] == VarcType.aVarcType_4653) {
                map.remove(i);
            }
        }

        ids.clear();
        aBool8688 = false;
        entries = null;
        updateTime = -956803499012045599L;
    }

    public void readFromFile(DiskFile file) {
        try {
            byte[] input = new byte[(int) file.length()];
            int delta;
            for (int offset = 0; offset < input.length; offset += delta) {
                delta = file.read(input, offset, input.length - offset);
                if (delta == -1) {
                    throw new EOFException();
                }
            }

            Buffer buffer = new Buffer(input);
            if (buffer.payload.length - buffer.caret * -165875887 < 1) {
                file.close();
                return;
            }

            int type = buffer.readUByte();
            if (type < 0 || type > 1) {
                file.close();
                return;
            }

            if (buffer.payload.length - buffer.caret * -165875887 < 2) {
                file.close();
                return;
            }

            int size = buffer.readUShort();
            if (buffer.payload.length - buffer.caret * -165875887 < 6 * size) {
                file.close();
                return;
            }

            for (int i = 0; i < size; i++) {
                DefaultMapEntry entry = varcLoader.decode(buffer);
                if (VarcType.PERSISTENT_INTEGER == types[entry.key * 1960527763]
                        && varcLoader.get(entry.key * 1960527763).keyType.getValueType().classType.isAssignableFrom(entry.value.getClass())) {
                    map.put(entry.key * 1960527763, entry.value);
                }
            }
        } catch (Exception exception) {
            try {
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }

        try {
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void method14034() {
        if (entries != null && anInt8690 * 644319277 >= entries.length) {
            entries = null;
            anInt8690 = 0;
        }
    }

    public void method14038() {
        anInt8690 = 0;
    }

    public void method14041(DiskFile class670, byte i) {
        try {
            try {
                int i_12_ = 3;
                int i_13_ = 0;
                for (DefaultMapEntry class383 : map) {
                    if (types[class383.key * 1960527763] == VarcType.PERSISTENT_INTEGER) {
                        i_12_ += varcLoader.getEncodedSize(class383);
                        i_13_++;
                    }
                }
                Buffer buffer = new Buffer(i_12_);
                buffer.writeByte(1);
                buffer.writeShort(i_13_);

                for (DefaultMapEntry class383 : map) {
                    if (types[1960527763 * class383.key] == VarcType.PERSISTENT_INTEGER) {
                        varcLoader.encode(buffer, class383);
                    }
                }
                class670.write(buffer.payload, 0, -165875887 * buffer.caret);
            } catch (Exception exception) {
                try {
                    class670.close();
                } catch (Exception exception_15_) {
                    exception = exception_15_;
                }
                return;
            }
            try {
                class670.close();
            } catch (Exception exception) {

            }
        } catch (Exception object) {
            try {
                class670.close();
            } catch (Exception exception) {

            }
        }
        aLong8687 = TimeUtil.time() * -1919865964466079015L;
        aBool8692 = false;
    }

    @Override
    public void setIntVarp(Varp parameter, int value) {
        if (types[169834903 * parameter.index] == VarcType.PERSISTENT_INTEGER) {
            aBool8692 = true;
        } else if (types[parameter.index * 169834903] == VarcType.aVarcType_4653
                && getVarpValue(parameter) != value) {
            aBool8688 = true;
            ids.add(parameter.index * 169834903);
        }
        super.setIntVarp(parameter, value);
    }

    @Override
    public void setStringVarp(Varp parameter, Object object) {
        if (types[169834903 * parameter.index] == VarcType.PERSISTENT_INTEGER) {
            aBool8692 = true;
        } else if (types[169834903 * parameter.index] == VarcType.aVarcType_4653) {
            if (object instanceof String) {
                String string = (String) object;
                if (string.length() > 80) {
                    object = string.substring(0, 80);
                }
            }

            Object object_4_ = getStringVarpValue(parameter);
            if (object != null && object_4_ != null && !object.equals(object_4_)) {
                aBool8688 = true;
                ids.add(parameter.index * 169834903);
            } else if (object_4_ == null != (null == object)) {
                aBool8688 = true;
                ids.add(parameter.index * 169834903);
            }
        }

        super.setStringVarp(parameter, object);
    }

    @Override
    public void setLongVarp(Varp parameter, long value) {
        if (types[169834903 * parameter.index] == VarcType.PERSISTENT_INTEGER) {
            aBool8692 = true;
        } else if (types[parameter.index * 169834903] == VarcType.aVarcType_4653
                && getLongVarpValue(parameter) != value) {
            aBool8688 = true;
            ids.add(169834903 * parameter.index);
        }

        super.setLongVarp(parameter, value);
    }
}