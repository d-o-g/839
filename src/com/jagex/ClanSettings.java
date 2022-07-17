package com.jagex;

public class ClanSettings {

    public static final byte aByte3196 = -1;
    static final byte aByte3204 = 0;
    static final byte OWNER = 127;
    static final byte aByte3224 = 125;
    static final byte aByte3226 = 126;
    static final int anInt3205 = 6;

    public boolean[] aBoolArray3214;
    public boolean allowGuests;

    public byte[] memberRanks;
    public byte talkRank;
    public byte kickRank;
    public byte lootshareRank;
    public byte aByte3200;

    public int[] anIntArray3213;
    public int currentOwner;
    public int memberCount;
    public int banCount;
    public int replacementOwner;

    public String[] memberNames;
    public String[] bannedUserNames;
    public String clanName;

    boolean useHashes;
    boolean useNames;

    int[] varps;
    int[] memberIndices;
    int anInt3203;
    int updateCount = 0;

    long[] bannedUserHashes;
    long[] memberHashes;
    long hash;

    HashTable<Node> parameters;

    public ClanSettings(Buffer buffer) {
        currentOwner = -1739916833;
        replacementOwner = 938588091;
        decode(buffer);
    }

    public Integer getIntVariable(int id) {
        if (parameters == null) {
            return null;
        }

        Node current = parameters.get(id);
        if (!(current instanceof IntegerNode)) {
            return null;
        }

        return ((IntegerNode) current).value * -1189875169;
    }

    public Long getLongVariable(int id) {
        if (parameters == null) {
            return null;
        }

        Node current = parameters.get(id);
        if (!(current instanceof LongNode)) {
            return null;
        }

        return ((LongNode) current).value * -8280988991890543191L;
    }

    public int[] getMemberIndices() {
        if (memberIndices == null) {
            String[] strings = new String[1660153155 * memberCount];
            memberIndices = new int[memberCount * 1660153155];

            for (int index = 0; index < 1660153155 * memberCount; index++) {
                strings[index] = memberNames[index];
                if (strings[index] != null) {
                    strings[index] = strings[index].toLowerCase();
                }

                memberIndices[index] = index;
            }

            ArrayUtils.sort(strings, memberIndices);
        }

        return memberIndices;
    }

    public String getStringVariable(int id) {
        if (parameters == null) {
            return null;
        }

        Node current = parameters.get(id);
        if (!(current instanceof ObjectNode)) {
            return null;
        }

        return (String) ((ObjectNode) current).referent;
    }

    public int indexOf(String string) {
        if (string == null || string.length() == 0) {
            return -1;
        }

        for (int index = 0; index < memberCount * 1660153155; index++) {
            if (memberNames[index].equals(string)) {
                return index;
            }
        }

        return -1;
    }

    public int method5307(int id, int shift, int end) {
        int mask = end == 31 ? -1 : (1 << 1 + end) - 1;
        return (varps[id] & mask) >>> shift;
    }

    void addMember(long hash, String name, int i) {
        if (name != null && name.length() == 0) {
            name = null;
        }

        if (useHashes != hash > 0L) {
            throw new RuntimeException("");
        }

        if (useNames == (name == null)) {
            throw new RuntimeException("");
        }

        if (hash > 0L && (memberHashes == null || memberCount * 1660153155 >= memberHashes.length)
                || name != null && (memberNames == null || memberCount * 1660153155 >= memberNames.length)) {
            growMemberList(memberCount * 1660153155 + 5);
        }

        if (memberHashes != null) {
            memberHashes[memberCount * 1660153155] = hash;
        }

        if (memberNames != null) {
            memberNames[memberCount * 1660153155] = name;
        }

        if (currentOwner * -369623583 == -1) {
            currentOwner = memberCount * 778053539;
            memberRanks[memberCount * 1660153155] = (byte) 126;
        } else {
            memberRanks[memberCount * 1660153155] = (byte) 0;
        }

        varps[memberCount * 1660153155] = 0;
        anIntArray3213[memberCount * 1660153155] = i;
        aBoolArray3214[memberCount * 1660153155] = false;
        memberCount += -859502741;
        memberIndices = null;
    }

