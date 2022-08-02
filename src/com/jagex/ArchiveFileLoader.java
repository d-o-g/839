package com.jagex;

public class ArchiveFileLoader implements Loader {

    String name;
    Archive archive;
    ArchiveFileLoader(Archive archive, String string) {
        this.archive = archive;
        name = string;
    }

    static void method6965(MouseOverEntity class506) {
        class506.node = null;
        synchronized (MouseOverEntity.stack) {
            if (MouseOverEntity.stack.size() < 200) {
                MouseOverEntity.stack.push(class506);
            }
        }
    }

    @Override
    public int completion() {
        if (archive.fileLoaded(name)) {
            return 100;
        }
        return 0;
    }

    @Override
    public LoadingRequirementType type() {
        return LoadingRequirementType.ARCHIVE_FILE;
    }

}