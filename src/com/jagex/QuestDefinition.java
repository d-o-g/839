package com.jagex;

public class QuestDefinition implements Definition {

    public static QuestDefinitionLoader loader;

    public String[] aStringArray2602;
    public String[] aStringArray2606;

    public String name;
    public String aString2588;

    public boolean aBool2593 = false;
    public int[][] skillRequirements;
    public int[] questRequirements;
    public int[] anIntArray2596;
    public int[] anIntArray2599;
    public int type = 0;
    public int anInt2592 = 0;
    public int requiredQuestPoints;
    public int points;
    public int icon = 94438709;
    DefinitionLoader<QuestDefinition> questLoader;
    HashTable<Node> parameters;
    int[][] varps;
    int[][] varpBits;
    int[] anIntArray2586;
    int[] anIntArray2601;
    int[] anIntArray2595;
    int[] anIntArray2597;
    int[] anIntArray2605;

    QuestDefinition(int id, DefinitionLoader<QuestDefinition> loader) {
        questLoader = loader;
    }

    public static float method4406(Quaternion quaternion) {
        Vector3f vector3f = Vector3f.create(0.0F, 0.0F, 1.0F);
        vector3f.invertAndMultiply(quaternion);
        double angle = Math.atan2(vector3f.x, vector3f.z);
        vector3f.cache();
        if (angle < 0.0) {
            angle += 2 * Math.PI;
        }
        return (float) angle;
    }

    @Override
    public void method35() {
        if (null == aString2588) {
            aString2588 = name;
        }
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
        if (linkable == null) {
            return defaultValue;
        }

        return linkable.value * -1189875169;
    }

    public boolean isCompleted(VariableProvider provider) {
        if (null != varps) {
            for (int[] varps : this.varps) {
                Varp varp = ((VariableLoader) provider).getVarp(VarpType.PLAYER, varps[0]);
                if (provider.getVarpValue(varp) >= varps[2]) {
                    return true;
                }
            }
        }

        if (null != varpBits) {
            for (int[] varbits : varpBits) {
                VarpBit varbit = ((VariableLoader) provider).getVarpBit(varbits[0]);
                if (provider.getVarpBitValue(varbit) >= varbits[2]) {
                    return true;
                }
            }
        }

        return false;
    }

    public String getParameter(int id, String defaultValue) {
        if (null == parameters) {
            return defaultValue;
        }

        ObjectNode linkable = (ObjectNode) parameters.get(id);
        if (linkable == null) {
            return defaultValue;
        }

        return (String) linkable.referent;
    }

