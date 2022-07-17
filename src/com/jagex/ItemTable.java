package com.jagex;

public class ItemTable extends Node {

    static HashTable<ItemTable> cache = new HashTable<>(32);
    static ReferenceCache<Model> models = new ReferenceCache<>(11);
    static int modelAttrs;

    int[] ids = {-1};
    int[] quantities = {0};

    public static void method15481(int i) {
        Class533.aClass116_7274 = null;
    }

    public static int getItemIdAt(int key, int index, boolean bool) {
        ItemTable itemTable = lookup(key, bool);
        if (itemTable == null) {
            return -1;
        } else if (index < 0 || index >= itemTable.ids.length) {
            return -1;
        }

        return itemTable.ids[index];
    }

    static ItemTable lookup(int key, boolean bool) {
        long hash = key | (bool ? -2147483648 : 0);
        return cache.get(hash);
    }

    static void add(int key, int index, int id, int quantity, boolean bool) {
        long hash = key | (bool ? -2147483648 : 0);
        ItemTable itemTable = cache.get(hash);
        if (itemTable == null) {
            itemTable = new ItemTable();
            cache.put(hash, itemTable);
        }
        if (itemTable.ids.length <= index) {
            int[] newIds = new int[index + 1];
            int[] newQuantities = new int[index + 1];
            for (int i = 0; i < itemTable.ids.length; i++) {
                newIds[i] = itemTable.ids[i];
                newQuantities[i] = itemTable.quantities[i];
            }

            for (int i = itemTable.ids.length; i < index; i++) {
                newIds[i] = -1;
                newQuantities[i] = 0;
            }
            itemTable.ids = newIds;
            itemTable.quantities = newQuantities;
        }
        itemTable.ids[index] = id;
        itemTable.quantities[index] = quantity;
    }

    static void reset(int key, boolean bool) {
        ItemTable itemTable = lookup(key, bool);
        if (itemTable != null) {
            for (int i = 0; i < itemTable.ids.length; i++) {
                itemTable.ids[i] = -1;
                itemTable.quantities[i] = 0;
            }
        }
    }

    public static int getParameterSum(int key, int parameter, boolean bool, boolean multiplicative) {
        ItemTable itemTable = lookup(key, multiplicative);
        if (itemTable == null) {
            return 0;
        }

        int total = 0;
        for (int index = 0; index < itemTable.ids.length; index++) {
            if (itemTable.ids[index] >= 0 && itemTable.ids[index] < ItemDefinition.loader.definitionCount * -522945077) {
                ItemDefinition definition = ItemDefinition.loader.get(itemTable.ids[index]);
                int value = definition.getOrDefault(parameter, ParameterDefinition.loader.get(parameter).defaultInt * -125275839);
                if (bool) {
                    total += itemTable.quantities[index] * value;
                } else {
                    total += value;
                }
            }
        }
        return total;
    }

    public static int getItemQuantityAt(int key, int index, boolean bool) {
        ItemTable itemTable = lookup(key, bool);
        if (itemTable == null) {
            return 0;
        } else if (index < 0 || index >= itemTable.quantities.length) {
            return 0;
        }

        return itemTable.quantities[index];
    }

    public static int getTotalItemQuantity(int key, int i_26_, boolean bool, int i_27_) {
        int sum = 0;
        ItemTable itemTable = lookup(key, bool);
        if (itemTable == null) {
            return 0;
        }
        for (int i = 0; i < itemTable.ids.length; i++) {
            if (itemTable.ids[i] >= 0 && ItemDefinition.loader.get(itemTable.ids[i]).anInt8269 * 1553194521 == i_26_) {
                sum += getItemQuantityAt(key, i, bool);
            }
        }
        return sum;
    }

    public static int getFreeSlots(int key, boolean bool) {
        if (bool) {
            return 0;
        }
        ItemTable itemTable = lookup(key, bool);
        if (itemTable == null) {
            return WeakReferenceTable.itemTableDefinitionLoader.get(key).capacity * 2138482635;
        }

        int sum = 0;
        for (int id : itemTable.ids) {
            if (id == -1) {
                sum++;
            }
        }

        sum += WeakReferenceTable.itemTableDefinitionLoader.get(key).capacity * 2138482635 - itemTable.ids.length;
        return sum;
    }

    static void delete(int key, boolean bool) {
        ItemTable itemTable = lookup(key, bool);
        if (itemTable != null) {
            itemTable.unlink();
        }
    }

