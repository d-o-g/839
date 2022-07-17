package com.jagex;

public class Class171 {
    public static Class171 aClass171_1947 = new Class171();
    public static Class171 aClass171_1952 = new Class171();
    static Class171 aClass171_1948 = new Class171();
    static Class171 aClass171_1949 = new Class171();
    static Class171 aClass171_1950 = new Class171();
    static Class171 aClass171_1951 = new Class171();
    static Class171 aClass171_1953 = new Class171();
    static Class171 aClass171_1954 = new Class171();
    static Class171 aClass171_1955 = new Class171();
    static Class171 aClass171_1956 = new Class171();
    static Class171 aClass171_1957 = new Class171();
    static Class171 aClass171_1958 = new Class171();
    static Class171 aClass171_1959 = new Class171();
    static long aLong1960;

    public static int method3484(int i) {
        ChatMessage chatMessage = Class248.messageCache.get(i);
        if (chatMessage == null) {
            return -1;
        } else if (Class248.aClass638_2668.tail == chatMessage.nextCacheable) {
            return -1;
        }

        return ((ChatMessage) chatMessage.nextCacheable).anInt11382 * -482365547;
    }

    public static void method3488(float scalar, Vector3f vector3f, Quaternion quaternion, Vector3f vector3f_6_,
                                  Vector3f vector3f_7_, Vector3f vector3f_8_, float f_9_, float f_10_, float f_11_) {
        if (!vector3f_6_.equals(vector3f)) {
            Vector3f vector3f_12_ = Vector3f.create(0.0F, 0.0F, 0.0F);
            Vector3f vector3f_13_ = Vector3f.copyOf(Vector3f.difference(vector3f_6_, vector3f));
            vector3f_13_.invertAndMultiply(quaternion);
            Vector3f difference = Vector3f.difference(vector3f_13_, vector3f_12_);
            float distance = difference.distance();

            if (vector3f_8_.x == Float.POSITIVE_INFINITY || Float.isNaN(vector3f.x) || distance > f_10_
                    || distance < f_11_) {
                vector3f.copyFrom(vector3f_6_);
                vector3f_7_.reset();
            } else {
                quaternion.invert();
                Vector3f vector3f_16_ = Vector3f.create(1.0F, 0.0F, 0.0F);
                Vector3f vector3f_17_ = Vector3f.create(0.0F, 1.0F, 0.0F);
                Vector3f vector3f_18_ = Vector3f.create(0.0F, 0.0F, 1.0F);
                vector3f_16_.invertAndMultiply(quaternion);
                vector3f_17_.invertAndMultiply(quaternion);
                vector3f_18_.invertAndMultiply(quaternion);
                Vector3f vector3f_19_ = Vector3f.create(Vector3f.method6452(vector3f_16_, vector3f_7_),
                        Vector3f.method6452(vector3f_17_, vector3f_7_), Vector3f.method6452(vector3f_18_, vector3f_7_));
                Vector3f vector3f_20_ = Vector3f.copyOf(vector3f_19_);
                Vector3f vector3f_21_ = Vector3f.create(difference.x * vector3f_8_.x, vector3f_8_.y * difference.y,
                        vector3f_8_.z * difference.z);
                vector3f_20_.method6448(vector3f_21_, scalar);
                vector3f_20_.divide(f_9_);
                Vector3f vector3f_22_ = Vector3f.product(vector3f_16_, vector3f_20_.x);
                vector3f_22_.method6448(vector3f_17_, vector3f_20_.y);
                vector3f_22_.method6448(vector3f_18_, vector3f_20_.z);
                vector3f_7_.copyFrom(vector3f_22_);
                vector3f.add(Vector3f.product(vector3f_7_, scalar));
            }
        }
    }

    static void method3489(Component[] components, Component class226, boolean bool) {
        int width = 0 != class226.scrollWidth * 731337999 ? class226.scrollWidth * 731337999
                : 688089097 * class226.width;
        int height = -184691147 * class226.scrollHeight != 0 ? -184691147 * class226.scrollHeight
                : 1362321717 * class226.height;

        Class264.method5001(components, 1857819631 * class226.uid, width, height, bool);
        if (class226.subComponents != null) {
            Class264.method5001(class226.subComponents, 1857819631 * class226.uid, width, height, bool);
        }

        InterfaceNode comp = Client.openInterfaces.get(class226.uid * 1857819631);
        if (comp != null) {
            CustomisedItem.method13892(comp.id * 1021060255, width, height, bool);
        }

        if (class226 == Client.aClass226_10798) {
            int count = -1784886003 * Class80.playerCount;
            int[] indices = Class80.playerIndices;
            for (int index = 0; index < count; index++) {
                Player player = Client.players[indices[index]];
                if (null != player) {
                    player.method17968(width, height, bool);
                }
            }

            for (int i = 0; i < 1746328619 * Client.npcCount; i++) {
                int index = Client.npcIndices[i];
                ObjectNode<Npc> linkable = Client.npcTable.get(index);
                if (null != linkable) {
                    linkable.referent.method17968(width, height, bool);
                }
            }
        }
    }

}