    void ban(long hash, String string) {
        if (string != null && string.length() == 0) {
            string = null;
        }

        if (useHashes != hash > 0L) {
            throw new RuntimeException("");
        } else if (useNames == (string == null)) {
            throw new RuntimeException("");
        }

        if (hash > 0L && (bannedUserHashes == null || banCount * -1617114583 >= bannedUserHashes.length)
                || string != null && (bannedUserNames == null || banCount * -1617114583 >= bannedUserNames.length)) {
            growBanList(banCount * -1617114583 + 5);
        }

        if (bannedUserHashes != null) {
            bannedUserHashes[banCount * -1617114583] = hash;
        }

        if (null != bannedUserNames) {
            bannedUserNames[banCount * -1617114583] = string;
        }

        banCount += -2087030247;
    }

    void decode(Buffer buffer) {
        int version = buffer.readUByte();
        if (version < 1 || version > 6) {
            throw new RuntimeException("" + version);
        }

        int attributes = buffer.readUByte();
        if ((attributes & 0x1) != 0) {
            useHashes = true;
        }

        if ((attributes & 0x2) != 0) {
            useNames = true;
        }

        if (!useHashes) {
            memberHashes = null;
            bannedUserHashes = null;
        }

        if (!useNames) {
            memberNames = null;
            bannedUserNames = null;
        }

        updateCount = buffer.readInt() * 1624717791;
        anInt3203 = buffer.readInt() * -177746211;
        if (version <= 3 && anInt3203 * 1634236789 != 0) {
            anInt3203 += -1067976928;
        }

        memberCount = buffer.readUShort() * -859502741;
        banCount = buffer.readUByte() * -2087030247;
        clanName = buffer.readString();
        if (version >= 4) {
            buffer.readInt();
        }

        allowGuests = buffer.readUByte() == 1;
        talkRank = buffer.readByte();
        kickRank = buffer.readByte();
        lootshareRank = buffer.readByte();
        aByte3200 = buffer.readByte();

        if (memberCount * 1660153155 > 0) {
            if (useHashes && (memberHashes == null || memberHashes.length < memberCount * 1660153155)) {
                memberHashes = new long[memberCount * 1660153155];
            }

            if (useNames && (memberNames == null || memberNames.length < 1660153155 * memberCount)) {
                memberNames = new String[memberCount * 1660153155];
            }

            if (memberRanks == null || memberRanks.length < memberCount * 1660153155) {
                memberRanks = new byte[memberCount * 1660153155];
            }

            if (varps == null || varps.length < 1660153155 * memberCount) {
                varps = new int[memberCount * 1660153155];
            }

            if (anIntArray3213 == null || anIntArray3213.length < memberCount * 1660153155) {
                anIntArray3213 = new int[memberCount * 1660153155];
            }

            if (aBoolArray3214 == null || aBoolArray3214.length < memberCount * 1660153155) {
                aBoolArray3214 = new boolean[memberCount * 1660153155];
            }

            for (int index = 0; index < memberCount * 1660153155; index++) {
                if (useHashes) {
                    memberHashes[index] = buffer.readLong();
                }

                if (useNames) {
                    memberNames[index] = buffer.readStringFast();
                }

                memberRanks[index] = buffer.readByte();
                if (version >= 2) {
                    varps[index] = buffer.readInt();
                }

                if (version >= 5) {
                    anIntArray3213[index] = buffer.readUShort();
                } else {
                    anIntArray3213[index] = 0;
                }

                if (version >= 6) {
                    aBoolArray3214[index] = buffer.readUByte() == 1;
                } else {
                    aBoolArray3214[index] = false;
                }
            }

            updateOwners();
        }

        if (banCount * -1617114583 > 0) {
            if (useHashes && (bannedUserHashes == null || bannedUserHashes.length < banCount * -1617114583)) {
                bannedUserHashes = new long[banCount * -1617114583];
            }

            if (useNames && (bannedUserNames == null || bannedUserNames.length < banCount * -1617114583)) {
                bannedUserNames = new String[banCount * -1617114583];
            }

            for (int index = 0; index < -1617114583 * banCount; index++) {
                if (useHashes) {
                    bannedUserHashes[index] = buffer.readLong();
                }

                if (useNames) {
                    bannedUserNames[index] = buffer.readStringFast();
                }
            }
        }

        if (version >= 3) {
            int size = buffer.readUShort();

            if (size > 0) {
                parameters = new HashTable<>(size < 16 ? HashTable.nextPowerOfTwo(size) : 16);

                while (size-- > 0) {
                    int packed = buffer.readInt();
                    int key = packed & 0x3fffffff;
                    int type = packed >>> 30;

                    if (0 == type) {
                        int value = buffer.readInt();
                        parameters.put(key, new IntegerNode(value));
                    } else if (type == 1) {
                        long value = buffer.readLong();
                        parameters.put(key, new LongNode(value));
                    } else if (2 == type) {
                        String value = buffer.readString();
                        parameters.put(key, new ObjectNode<String>(value));
                    }
                }
            }
        }
    }

