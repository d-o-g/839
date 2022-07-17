package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;

public class Class566 implements Iterable {

    SkillLevel[] skillLevels;

    public Class566(Archive defaults) {
        method9569(defaults.get(Class577.aClass577_7730.file * -1881625811));
    }

    public static Class636 method9573(int i) {
        if (null == Class34.aClass636_454) {
            return Class636.aClass636_8123;
        }
        return Class34.aClass636_454;
    }

    static void method9574(BitBuffer buffer) {
        boolean bool = buffer.readUByte() == 1;
        if (bool) {
            int i_11_ = buffer.readOpcode() << 24;
            i_11_ |= buffer.readOpcode() << 16;
            i_11_ |= buffer.readOpcode() << 8;
            i_11_ |= buffer.readOpcode();
            SkyboxDefinition.aClass55_7012.put(Class298_Sub1.aLong9722 * -4578638200598135289L, i_11_);
        }
    }

    @Override
    public Iterator iterator() {
        return new Class581(skillLevels);
    }

    public int method9564() {
        return skillLevels.length;
    }

    public SkillLevel method9565(int i) {
        return skillLevels[i];
    }

    void method9561() {
        skillLevels = null;
    }

    void method9563(Buffer buffer) {
        while (true) {
            int opcode = buffer.readUByte();
            if (opcode == 0) {
                break;
            }

            if (opcode == 1) {
                int count = buffer.readUByte();
                int maxInex = 0;
                LinkedList<SkillLevel> list = new LinkedList<>();

                for (int i = 0; i < count; i++) {
                    int index = buffer.readUByte();
                    int i_5_ = buffer.readUShort(); // ??
                    int attributes = buffer.readUByte();
                    boolean bool = (attributes & 0x1) != 0;

                    int level = 0;
                    if ((attributes & 0x2) != 0) {
                        level = buffer.readUByte();
                    }

                    buffer.readUByte();
                    list.add(new SkillLevel(index, i_5_, bool, level));
                    if (index > maxInex) {
                        maxInex = index;
                    }
                }

                skillLevels = new SkillLevel[1 + maxInex];

                for (SkillLevel lvl : list) {
                    skillLevels[lvl.getIndex()] = lvl;
                }
            }
        }
    }

    void method9569(byte[] data) {
        method9561();
        if (data == null) {
            skillLevels = new SkillLevel[0];
        } else {
            method9563(new Buffer(data));
        }
    }

}