package com.jagex;

public class Animation implements Definition {
    public static boolean aBool1977 = false;
    public static AnimationDefinitionLoader loader;
    public boolean aBool1971;
    public Class176 aClass176_1979;
    public int animatingPrecedence;
    public int anInt1990;
    public int[] anIntArray1970;
    public int[] anIntArray1986;
    public int[] anIntArray1987;
    public int[] anIntArray1988;
    public int[][] anIntArrayArray1975;
    public int[] frameDurations;
    public int[] frames;
    public int id;
    public int length = 0;
    public int loopOffset;
    public int mainhand;
    public int maxLoops;
    public int offhand;
    public int priority;
    public int replayMode;
    public boolean tweened;
    public int walkingPrecedence;
    BaseAnimationDefinitionProvider provider;
    int anInt1966;
    HashTable parameters;
    Animation(int id, BaseAnimationDefinitionProvider provider) {
        anInt1966 = 327334117;
        loopOffset = -765875327;
        priority = 81168635;
        offhand = 962054939;
        mainhand = -1387157455;
        maxLoops = -1704845783;
        animatingPrecedence = 540420525;
        walkingPrecedence = 1000351363;
        replayMode = 738630086;
        anInt1990 = 324743163;
        this.id = 813642329 * id;
        this.provider = provider;
    }

    static final void method3522(SceneNode class600_sub1, int i, boolean bool, boolean bool_27_) {
        int i_29_;
        int i_30_;
        if (class600_sub1 instanceof SceneEntity && class600_sub1 instanceof SceneObject) {
            SceneEntity class600_sub1_sub3 = (SceneEntity) class600_sub1;
            int i_31_ = class600_sub1_sub3.endX - class600_sub1_sub3.startX + 1 << 9;
            int i_32_ = class600_sub1_sub3.endY - class600_sub1_sub3.startY + 1 << 9;
            i_29_ = i_31_ / 2 + (class600_sub1_sub3.startX << 9);
            i_30_ = (class600_sub1_sub3.startY << 9) + i_32_ / 2;
        } else {
            Vector3f vector3f = class600_sub1.getCoordinateSpace().translation;
            i_29_ = (int) vector3f.x;
            i_30_ = (int) vector3f.z;
        }
        Class42.method1043(class600_sub1.plane, i_29_, i_30_, 0, i, bool, bool_27_);
    }

    @Override
    public void decode(Buffer buffer) {
        while (true) {
            int opcode = buffer.readUByte();
            if (opcode == 0) {
                break;
            }

            decode(buffer, opcode);
        }
    }

    public int getParameter(int id, int defaultValue) {
        if (null == parameters) {
            return defaultValue;
        }

        IntegerNode linkable = (IntegerNode) parameters.get(id);
        if (null == linkable) {
            return defaultValue;
        }

        return -1189875169 * linkable.value;
    }

    public String getParameter(int id, String defaultValue) {
        if (null == parameters) {
            return defaultValue;
        }

        ObjectNode linkable = (ObjectNode) parameters.get(id);
        if (null == linkable) {
            return defaultValue;
        }

        return (String) linkable.referent;
    }

    @Override
    public void method35() {
        if (animatingPrecedence * -999236133 == -1) {
            if (null != aClass176_1979 && null != aClass176_1979.aBoolArray1991) {
                animatingPrecedence = -1080841050;
            } else {
                animatingPrecedence = 0;
            }
        }

        if (walkingPrecedence * 1425418197 == -1) {
            if (aClass176_1979 != null && aClass176_1979.aBoolArray1991 != null) {
                walkingPrecedence = -2000702726;
            } else {
                walkingPrecedence = 0;
            }
        }

        if (frameDurations != null) {
            length = 0;
            for (int duration : frameDurations) {
                length += 1939299733 * duration;
            }
        }
    }

    public boolean ready() {
        if (null == frames) {
            return true;
        }

        boolean ready = true;

        for (int frame : frames) {
            if (provider.getCollection(frame >>> 16) == null) {
                ready = false;
            }
        }

        return ready;
    }

