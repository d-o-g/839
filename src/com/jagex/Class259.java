package com.jagex;

public abstract class Class259 {
    static final int anInt2866 = 4;
    public Vector3f aVector3f_2859;
    public float[] aFloatArray2861 = new float[16];
    public float[] aFloatArray2862 = new float[16];
    public Native2DTexture anInterface29_2863;
    public NativeCubeMapTexture anInterface39_2864;
    public Matrix4f aClass399_2865 = new Matrix4f();
    public Class375 aClass375_2869;
    public Vector3f aVector3f_2870;
    public Class375 aClass375_2871;
    public Vector3f aVector3f_2872;
    public Vector3f aVector3f_2873;
    public Vector3f aVector3f_2874;
    public Vector3f aVector3f_2875;
    public Vector3f aVector3f_2876 = new Vector3f();
    public int anInt2877;
    public int anInt2878;
    public int anInt2879;
    public int anInt2880;
    public Matrix4f aClass399_2881;
    protected NativeToolkit toolkit;
    protected float aFloat2867;
    protected float aFloat2868;

    Class259(NativeToolkit toolkit) {
        aClass375_2869 = new Class375();
        aVector3f_2872 = new Vector3f();
        aClass375_2871 = new Class375();
        aVector3f_2875 = new Vector3f();
        aVector3f_2859 = new Vector3f();
        aVector3f_2874 = new Vector3f();
        aVector3f_2873 = new Vector3f();
        aVector3f_2870 = new Vector3f();
        aClass399_2881 = new Matrix4f();
        this.toolkit = toolkit;
    }

    public abstract void method4772();

    public void method4773(byte i) {
        switch (i) {
            case 2:
                aFloat2867 = 4.0F;
                aFloat2868 = 0.0F;
                break;
            case 3:
                aFloat2867 = 1.0F;
                aFloat2868 = 0.0F;
                break;
            case 1:
                aFloat2867 = 32.0F;
                aFloat2868 = 0.0F;
                break;
        }
    }

    public abstract void method4775(boolean bool);

    public abstract void method4776(int i);

    public abstract void method4777(int i);

    public abstract void method4780();

    public abstract void method4788(int i);

    public abstract void method4789(Matrix4f class399);

}