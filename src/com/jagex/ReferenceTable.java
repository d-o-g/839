package com.jagex;

public class ReferenceTable {

    int checksum;
    int entryCount;
    int entrySize;
    int version;
    int[] entryVersions;
    int[] childCounts;
    int[] childSizes;
    int[] entryCrcs;
    int[] entryIndices;
    int[] entryNames;
    int[][] childIndices;
    int[][] childNames;
    byte[][] entryHashes;
    LookupTable entries;
    LookupTable[] children;
    private int[] anIntArray4626;

    ReferenceTable(byte[] data, int expectedChecksum, byte[] hash) {
        checksum = crc32(data, data.length) * -169223875;
        if (expectedChecksum != checksum * -239286763) {
            throw new RuntimeException();
        }

        if (null != hash) {
            if (64 != hash.length) {
                throw new RuntimeException();
            }

            byte[] digest = whirlpool(data, 0, data.length);
            for (int index = 0; index < 64; index++) {
                if (digest[index] != hash[index]) {
                    throw new RuntimeException();
                }
            }
        }

        decode(data);
    }

    static final byte[] decodeContainer(byte[] data) {
        Buffer buffer = new Buffer(data);
        ContainerHeader header = new ContainerHeader(buffer);
        CompressionType type = header.compressionType();
        int compressed = header.compressedLength();

        if (compressed < 0 || Archive.maximumContainerSize * 906654859 != 0
                && compressed > Archive.maximumContainerSize * 906654859) {
            throw new RuntimeException();
        }

        if (type == CompressionType.UNCOMPRESSED) {
            byte[] bytes = new byte[compressed];
            buffer.readBytes(bytes, 0, compressed);
            return bytes;
        }

        int length = header.decompressedLength();
        if (length < 0 || 906654859 * Archive.maximumContainerSize != 0
                && length > Archive.maximumContainerSize * 906654859) {
            throw new RuntimeException();
        }

        byte[] decoded = new byte[length];
        if (type == CompressionType.BZIP2) {
            Bzip2Decompressor.decompress(decoded, length, data, compressed, 9);
        } else {
            synchronized (Archive.GZIP_DECOMPRESSOR) {
                Archive.GZIP_DECOMPRESSOR.decompress(buffer, decoded);
            }
        }

        return decoded;
    }

    static int crc32(byte[] is, int i, int i_0_) {
        int i_2_ = -1;
        for (int i_3_ = i; i_3_ < i_0_; i_3_++) {
            i_2_ = i_2_ >>> 8 ^ Buffer.CRC_32[(i_2_ ^ is[i_3_]) & 0xff];
        }
        i_2_ ^= 0xffffffff;
        return i_2_;
    }

    public static int crc32(byte[] buffer, int length) {
        return crc32(buffer, 0, length);
    }

    public static byte[] whirlpool(byte[] is, int i, int i_5_) {
        byte[] is_7_;
        if (i > 0) {
            is_7_ = new byte[i_5_];
            for (int i_8_ = 0; i_8_ < i_5_; i_8_++) {
                is_7_[i_8_] = is[i_8_ + i];
            }
        } else {
            is_7_ = is;
        }
        Class664 class664 = new Class664();
        class664.method13704(1429438019);
        class664.method13710(is_7_, i_5_ * 8);
        byte[] is_9_ = new byte[64];
        class664.method13703(is_9_, 0, (short) -1328);
        return is_9_;
    }

