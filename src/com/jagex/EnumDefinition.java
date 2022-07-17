package com.jagex;

import java.io.Serializable;
import java.util.*;

public class EnumDefinition implements Definition, Interface71 {

    public static EnumDefinitionLoader loader;

    public KeyType keyType;
    public KeyType valueType;

    int defaultInt;

    String defaultString = "null";

    HashMap<Object, int[]> inverse;

    Map<Integer, Serializable> map;
    Object[] objects;
    int size = 0;

    EnumDefinition() {

    }

    public boolean containsValue(Object object) {
        if (size * 744846111 == 0) {
            return false;
        } else if (inverse == null) {
            createInverse();
        }

        return inverse.containsKey(object);
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

    public int getInt(int id) {
        Object object = get(id);
        if (object == null) {
            return defaultInt * 263709853;
        }

        return (Integer) object;
    }

    public int[] getKeys(Object object) {
        if (size * 744846111 == 0) {
            return null;
        } else if (inverse == null) {
            createInverse();
        }

        return inverse.get(object);
    }

    public int getSize() {
        return size * 744846111;
    }

    public String getString(int id) {
        Object object = get(id);
        if (object == null) {
            return defaultString;
        }
        return (String) object;
    }

    @Override
    public void method35() {

    }

    @Override
    public void method40(int i) {

    }

    @Override
    public void setId(int id) {

    }

    void createInverse() {
        Map<Object, List<Integer>> inverse = new HashMap<>();
        if (objects != null) {
            for (int index = 0; index < objects.length; index++) {
                if (objects[index] != null) {
                    Object object = objects[index];
                    List<Integer> list = inverse.computeIfAbsent(object, k -> new LinkedList<>());
                    list.add(index);
                }
            }
        } else if (null != map) {
            for (Map.Entry<Integer, Serializable> entry : map.entrySet()) {
                Serializable object = entry.getValue();
                List<Integer> list = inverse.computeIfAbsent(object, k -> new LinkedList<>());
                list.add(entry.getKey());
            }
        } else {
            throw new IllegalStateException();
        }

        this.inverse = new HashMap<>();

        for (Map.Entry<Object, List<Integer>> entry : inverse.entrySet()) {
            List<Integer> list = entry.getValue();
            int[] ints = new int[list.size()];
            int index = 0;

            for (Integer integer : list) {
                ints[index++] = integer;
            }

            if (objects == null) {
                Arrays.sort(ints);
            }

            this.inverse.put(entry.getKey(), ints);
        }
    }

    void decode(Buffer buffer, int opcode) {
        if (opcode == 1) {
            char c = Class215.byteToChar(buffer.readByte());
            keyType = KeyType.valueOf(c);
        } else if (opcode == 2) {
            char c = Class215.byteToChar(buffer.readByte());
            valueType = KeyType.valueOf(c);
        } else if (opcode == 3) {
            defaultString = buffer.readString();
        } else if (opcode == 4) {
            defaultInt = buffer.readInt() * 1574289845;
        } else if (opcode == 5 || opcode == 6) {
            size = buffer.readUShort() * 213928159;
            map = new HashMap<>(size * 744846111);

            for (int i = 0; i < size * 744846111; i++) {
                int id = buffer.readInt();
                Serializable serializable;

                if (opcode == 5) {
                    serializable = buffer.readString();
                } else {
                    serializable = buffer.readInt();
                }

                map.put(id, serializable);
            }
        } else if (opcode == 7 || opcode == 8) {
            int count = buffer.readUShort();
            size = buffer.readUShort() * 213928159;
            objects = new Object[count];

            for (int i = 0; i < size * 744846111; i++) {
                int index = buffer.readUShort();
                if (opcode == 7) {
                    objects[index] = buffer.readString();
                } else {
                    objects[index] = buffer.readInt();
                }
            }
        } else if (opcode == 101) {
            keyType = CompressionType.findIdentifiable(KeyType.values(), buffer.readUSmart());
        } else if (opcode == 102) {
            valueType = CompressionType.findIdentifiable(KeyType.values(), buffer.readUSmart());
        }
    }

    Object get(int id) {
        if (objects != null) {
            return id < 0 || id >= objects.length ? null : objects[id];
        } else if (map != null) {
            return map.get(id);
        }
        return null;
    }
}