    public boolean canStart(VariableProvider provider) {
        if (MovementType.getQuestPoints(provider, questLoader) < 2106198419 * requiredQuestPoints) {
            return false;
        }

        if (null != skillRequirements) {
            for (int[] element : skillRequirements) {
                if (((SkillProvider) provider).getLevel(element[0]) < element[1]) {
                    return false;
                }
            }
        }

        if (questRequirements != null) {
            for (int index = 0; index < questRequirements.length; index++) {
                if (!questLoader.get(questRequirements[index]).isCompleted(provider)) {
                    return false;
                }
            }
        }

        if (null != anIntArray2599) {
            for (int index = 0; index < anIntArray2599.length; index++) {
                Varp varp = ((VariableLoader) provider).getVarp(VarpType.PLAYER, anIntArray2599[index]);
                int value = provider.getVarpValue(varp);
                if (value < anIntArray2597[index] || value > anIntArray2601[index]) {
                    return false;
                }
            }
        }

        if (null != anIntArray2596) {
            for (int index = 0; index < anIntArray2596.length; index++) {
                VarpBit varbit = ((VariableLoader) provider).getVarpBit(anIntArray2596[index]);
                int value = provider.getVarpBitValue(varbit);

                if (value < anIntArray2586[index] || value > anIntArray2605[index]) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean method4381(VariableProvider provider) {
        return MovementType.getQuestPoints(provider, questLoader) >= 2106198419 * requiredQuestPoints;
    }

    public boolean method4384(VariableProvider provider, int i) {
        if (anIntArray2599 == null || i < 0 || i >= anIntArray2599.length) {
            return false;
        }

        Varp varp = ((VariableLoader) provider).getVarp(VarpType.PLAYER, anIntArray2599[i]);
        int value = provider.getVarpValue(varp);
        return !(value < anIntArray2597[i] || value > anIntArray2601[i]);
    }

    public boolean method4385(VariableProvider provider, int i, int i_32_) {
        if (null == anIntArray2596 || i < 0 || i >= anIntArray2596.length) {
            return false;
        }

        VarpBit varbit = ((VariableLoader) provider).getVarpBit(anIntArray2596[i]);
        int value = provider.getVarpBitValue(varbit);
        return !(value < anIntArray2586[i] || value > anIntArray2605[i]);
    }

    public boolean method4386(VariableProvider provider, int i) {
        if (null == skillRequirements || i < 0 || i >= skillRequirements.length) {
            return false;
        }
        return ((SkillProvider) provider).getLevel(skillRequirements[i][0]) >= skillRequirements[i][1];
    }

    public boolean method4389(VariableProvider provider, int i) {
        if (questRequirements == null || i < 0 || i >= questRequirements.length) {
            return false;
        }
        return questLoader.get(questRequirements[i]).isCompleted(provider);
    }

    public boolean isStarted(VariableProvider provider) {
        if (null != varps) {
            for (int[] values : varps) {
                Varp varp = ((VariableLoader) provider).getVarp(VarpType.PLAYER, values[0]);
                if (provider.getVarpValue(varp) >= values[1]) {
                    return true;
                }
            }
        }
        if (varpBits != null) {
            for (int[] values : varpBits) {
                VarpBit varbit = ((VariableLoader) provider).getVarpBit(values[0]);
                if (provider.getVarpBitValue(varbit) >= values[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    void decode(Buffer buffer, int opcode) {
        if (opcode == 1) {
            name = buffer.readPrefixedString();
        } else if (opcode == 2) {
            aString2588 = buffer.readPrefixedString();
        } else if (3 == opcode) {
            int count = buffer.readUByte();
            varps = new int[count][3];
            for (int index = 0; index < count; index++) {
                varps[index][0] = buffer.readUShort(); //varpId
                varps[index][1] = buffer.readInt(); //varpStartValue
                varps[index][2] = buffer.readInt(); //varpEndValue
            }
        } else if (opcode == 4) {
            int count = buffer.readUByte();
            varpBits = new int[count][3];
            for (int index = 0; index < count; index++) {
                varpBits[index][0] = buffer.readUShort(); //varpBitId
                varpBits[index][1] = buffer.readInt(); //varpBitStartValue
                varpBits[index][2] = buffer.readInt(); //varpBitEndValue
            }
        } else if (5 == opcode) {
            buffer.readUShort();
        } else if (opcode == 6) {
            type = buffer.readUByte() * 170231021;
        } else if (7 == opcode) {
            anInt2592 = buffer.readUByte() * 273305943;
        } else if (opcode == 8) {
            aBool2593 = true;
        } else if (9 == opcode) {
            points = buffer.readUByte() * 1198134663;
        } else if (opcode == 10) {
            int count = buffer.readUByte();
            anIntArray2595 = new int[count];

            for (int index = 0; index < count; index++) {
                anIntArray2595[index] = buffer.readInt();
            }
        } else if (12 == opcode) {
            buffer.readInt();
        } else if (opcode == 13) {
            int count = buffer.readUByte();
            questRequirements = new int[count];
            for (int index = 0; index < count; index++) {
                questRequirements[index] = buffer.readUShort();
            }
        } else if (opcode == 14) {
            int count = buffer.readUByte();
            skillRequirements = new int[count][2];
            for (int index = 0; index < count; index++) {
                skillRequirements[index][0] = buffer.readUByte();
                skillRequirements[index][1] = buffer.readUByte();
            }
        } else if (opcode == 15) {
            requiredQuestPoints = buffer.readUShort() * 900955291;
        } else if (opcode == 17) {
            icon = buffer.readSmart32() * -94438709;
        } else if (18 == opcode) {
            int count = buffer.readUByte();
            anIntArray2599 = new int[count];
            anIntArray2597 = new int[count];
            anIntArray2601 = new int[count];
            aStringArray2602 = new String[count];
            for (int index = 0; index < count; index++) {
                anIntArray2599[index] = buffer.readInt();
                anIntArray2597[index] = buffer.readInt();
                anIntArray2601[index] = buffer.readInt();
                aStringArray2602[index] = buffer.readString();
            }
        } else if (19 == opcode) {
            int index = buffer.readUByte();
            anIntArray2596 = new int[index];
            anIntArray2586 = new int[index];
            anIntArray2605 = new int[index];
            aStringArray2606 = new String[index];
            for (int count = 0; count < index; count++) {
                anIntArray2596[count] = buffer.readInt();
                anIntArray2586[count] = buffer.readInt();
                anIntArray2605[count] = buffer.readInt();
                aStringArray2606[count] = buffer.readString();
            }
        } else if (249 == opcode) {
            int count = buffer.readUByte();
            if (parameters == null) {
                int size = HashTable.nextPowerOfTwo(count);
                parameters = new HashTable<>(size);
            }
            for (int i = 0; i < count; i++) {
                boolean string = buffer.readUByte() == 1;
                int id = buffer.readUTriByte();
                Node node = string ? new ObjectNode<>(buffer.readString()) : new IntegerNode(buffer.readInt());
                parameters.put(id, node);
            }
        }
    }

}