    void decode(byte[] data) {
        Buffer buffer = new Buffer(ReferenceTable.decodeContainer(data));
        int format = buffer.readUByte();
        if (format < 5 || format > 7) {
            throw new RuntimeException();
        }

        version = (format >= 6) ? buffer.readInt() * 546140195 : 0;

        int attributes = buffer.readUByte();
        boolean named = (attributes & 0x1) != 0;
        boolean hashed = (attributes & 0x2) != 0;
        boolean bool_5_ = (attributes & 0x4) != 0;
        boolean bool_6_ = (attributes & 0x8) != 0;

        entryCount = (format >= 7) ? buffer.readLargeSmart() * -1624621671 : buffer.readUShort() * -1624621671;

        int offset = 0;
        int max = -1;
        entryIndices = new int[entryCount * -824064343];

        if (format >= 7) {
            for (int entry = 0; entry < entryCount * -824064343; entry++) {
                entryIndices[entry] = offset += buffer.readLargeSmart();
                if (entryIndices[entry] > max) {
                    max = entryIndices[entry];
                }
            }
        } else {
            for (int entry = 0; entry < -824064343 * entryCount; entry++) {
                entryIndices[entry] = offset += buffer.readUShort();
                if (entryIndices[entry] > max) {
                    max = entryIndices[entry];
                }
            }
        }

        entrySize = -786869485 * (max + 1);
        entryCrcs = new int[entrySize * 1448439579];

        if (bool_6_) {
            anIntArray4626 = new int[1448439579 * entrySize];
        }

        if (hashed) {
            entryHashes = new byte[entrySize * 1448439579][];
        }

        entryVersions = new int[entrySize * 1448439579];
        childCounts = new int[entrySize * 1448439579];
        childIndices = new int[1448439579 * entrySize][];
        childSizes = new int[1448439579 * entrySize];

        if (named) {
            entryNames = new int[entrySize * 1448439579];
            for (int index = 0; index < entrySize * 1448439579; index++) {
                entryNames[index] = -1;
            }

            for (int index = 0; index < entryCount * -824064343; index++) {
                entryNames[entryIndices[index]] = buffer.readInt();
            }
            entries = new LookupTable(entryNames);
        }

        for (int index = 0; index < entryCount * -824064343; index++) {
            entryCrcs[entryIndices[index]] = buffer.readInt();
        }

        if (bool_6_) {
            for (int index = 0; index < -824064343 * entryCount; index++) {
                anIntArray4626[index] = buffer.readInt();
            }
        }

        if (hashed) {
            for (int index = 0; index < entryCount * -824064343; index++) {
                byte[] hash = new byte[64];
                buffer.readBytes(hash, 0, 64);
                entryHashes[entryIndices[index]] = hash;
            }
        }

        if (bool_5_) {
            int[] anIntArray4624 = new int[1448439579 * entrySize];
            int[] anIntArray4630 = new int[entrySize * 1448439579];
            for (int index = 0; index < -824064343 * entryCount; index++) {
                anIntArray4624[entryIndices[index]] = buffer.readInt();
                anIntArray4630[entryIndices[index]] = buffer.readInt();
            }
        }

        for (int index = 0; index < -824064343 * entryCount; index++) {
            entryVersions[entryIndices[index]] = buffer.readInt();
        }

        if (format >= 7) {
            for (int index = 0; index < -824064343 * entryCount; index++) {
                childCounts[entryIndices[index]] = buffer.readLargeSmart();
            }

            for (int entry = 0; entry < -824064343 * entryCount; entry++) {
                int entryIndex = entryIndices[entry];
                int count = childCounts[entryIndex];
                offset = 0;
                int maxIndex = -1;
                childIndices[entryIndex] = new int[count];

                for (int index = 0; index < count; index++) {
                    int child = childIndices[entryIndex][index] = offset += buffer.readLargeSmart();
                    if (child > maxIndex) {
                        maxIndex = child;
                    }
                }

                childSizes[entryIndex] = maxIndex + 1;
                if (1 + maxIndex == count) {
                    childIndices[entryIndex] = null;
                }
            }
        } else {
            for (int index = 0; index < -824064343 * entryCount; index++) {
                childCounts[entryIndices[index]] = buffer.readUShort();
            }

            for (int entry = 0; entry < entryCount * -824064343; entry++) {
                int entryIndex = entryIndices[entry];
                int count = childCounts[entryIndex];
                offset = 0;
                int maxIndex = -1;
                childIndices[entryIndex] = new int[count];

                for (int child = 0; child < count; child++) {
                    int index = childIndices[entryIndex][child] = offset += buffer.readUShort();
                    if (index > maxIndex) {
                        maxIndex = index;
                    }
                }

                childSizes[entryIndex] = maxIndex + 1;
                if (1 + maxIndex == count) {
                    childIndices[entryIndex] = null;
                }
            }
        }

        if (named) {
            childNames = new int[1 + max][];
            children = new LookupTable[max + 1];

            for (int entry = 0; entry < entryCount * -824064343; entry++) {
                int entryIndex = entryIndices[entry];
                int count = childCounts[entryIndex];
                childNames[entryIndex] = new int[childSizes[entryIndex]];

                for (int index = 0; index < childSizes[entryIndex]; index++) {
                    childNames[entryIndex][index] = -1;
                }

                for (int index = 0; index < count; index++) {
                    int child;
                    if (childIndices[entryIndex] != null) {
                        child = childIndices[entryIndex][index];
                    } else {
                        child = index;
                    }

                    childNames[entryIndex][child] = buffer.readInt();
                }

                children[entryIndex] = new LookupTable(childNames[entryIndex]);
            }
        }
    }

}