    void deleteMember(int index) {
        if (index < 0 || index >= memberCount * 1660153155) {
            throw new RuntimeException("");
        }

        memberCount -= -859502741;
        memberIndices = null;

        if (memberCount * 1660153155 == 0) {
            memberHashes = null;
            memberNames = null;
            memberRanks = null;
            varps = null;
            anIntArray3213 = null;
            aBoolArray3214 = null;

            currentOwner = -1739916833;
            replacementOwner = 938588091;
        } else {
            System.arraycopy(memberRanks, index + 1, memberRanks, index, memberCount * 1660153155 - index);
            System.arraycopy(varps, index + 1, varps, index, memberCount * 1660153155 - index);
            System.arraycopy(anIntArray3213, index + 1, anIntArray3213, index, memberCount * 1660153155 - index);
            System.arraycopy(aBoolArray3214, index + 1, aBoolArray3214, index, memberCount * 1660153155 - index);

            if (null != memberHashes) {
                System.arraycopy(memberHashes, index + 1, memberHashes, index, memberCount * 1660153155 - index);
            }

            if (null != memberNames) {
                System.arraycopy(memberNames, index + 1, memberNames, index, memberCount * 1660153155 - index);
            }

            updateOwners();
        }
    }

    void growBanList(int size) {
        if (useHashes) {
            if (bannedUserHashes != null) {
                System.arraycopy(bannedUserHashes, 0, bannedUserHashes = new long[size], 0, banCount * -1617114583);
            } else {
                bannedUserHashes = new long[size];
            }
        }

        if (useNames) {
            if (null != bannedUserNames) {
                System.arraycopy(bannedUserNames, 0, bannedUserNames = new String[size], 0, banCount * -1617114583);
            } else {
                bannedUserNames = new String[size];
            }
        }
    }

    void growMemberList(int size) {
        if (useHashes) {
            if (memberHashes != null) {
                System.arraycopy(memberHashes, 0, memberHashes = new long[size], 0, memberCount * 1660153155);
            } else {
                memberHashes = new long[size];
            }
        }

        if (useNames) {
            if (null != memberNames) {
                System.arraycopy(memberNames, 0, memberNames = new String[size], 0, memberCount * 1660153155);
            } else {
                memberNames = new String[size];
            }
        }

        if (memberRanks != null) {
            System.arraycopy(memberRanks, 0, memberRanks = new byte[size], 0, memberCount * 1660153155);
        } else {
            memberRanks = new byte[size];
        }

        if (varps != null) {
            System.arraycopy(varps, 0, varps = new int[size], 0, memberCount * 1660153155);
        } else {
            varps = new int[size];
        }

        if (null != anIntArray3213) {
            System.arraycopy(anIntArray3213, 0, anIntArray3213 = new int[size], 0, memberCount * 1660153155);
        } else {
            anIntArray3213 = new int[size];
        }

        if (aBoolArray3214 != null) {
            System.arraycopy(aBoolArray3214, 0, aBoolArray3214 = new boolean[size], 0, memberCount * 1660153155);
        } else {
            aBoolArray3214 = new boolean[size];
        }
    }

    int method5318(int index, boolean bool) {
        if (bool == aBoolArray3214[index]) {
            return -1;
        }

        aBoolArray3214[index] = bool;
        return index;
    }

    int method5352(int id, int value, int start, int end) {
        int startMask = (1 << start) - 1;
        int endMask = end == 31 ? -1 : (1 << 1 + end) - 1;
        int mask = endMask ^ startMask;
        value <<= start;
        value &= mask;

        int current = varps[id];
        if ((current & mask) == value) {
            return -1;
        }

        current &= ~mask;
        varps[id] = current | value;
        return id;
    }

