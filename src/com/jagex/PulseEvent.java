package com.jagex;

public class PulseEvent extends Cacheable {
    static boolean aBool11307 = false;
    static HashTable<PulseEvent> pulseEvents = new HashTable<>(16);
    static Queue<PulseEvent> delayed = new Queue<>();
    static Queue<PulseEvent> immediate = new Queue<>();
    int primary;
    int secondary;
    String string;
    int tertiary;

    PulseEvent(int type, long value) {
        linkedKey = ((long) type << 56 | value) * -7096345066895942069L;
    }

    public static void method13719(int component) {
        PulseEvent event = create(15, component);
        event.delay();
    }

    public static void method15134(int i, int i_0_) {
        PulseEvent event = create(17, (long) i_0_ << 32 | i);
        event.delay();
    }

    public static void method17525(int i) {
        PulseEvent class480_sub31_sub5 = create(9, i);
        class480_sub31_sub5.delay();
    }

    public static void method17579(int i) {
        PulseEvent class480_sub31_sub5 = create(10, i);
        class480_sub31_sub5.delay();
    }

    public static void method2856(int component) {
        PulseEvent event = create(13, component);
        event.delay();
    }

    public static void resetStringVarp(Varp varp) {
        PulseEvent event = create(2, varp.index * 169834903);
        event.delay();
    }

    public static void method4741(int i) {
        PulseEvent class480_sub31_sub5 = create(8, i);
        class480_sub31_sub5.delay();
    }

    public static void method7175(int i) {
        PulseEvent class480_sub31_sub5 = create(4, i);
        class480_sub31_sub5.delay();
    }

    public static void method8874(int i) {
        PulseEvent event = create(22, i);
        event.delay();
    }

    public static void method9353(int i) {
        PulseEvent class480_sub31_sub5 = create(7, i);
        class480_sub31_sub5.delay();
    }

    public static void resetComponentColor(int component) {
        PulseEvent event = create(6, component);
        event.delay();
    }

    public static void resetComponentPosition(int component) {
        PulseEvent event = create(11, component);
        event.delay();
    }

    public static void resetComponentScrollPosition(int position) {
        PulseEvent event = create(12, position);
        event.delay();
    }

    static void clear() {
        pulseEvents.clear();
        delayed.clear();
        immediate.clear();
    }

    static PulseEvent create(int type, long value) {
        aBool11307 = false;
        PulseEvent event = pulseEvents.get((long) type << 56 | value);

        if (null == event) {
            event = new PulseEvent(type, value);
            pulseEvents.put(-4821875126325281949L * event.linkedKey, event);
            aBool11307 = true;
        }

        return event;
    }

    static void method13201(int i, int i_5_) {
        PulseEvent event = create(13, i);
        event.immediate();
        event.primary = 106711445 * i_5_;
    }

    static void method13221(int i, int i_0_, int i_1_, int i_2_) {
        PulseEvent class480_sub31_sub5 = create(20, (long) i_0_ << 32 | i);
        class480_sub31_sub5.immediate();
        class480_sub31_sub5.primary = 106711445 * i_1_;
        class480_sub31_sub5.secondary = i_2_ * 1070353993;
    }

    static void method15089(int i, int i_7_, int i_8_, int i_9_) {
        PulseEvent event = create(10, i);
        event.immediate();
        event.primary = i_7_ * 106711445;
        event.secondary = i_8_ * 1070353993;
        event.tertiary = -1109510229 * i_9_;
    }

    static void method16137() {
        PulseEvent event = create(14, 0L);
        event.delay();
    }

    static void method1713(int i, int i_2_, int i_3_, int i_4_) {
        PulseEvent event = create(8, i);
        event.immediate();
        event.primary = i_2_ * 106711445;
        event.secondary = i_3_ * 1070353993;
        event.tertiary = i_4_ * -1109510229;
    }

    static void setStringVarp(int id, String value) {
        PulseEvent event = create(2, id);
        event.immediate();
        event.string = value;
    }

    static void method18134(int i, boolean bool) {
        PulseEvent event = create(22, i);
        event.immediate();
        event.primary = (bool ? 1 : 0) * 106711445;
    }

    static void method3762(int i, int i_0_, int i_1_, int i_2_) {
        PulseEvent event = create(17, (long) i_0_ << 32 | i);
        event.immediate();
        event.primary = 106711445 * i_1_;
        event.secondary = 1070353993 * i_2_;
    }

    static void method502(int i, int i_1_, int i_2_, int i_3_) {
        PulseEvent event = create(4, i);
        event.immediate();
        event.primary = i_1_ * 106711445;
        event.secondary = i_2_ * 1070353993;
        event.tertiary = i_3_ * -1109510229;
    }

    static void method6906(int i, int i_100_) {
        PulseEvent event = create(14, 0L);
        event.immediate();
        event.primary = i * 106711445;
        event.secondary = i_100_ * 1070353993;
    }

    static void setIntVarp(int id, int value) {
        PulseEvent event = create(1, id);
        event.immediate();
        event.primary = 106711445 * value;
    }

