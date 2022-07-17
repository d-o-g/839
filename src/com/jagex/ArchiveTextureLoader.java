package com.jagex;

public class ArchiveTextureLoader extends Class136 {

    Archive textures;
    Archive materials;

    public ArchiveTextureLoader(Archive textures, Archive materials) {
        this.textures = textures;
        this.materials = materials;
    }

    static void method14579(Buffer buffer, long key) {
        LoginEnum1 loginEnum1;
        if (null != Class31.accountAuthenticator && Class31.accountAuthenticator.length() == 6) {
            if (Class31.loginBool) {
                loginEnum1 = LoginEnum1.aLoginEnum1_2673;
            } else {
                loginEnum1 = LoginEnum1.aLoginEnum1_2675;
            }
        } else if (SkyboxDefinition.aClass55_7012.containsKey(key)) {
            loginEnum1 = LoginEnum1.aLoginEnum1_2674;
        } else {
            loginEnum1 = LoginEnum1.aLoginEnum1_2676;
        }

        buffer.writeByte(loginEnum1.getId());
        switch (loginEnum1.anInt2672 * -1878261949) {
            case 0:
            case 3:
                buffer.writeTriByte(Integer.parseInt(Class31.accountAuthenticator));
                buffer.caret += 1258142129;
                break;
            case 2:
                buffer.writeInt(SkyboxDefinition.aClass55_7012.get(key));
                break;
            case 1:
                buffer.caret += 737601220;
                break;
        }
    }

    @Override
    public boolean loaded(TextureType type, int file) {
        if (TextureType.TEXTURE_AND_MATERIAL == type) {
            boolean loaded = true;

            if (materials.validFile(file)) {
                loaded = materials.fileLoaded(file);
            }

            return loaded & textures.fileLoaded(file);
        } else if (TextureType.TEXTURE == type) {
            return textures.fileLoaded(file);
        } else if (TextureType.MATERIAL == type) {
            return materials.fileLoaded(file);
        }

        return false;
    }

    @Override
    byte[] get(TextureType type, int file) {
        if ((TextureType.TEXTURE == type || TextureType.TEXTURE_AND_MATERIAL == type) && textures.validFile(file)) {
            return textures.get(file);
        } else if (TextureType.MATERIAL == type && materials.validFile(file)) {
            return materials.get(file);
        }

        return null;
    }

}