    void decode(Buffer buffer, int opcode) {
        if (opcode == 1) {
            int count = buffer.readUShort();
            frameDurations = new int[count];
            for (int index = 0; index < count; index++) {
                frameDurations[index] = buffer.readUShort();
            }

            frames = new int[count];
            for (int index = 0; index < count; index++) {
                frames[index] = buffer.readUShort();
            }

            for (int index = 0; index < count; index++) {
                frames[index] = (buffer.readUShort() << 16) + frames[index];
            }
        } else if (2 == opcode) {
            loopOffset = buffer.readUShort() * 765875327;
        } else if (opcode == 5) {
            priority = buffer.readUByte() * 16233727;
        } else if (opcode == 6) {
            offhand = buffer.readUShort() * -962054939;
        } else if (opcode == 7) {
            mainhand = buffer.readUShort() * 1387157455;
        } else if (opcode == 8) {
            maxLoops = buffer.readUByte() * -581206269;
        } else if (9 == opcode) {
            animatingPrecedence = buffer.readUByte() * -540420525;
        } else if (10 == opcode) {
            walkingPrecedence = buffer.readUByte() * -1000351363;
        } else if (opcode == 11) {
            replayMode = buffer.readUByte() * -1778168605;
        } else if (12 == opcode || opcode == 112) {
            int count;
            if (opcode == 12) {
                count = buffer.readUByte();
            } else {
                count = buffer.readUShort();
            }

            anIntArray1970 = new int[count];
            for (int index = 0; index < count; index++) {
                anIntArray1970[index] = buffer.readUShort();
            }

            for (int index = 0; index < count; index++) {
                anIntArray1970[index] = (buffer.readUShort() << 16) + anIntArray1970[index];
            }
        } else if (opcode == 13) {
            int count = buffer.readUShort();
            anIntArrayArray1975 = new int[count][];

            for (int index = 0; index < count; index++) {
                int children = buffer.readUByte();

                if (children > 0) {
                    anIntArrayArray1975[index] = new int[children];
                    anIntArrayArray1975[index][0] = buffer.readUTriByte();

                    for (int child = 1; child < children; child++) {
                        anIntArrayArray1975[index][child] = buffer.readUShort();
                    }
                }
            }
        } else if (14 == opcode) {
            aBool1971 = true;
        } else if (15 == opcode) {
            tweened = true;
        } else if (16 != opcode && opcode != 18) {
            if (opcode == 19 || opcode == 119) {
                if (anIntArray1986 == null) {
                    anIntArray1986 = new int[anIntArrayArray1975.length];

                    for (int index = 0; index < anIntArrayArray1975.length; index++) {
                        anIntArray1986[index] = 255;
                    }
                }

                int index;
                if (19 == opcode) {
                    index = buffer.readUByte();
                } else {
                    index = buffer.readUShort();
                }

                anIntArray1986[index] = buffer.readUByte();
            } else if (opcode == 20 || 120 == opcode) {
                if (anIntArray1987 == null || anIntArray1988 == null) {
                    anIntArray1987 = new int[anIntArrayArray1975.length];
                    anIntArray1988 = new int[anIntArrayArray1975.length];

                    for (int index = 0; index < anIntArrayArray1975.length; index++) {
                        anIntArray1987[index] = 256;
                        anIntArray1988[index] = 256;
                    }
                }

                int index;
                if (opcode == 20) {
                    index = buffer.readUByte();
                } else {
                    index = buffer.readUShort();
                }

                anIntArray1987[index] = buffer.readUShort();
                anIntArray1988[index] = buffer.readUShort();
            } else if (opcode == 22) {
                anInt1990 = buffer.readUByte() * -324743163;
            } else if (opcode == 23) {
                buffer.readUShort();
            } else if (opcode == 24) {
                anInt1966 = buffer.readUShort() * -327334117;
                if (provider != null) {
                    aClass176_1979 = (Class176) provider.loader.get(anInt1966 * 1014610707);
                }
            } else if (249 == opcode) {
                int count = buffer.readUByte();
                if (null == parameters) {
                    int size = HashTable.nextPowerOfTwo(count);
                    parameters = new HashTable(size);
                }

                for (int i = 0; i < count; i++) {
                    boolean string = buffer.readUByte() == 1;
                    int id = buffer.readUTriByte();
                    Node node;

                    if (string) {
                        node = new ObjectNode(buffer.readString());
                    } else {
                        node = new IntegerNode(buffer.readInt());
                    }

                    parameters.put(id, node);
                }
            }
        }
    }

}