    boolean setIntVariable(int id, int value) {
        if (parameters != null) {
            Node current = parameters.get(id);
            if (current != null) {
                if (current instanceof IntegerNode) {
                    IntegerNode linkable = (IntegerNode) current;

                    if (value == linkable.value * -1189875169) {
                        return false;
                    }

                    linkable.value = value * -1975318049;
                    return true;
                }

                current.unlink();
            }
        } else {
            parameters = new HashTable<>(4);
        }

        parameters.put(id, new IntegerNode(value));
        return true;
    }

    boolean setLongVariable(int id, long value) {
        if (parameters != null) {
            Node current = parameters.get(id);
            if (current != null) {
                if (current instanceof LongNode) {
                    LongNode linkable = (LongNode) current;

                    if (linkable.value * -8280988991890543191L == value) {
                        return false;
                    }
                    linkable.value = value * 5662570005588035225L;
                    return true;
                }

                current.unlink();
            }
        } else {
            parameters = new HashTable<>(4);
        }

        parameters.put(id, new LongNode(value));
        return true;
    }

    int setRank(int index, byte rank) {
        if (rank == 126 || rank == 127) {
            return -1;
        }

        if (currentOwner * -369623583 == index && (replacementOwner * 1405717133 == -1 || memberRanks[replacementOwner * 1405717133] < 125)) {
            return -1;
        } else if (rank == memberRanks[index]) {
            return -1;
        }

        memberRanks[index] = rank;
        updateOwners();
        return index;
    }

    boolean setStringVariable(int id, String string) {
        if (string == null) {
            string = "";
        } else if (string.length() > 80) {
            string = string.substring(0, 80);
        }

        if (parameters != null) {
            Node current = parameters.get(id);
            if (current != null) {
                if (current instanceof ObjectNode) {
                    ObjectNode linkable = (ObjectNode) current;

                    if (linkable.referent instanceof String) {
                        if (string.equals(linkable.referent)) {
                            return false;
                        }

                        linkable.unlink();
                        parameters.put(linkable.linkedKey * -4821875126325281949L, new ObjectNode<>(string));
                        return true;
                    }
                }

                current.unlink();
            }
        } else {
            parameters = new HashTable<>(4);
        }

        parameters.put(id, new ObjectNode<>(string));
        return true;
    }

    boolean setVarbit(int id, int value, int start, int end) {
        int startMask = (1 << start) - 1;
        int endMask = 31 == end ? -1 : (1 << end + 1) - 1;
        int mask = endMask ^ startMask;
        value <<= start;
        value &= mask;

        if (parameters != null) {
            Node current = parameters.get(id);

            if (current != null) {
                if (current instanceof IntegerNode) {
                    IntegerNode linkable = (IntegerNode) current;
                    if ((linkable.value * -1189875169 & mask) == value) {
                        return false;
                    }

                    linkable.value = (linkable.value * -1189875169 & ~mask) * -1975318049;
                    linkable.value = (linkable.value * -1189875169 | value) * -1975318049;
                    return true;
                }

                current.unlink();
            }
        } else {
            parameters = new HashTable<>(4);
        }

        parameters.put(id, new IntegerNode(value));
        return true;
    }

    void unban(int index) {
        banCount -= -2087030247;

        if (banCount * -1617114583 == 0) {
            bannedUserHashes = null;
            bannedUserNames = null;
        } else {
            if (bannedUserHashes != null) {
                System.arraycopy(bannedUserHashes, index + 1, bannedUserHashes, index, banCount * -1617114583 - index);
            }

            if (bannedUserNames != null) {
                System.arraycopy(bannedUserNames, index + 1, bannedUserNames, index, banCount * -1617114583 - index);
            }
        }
    }

    void updateOwners() {
        if (memberCount * 1660153155 == 0) {
            currentOwner = -1739916833;
            replacementOwner = 938588091;
        } else {
            currentOwner = -1739916833;
            replacementOwner = 938588091;

            int maximumIndex = 0;
            byte maximum = memberRanks[0];

            for (int index = 1; index < memberCount * 1660153155; index++) {
                if (memberRanks[index] > maximum) {
                    if (maximum == 125) {
                        replacementOwner = maximumIndex * -938588091;
                    }

                    maximumIndex = index;
                    maximum = memberRanks[index];
                } else if (replacementOwner * 1405717133 == -1 && 125 == memberRanks[index]) {
                    replacementOwner = index * -938588091;
                }
            }

            currentOwner = maximumIndex * 1739916833;
            if (currentOwner * -369623583 != -1) {
                memberRanks[currentOwner * -369623583] = (byte) 126;
            }
        }
    }

}