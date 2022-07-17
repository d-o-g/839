package com.jagex;

public class PlayerFacade implements VariableProvider, VariableLoader, SkillProvider {
    public static PlayerFacade instance;
    static TextureLoader anTextureLoader_1027;
    public TimedVariableCollection collection = new TimedVariableCollection();
    Skill[] skills;
    VarpBitLoader varpBitLoader;
    VarpLoader varpLoader;
    public PlayerFacade(VarpLoader varpLoader, VarpBitLoader loader, int size) {
        skills = new Skill[size];
        this.varpLoader = varpLoader;
        varpBitLoader = loader;
    }

    public static void method1560() {
        if (Client.componentSelected) {
            Component component = Class185.method3584(1969702363 * SceneGraph.anInt6751, Client.anInt10756 * -800680953);

            if (null != component && null != component.anObjectArray2495) {
                ScriptContext context = new ScriptContext();
                context.source = component;
                context.arguments = component.anObjectArray2495;
                Script.execute(context);
            }

            Client.anInt10782 = -2101032765;
            Client.anInt10867 = -1059838551;
            Client.componentSelected = false;

            if (component != null) {
                Component.redraw(component);
            }
        }
    }

    public int method1546(int i) {
        return skills[i]
                .method9556(Client.membersWorld ? Class615.aClass615_7953 : Class615.aClass615_7954);
    }

    public int method1547(int i) {
        return skills[i].method9543();
    }

    public int method1548(int i) {
        return skills[i].getExperience();
    }

    public int method1549(int i) {
        return skills[i].method9536();
    }

    @Override
    public int getLevel(int index) {
        return skills[index]
                .method9534(Client.membersWorld ? Class615.aClass615_7953 : Class615.aClass615_7954);
    }

    @Override
    public int getVarpValue(Varp parameter) {
        return collection.getVarpValue(parameter);
    }

    @Override
    public int getVarpBitValue(VarpBit vb) {
        return collection.getVarpBitValue(vb);
    }

    @Override
    public Varp getVarp(VarpType type, int id) {
        if (VarpType.PLAYER != type) {
            return null;
        }

        return varpLoader.get(id);
    }

    @Override
    public VarpBit getVarpBit(int id) {
        VarpBit vb = varpBitLoader.get(id);
        if (vb.varp.type != VarpType.PLAYER) {
            return null;
        }
        return vb;
    }

}