    public static int getTotalItemQuantity(int key, int id, boolean bool) {
        ItemTable itemTable = lookup(key, bool);
        if (itemTable == null) {
            return 0;
        }
        if (id == -1) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < itemTable.quantities.length; i++) {
            if (itemTable.ids[i] == id) {
                sum += itemTable.quantities[i];
            }
        }
        return sum;
    }

    final Model method15450(Toolkit toolkit, int mask, Animator animator, int cacheId, boolean bool, PlayerAppearance appearance) {
        Model model = null;
        Class515 class515 = null;

        if (cacheId != -1) {
            class515 = ProxyingVariableLoader.aClass678_Sub6_3003.get(cacheId);
        }

        int[] ids = this.ids;
        if (class515 != null && class515.anIntArray7047 != null) {
            ids = new int[class515.anIntArray7047.length];
            for (int i = 0; i < class515.anIntArray7047.length; i++) {
                int index = class515.anIntArray7047[i];
                if (index >= 0 && index < this.ids.length) {
                    ids[i] = this.ids[index];
                } else {
                    ids[i] = -1;
                }
            }
        }

        if (animator != null) {
            mask |= animator.method13457();
        }

        long hash = hash(ids, cacheId, appearance != null ? appearance.bodyColours : null, bool);
        if (models != null) {
            model = models.get(hash);
        }

        if (model == null || toolkit.method2637(model.functionMask(), mask) != 0) {
            if (null != model) {
                mask = toolkit.mergeFunctionMasks(mask, model.functionMask());
            }

            int attributes = mask;
            boolean unloaded = false;
            for (int id : ids) {
                if (id != -1 && !ItemDefinition.loader.get(id).modelsLoaded(bool, null)) {
                    unloaded = true;
                }
            }

            if (unloaded) {
                return null;
            }

            BaseModel[] bases = new BaseModel[ids.length];
            for (int index = 0; index < ids.length; index++) {
                if (ids[index] != -1) {
                    bases[index] = ItemDefinition.loader.get(ids[index]).getModel(bool, null);
                }
            }

            if (class515 != null && class515.anIntArrayArray7043 != null) {
                for (int index = 0; index < class515.anIntArrayArray7043.length; index++) {
                    if (class515.anIntArrayArray7043[index] != null && null != bases[index]) {
                        int i_10_ = class515.anIntArrayArray7043[index][0];
                        int i_11_ = class515.anIntArrayArray7043[index][1];
                        int i_12_ = class515.anIntArrayArray7043[index][2];
                        int i_13_ = class515.anIntArrayArray7043[index][3];
                        int i_14_ = class515.anIntArrayArray7043[index][4];
                        int i_15_ = class515.anIntArrayArray7043[index][5];

                        if (i_13_ != 0 || 0 != i_14_ || i_15_ != 0) {
                            bases[index].method3102(i_13_, i_14_, i_15_);
                        }

                        if (0 != i_10_ || 0 != i_11_ || i_12_ != 0) {
                            bases[index].translate(i_10_, i_11_, i_12_);
                        }
                    }
                }
            }

            BaseModel base = new BaseModel(bases, bases.length);
            if (null != appearance) {
                attributes |= 0x4000;
            }

            model = toolkit.createModel(base, attributes, modelAttrs * 609395609, 66, 857);
            if (appearance != null) {
                for (int i_16_ = 0; i_16_ < 10; i_16_++) {
                    for (int i_17_ = 0; i_17_ < UnboundedDefinitionLoader.originalBodyColours[i_16_].length; i_17_++) {
                        if (appearance.bodyColours[i_16_] < HuffmanCodec.replacementBodyColours[i_16_][i_17_].length) {
                            model.recolour(UnboundedDefinitionLoader.originalBodyColours[i_16_][i_17_],
                                    HuffmanCodec.replacementBodyColours[i_16_][i_17_][appearance.bodyColours[i_16_]]);
                        }
                    }
                }
            }
            if (null != models) {
                model.updateFunctionMask(mask);
                models.put(hash, model);
            }
        }
        if (null == animator) {
            return model;
        }

        Model class143_18_ = model.method2890((byte) 1, mask, true);
        animator.method13458(class143_18_, 0);
        return class143_18_;
    }

    long hash(int[] ids, int i, int[] colours, boolean bool) {
        long[] table = Buffer.CRC_64;
        long hash = -1L;
        hash = hash >>> 8 ^ table[(int) ((hash ^ i >> 8) & 0xffL)];
        hash = hash >>> 8 ^ table[(int) ((hash ^ i) & 0xffL)];

        for (int id : ids) {
            hash = hash >>> 8 ^ table[(int) ((hash ^ id >> 24) & 0xffL)];
            hash = hash >>> 8 ^ table[(int) ((hash ^ id >> 16) & 0xffL)];
            hash = hash >>> 8 ^ table[(int) ((hash ^ id >> 8) & 0xffL)];
            hash = hash >>> 8 ^ table[(int) ((hash ^ id) & 0xffL)];
        }

        if (null != colours) {
            for (int index = 0; index < 5; index++) {
                hash = hash >>> 8 ^ table[(int) ((hash ^ colours[index]) & 0xffL)];
            }
        }

        return hash >>> 8 ^ table[(int) ((hash ^ (bool ? 1 : 0)) & 0xffL)];
    }

}