    static void method8240(int i, boolean bool, int i_10_) {
        PulseEvent event = create(23, i);
        event.immediate();
        event.primary = 106711445 * (bool ? 1 : 0);
    }

    static final void method9831() {
        for (int i = PlayerFacade.instance.collection.poll(true); i != -1; i = PlayerFacade.instance.collection.poll(false)) {
            Component.method4322(i, 780116108);
            Client.anIntArray10821[(Client.anInt10898 += -112739175) * -1707026519 - 1 & 0x3f] = i;
        }

        for (PulseEvent event = next(); null != event; event = next()) {
            int type = event.getType();
            long value = event.getValue();

            if (type == 1) {
                Varp varp = Varcs.varcLoader.get((int) value);
                Class199.aVarcs_2099.setIntVarp(varp, event.primary * -1750222403);
                Client.anIntArray10751[(Client.anInt10672 += -2043713109) * -1997518589 - 1 & 0x3f] = (int) value;
            } else if (type == 2) {
                Varp varp = Varcs.varcLoader.get((int) value);
                Class199.aVarcs_2099.setStringVarp(varp, event.string);
                Client.anIntArray10630[(Client.anInt10830 += 1725171251) * 1871078651 - 1 & 0x3f] = (int) value;
            } else if (3 == type) {
                Component component = Component.lookup((int) value);
                if (!event.string.equals(component.text)) {
                    component.text = event.string;
                    Component.redraw(component);
                }
            } else if (4 == type) {
                Component component = Component.lookup((int) value);
                int i_12_ = event.primary * -1750222403;
                int i_13_ = event.secondary * -1770716167;
                int i_14_ = event.tertiary * -1190982909;

                if (component.modelType * 286135323 != i_12_ || -643054127 * component.modelId != i_13_
                        || i_14_ != 405633305 * component.anInt2420) {
                    component.modelType = -512645613 * i_12_;
                    component.modelId = 1265546033 * i_13_;
                    component.anInt2420 = i_14_ * -903294167;
                    component.aClass267_2361 = null;
                    Component.redraw(component);
                }
            } else if (type == 5) {
                Component component = Component.lookup((int) value);
                if (1642844085 * component.animation != -1750222403 * event.primary) {
                    if (-1 != -1750222403 * event.primary) {
                        if (component.aAnimator_2541 == null) {
                            component.aAnimator_2541 = new Animator_Sub3();
                        }
                        component.aAnimator_2541.update(-1750222403 * event.primary);
                    } else {
                        component.aAnimator_2541 = null;
                    }
                    component.animation = -122177815 * event.primary;
                    Component.redraw(component);
                }
            } else if (type == 6) {
                int colour = -1750222403 * event.primary;
                int r = colour >> 10 & 0x1f;
                int g = colour >> 5 & 0x1f;
                int b = colour & 0x1f;
                int rgb = (g << 11) + (r << 19) + (b << 3);

                Component component = Component.lookup((int) value);
                if (rgb != 923665021 * component.textColor) {
                    component.textColor = rgb * -742586667;
                    Component.redraw(component);
                }
            } else if (type == 7) {
                Component component = Component.lookup((int) value);
                boolean hidden = 1 == -1750222403 * event.primary;

                if (component.hidden != hidden) {
                    component.hidden = hidden;
                    Component.redraw(component);
                }
            } else if (8 == type) {
                Component component = Component.lookup((int) value);
                if (event.primary * -1750222403 != component.spritePitch * -322294683
                        || component.spriteRoll * -1831978227 != -1770716167 * event.secondary
                        || event.tertiary * -1190982909 != component.spriteScale * 1331228877) {
                    component.spritePitch = event.primary * 764208761;
                    component.spriteRoll = event.secondary * 198099357;
                    component.spriteScale = -2117817585 * event.tertiary;

                    if (-1 != 1391525437 * component.itemId) {
                        if (459297459 * component.anInt2431 > 0) {
                            component.spriteScale = 1495301125 * (-350348896 * component.spriteScale / (459297459 * component.anInt2431));
                        } else if (-759235537 * component.baseWidth > 0) {
                            component.spriteScale = 1495301125 * (component.spriteScale * -350348896 / (component.baseWidth * -759235537));
                        }
                    }

                    Component.redraw(component);
                }
            } else if (type == 9) {
                Component component = Component.lookup((int) value);
                if (-1750222403 * event.primary != component.itemId * 1391525437
                        || -1770716167 * event.secondary != -1212380503 * component.itemAmount) {
                    component.itemId = event.primary * -695017087;
                    component.itemAmount = -1820634927 * event.secondary;
                    Component.redraw(component);
                }
            } else if (10 == type) {
                Component component = Component.lookup((int) value);
                if (-1750222403 * event.primary != component.spriteOffsetX * 2134977475
                        || event.secondary * -1770716167 != component.spriteOffsetY * 2141391961
                        || 1151952653 * component.spriteYaw != event.tertiary * -1190982909) {
                    component.spriteOffsetX = 975613055 * event.primary;
                    component.spriteOffsetY = -235650911 * event.secondary;
                    component.spriteYaw = -518146481 * event.tertiary;
                    Component.redraw(component);
                }
            } else if (type == 11) {
                Component component = Component.lookup((int) value);
                component.aByte2400 = (byte) 0;
                component.positionX = (component.basePositionX = event.primary * -576091989) * -19961807;
                component.aByte2381 = (byte) 0;
                component.positionY = (component.basePositionY = -942573691 * event.secondary) * 986926653;
                Component.redraw(component);
            } else if (type == 12) {
                Component component = Component.lookup((int) value);
                int position = event.primary * -1750222403;
                if (component != null && 1558474223 * component.type == 0) {
                    if (position > component.scrollHeight * -184691147 - 1362321717 * component.height) {
                        position = component.scrollHeight * -184691147 - 1362321717 * component.height;
                    }
                    if (position < 0) {
                        position = 0;
                    }

                    if (position != component.scrollPosition * -1881455913) {
                        component.scrollPosition = 1223217383 * position;
                        Component.redraw(component);
                    }
                }
            } else if (type == 13) {
                Component component = Component.lookup((int) value);
                component.textureId = event.primary * 2064110345;
            } else if (type == 14) {
                Class63.aBool955 = true;
                Class63.destinationX = event.primary * 669457959;
                Class63.destinationY = 1102018581 * event.secondary;
            } else if (type == 15) {
                Component component = Component.lookup((int) value);
                component.fontId = -259195145 * event.primary;
            } else if (17 == type) {
                Component component = Component.lookup((int) value);
                int i_21_ = (int) (value >> 32);
                component.method4243(i_21_, (short) (event.primary * -1750222403), (short) (-1770716167 * event.secondary));
            } else if (type == 20) {
                Component component = Component.lookup((int) value);
                int i_22_ = (int) (value >> 32);
                component.method4249(i_22_, (short) (-1750222403 * event.primary), (short) (event.secondary * -1770716167));
            } else if (21 == type) {
                Component component = Component.lookup((int) value);
                component.aBool2536 = 1 == event.primary * -1750222403;
            } else if (type == 22) {
                Component component = Component.lookup((int) value);
                component.aBool2417 = 1 == event.primary * -1750222403;

            } else if (type == 23) {
                Component component = Component.lookup((int) value);
                if (component.aBool2461 != (event.primary * -1750222403 == 1)) {
                    component.aBool2461 = 1 == event.primary * -1750222403;
                    Component.redraw(component);
                }
            }
        }
    }

