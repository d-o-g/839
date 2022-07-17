package com.jagex;

public class ExpandableMenuItem extends Cacheable {
    public static int count;
    static ReferenceCache<ExpandableMenuItem> cache;
    static HashTable<ExpandableMenuItem> categories;
    Queue<MenuItem> options = new Queue<MenuItem>();
    int optionCount;
    String title;

    ExpandableMenuItem(String title) {
        this.title = title;
    }

    static int getTitleWidth(ExpandableMenuItem category, FontSpecification specification) {
        String string = getTitle(category);
        return specification.textWidth(string, Class368.aClass116Array4053);
    }

    static String getTitle(ExpandableMenuItem category) {
        return new StringBuilder().append(category.title).append(Item.getColorTags(16777215)).append(" >").toString();
    }

    static void reposition(ExpandableMenuItem category) {
        boolean inserted = false;
        category.uncache();
        for (ExpandableMenuItem front = Class56.expandableMenuItems.getFront(); front != null; front = Class56.expandableMenuItems.next()) {
            if (MenuItem.isBefore(category.firstType(), front.firstType())) {
                Cacheable.splice(category, front);
                inserted = true;
                break;
            }
        }
        if (!inserted) {
            Class56.expandableMenuItems.offer(category);
        }
    }

    boolean add(MenuItem option) {
        boolean bool = true;
        option.uncache();
        MenuItem front = options.getFront();
        while (null != front) {
            if (MenuItem.isBefore(-20536735 * option.opcode, front.opcode * -20536735)) {
                Cacheable.insertBefore(option, front);
                optionCount += 1537028617;
                return !bool;
            }
            front = options.next();
            bool = false;
        }
        options.offer(option);
        optionCount += 1537028617;
        return bool;
    }

    int firstType() {
        if (options.tail != options.tail.nextCacheable) {
            return ((MenuItem) options.tail.nextCacheable).opcode * -20536735;
        }

        return -1;
    }

    boolean remove(MenuItem option) {
        int type = firstType();
        option.uncache();
        optionCount -= 1537028617;

        if (0 == optionCount * 713555001) {
            unlink();
            uncache();
            ExpandableMenuItem.count -= -450043263;
            ExpandableMenuItem.cache.put(-6309744751763661005L * option.key, this);
            return false;
        }

        return type != firstType();
    }

}