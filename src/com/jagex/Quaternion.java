package com.jagex;

public final class Quaternion {

    static Quaternion[] cache = new Quaternion[0];
    static int maxCacheSize;
    static int cacheSize;

    public float z;
    public float x;
    public float y;
    public float w;

    public Quaternion() {
        reset();
    }

    public Quaternion(Quaternion src) {
        copyFrom(src);
    }

    public Quaternion(float f, float f_9_, float f_10_) {
        method6413(f, f_9_, f_10_);
    }

    public Quaternion(float x, float y, float z, float w) {
        set(x, y, z, w);
    }

    public static Quaternion copy(Quaternion other) {
        synchronized (cache) {
            if (cacheSize == 0) {
                return new Quaternion(other);
            }
            cache[--cacheSize].copyFrom(other);
            return cache[cacheSize];
        }
    }

    public static Quaternion cached() {
        synchronized (cache) {
            if (cacheSize == 0) {
                return new Quaternion();
            }
            cache[--cacheSize].reset();
            return cache[cacheSize];
        }
    }

    public static final Quaternion invertedCopy(Quaternion other) {
        Quaternion copy = copy(other);
        copy.invert();
        return copy;
    }

    public static void setCacheSize(int capacity) {
        maxCacheSize = capacity;
        cache = new Quaternion[capacity];
        cacheSize = 0;
    }

    static Quaternion newInstance(float x, float y, float z, float w) {
        synchronized (cache) {
            if (cacheSize == 0) {
                return new Quaternion(x, y, z, w);
            }
            cache[--cacheSize].set(x, y, z, w);
            return cache[cacheSize];
        }
    }

    static final float distance(Quaternion quaternion) {
        return (float) Math.sqrt(dot(quaternion, quaternion));
    }

    static final float dot(Quaternion base, Quaternion other) {
        return base.dot(other);
    }

    static final Quaternion multipliedCopy(Quaternion base, Quaternion other) {
        Quaternion copy = copy(base);
        copy.multiplyBy(other);
        return copy;
    }

    static final Quaternion multipliedCopy(Quaternion base, float scalar) {
        Quaternion copy = copy(base);
        copy.multiply(scalar);
        return copy;
    }

    public void cache() {
        synchronized (cache) {
            if (cacheSize < maxCacheSize - 1) {
                cache[cacheSize++] = this;
            }
        }
    }

    public void copyFrom(Quaternion from) {
        x = from.x;
        y = from.y;
        z = from.z;
        w = from.w;
    }

    public void decode(Buffer buffer) {
        x = buffer.readFloat();
        y = buffer.readFloat();
        z = buffer.readFloat();
        w = buffer.readFloat();
    }

    public void setByAngle(float x, float y, float z, float angle) {
        float sin = (float) Math.sin(angle * 0.5F);
        float cos = (float) Math.cos(angle * 0.5F);
        this.x = x * sin;
        this.y = y * sin;
        this.z = z * sin;
        w = cos;
    }

    public final void multiplyBy(Quaternion other) {
        set(other.w * x + other.x * w + other.y * z - other.z * y,
                other.w * y - other.x * z + other.y * w + other.z * x,
                other.w * z + other.x * y - other.y * x + other.z * w,
                other.w * w - other.x * x - other.y * y - other.z * z);
    }

    public final void invert() {
        x = -x;
        y = -y;
        z = -z;
    }

    public void setByAngle(Vector3f vector3f, float f) {
        setByAngle(vector3f.x, vector3f.y, vector3f.z, f);
    }

    public final void method6381(Quaternion base, float scalar) {
        if (dot(base) < 0.0F) {
            negate();
        }
        multiply(1.0F - scalar);
        Quaternion product = multipliedCopy(base, scalar);
        add(product);
        product.cache();
        normalize();
    }

    public final void normalize() {
        float f = 1.0F / distance(this);
        x *= f;
        y *= f;
        z *= f;
        w *= f;
    }

    public void method6413(float f, float f_30_, float f_31_) {
        setByAngle(0.0F, 1.0F, 0.0F, f);
        Quaternion raw = cached();
        raw.setByAngle(1.0F, 0.0F, 0.0F, f_30_);
        this.multiplyBy(raw);
        raw.setByAngle(0.0F, 0.0F, 1.0F, f_31_);
        this.multiplyBy(raw);
        raw.cache();
    }

    @Override
    public String toString() {
        return x + "," + y + "," + z + "," + w;
    }

    final void add(Quaternion other) {
        x += other.x;
        y += other.y;
        z += other.z;
        w += other.w;
    }

    final void negate() {
        x = -x;
        y = -y;
        z = -z;
        w = -w;
    }

    final float dot(Quaternion other) {
        return x * other.x +
                y * other.y
                + z * other.z
                + w * other.w;
    }

    final void multiply(float scalar) {
        x *= scalar;
        y *= scalar;
        z *= scalar;
        w *= scalar;
    }

    final void reset() {
        z = 0.0F;
        y = 0.0F;
        x = 0.0F;
        w = 1.0F;
    }

    void set(float x, float y, float z, float w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

}