    static PulseEvent next() {
        PulseEvent event = immediate.getFront();
        if (event != null) {
            event.unlink();
            event.uncache();
            return event;
        }

        while (true) {
            event = delayed.getFront();
            if (event == null) {
                return null;
            } else if (event.getTime() > TimeUtil.time()) {
                return null;
            }

            event.unlink();
            event.uncache();

            if (0L != (event.cachedKey * -4988283294723658683L & ~0x7fffffffffffffffL)) {
                return event;
            }
        }
    }

    static void setComponentAnimation(int component, int animation) {
        PulseEvent event = create(5, component);
        event.immediate();
        event.primary = animation * 106711445;
    }

    static void setComponentColor(int component, int rgb) {
        PulseEvent event = create(6, component);
        event.immediate();
        event.primary = 106711445 * rgb;
    }

    static void setComponentHidden(int component, int hidden) {
        PulseEvent event = create(7, component);
        event.immediate();
        event.primary = hidden * 106711445;
    }

    static void setComponentItem(int component, int item, int amount) {
        PulseEvent event = create(9, component);
        event.immediate();
        event.primary = item * 106711445;
        event.secondary = 1070353993 * amount;
    }

    static void setComponentPosition(int component, int x, int y) {
        PulseEvent event = create(11, component);
        event.immediate();
        event.primary = x * 106711445;
        event.secondary = 1070353993 * y;
    }

    static void setComponentScrollPosition(int component, int scrollPosition) {
        PulseEvent event = create(12, component);
        event.immediate();
        event.primary = 106711445 * scrollPosition;
    }

    static void setComponentText(int component, String text) {
        PulseEvent event = create(3, component);
        event.immediate();
        event.string = text;
    }

    void delay() {
        cachedKey = (-4988283294723658683L * cachedKey & ~0x7fffffffffffffffL | TimeUtil.time() + 500L)
                * -4152461709571586419L;
        delayed.offer(this);
    }

    void immediate() {
        cachedKey = -4152461709571586419L * (-4988283294723658683L * cachedKey | ~0x7fffffffffffffffL);

        if (getTime() == 0) {
            immediate.offer(this);
        }
    }

    long getTime() {
        return -4988283294723658683L * cachedKey & 0x7fffffffffffffffL;
    }

    int getType() {
        return (int) (linkedKey * -4821875126325281949L >>> 56 & 0xffL);
    }

    long getValue() {
        return -4821875126325281949L * linkedKey & 0xffffffffffffffL;
    }

}