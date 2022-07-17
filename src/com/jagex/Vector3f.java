package com.jagex;

public class Vector3f {
    static Vector3f[] cache = new Vector3f[0];
    static int cacheCapacity;
    static int cached;
    public float x;
    public float z;
    public float y;

    public Vector3f() {

    }

    public Vector3f(Vector3f other) {
        x = other.x;
        y = other.y;
        z = other.z;
    }

    public Vector3f(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Vector3f(Buffer buffer) {
        x = buffer.readFloat();
        y = buffer.readFloat();
        z = buffer.readFloat();
    }

    public static Vector3f copyOf(Vector3f vector3f) {
        synchronized (cache) {
            if (cached == 0) {
                return new Vector3f(vector3f);
            }

            cache[--cached].copyFrom(vector3f);
            return cache[cached];
        }
    }

    public static Vector3f create(float x, float z, float y) {
        synchronized (cache) {
            if (cached == 0) {
                return new Vector3f(x, z, y);
            }

            cache[--cached].set(x, z, y);
            return cache[cached];
        }
    }

    public static final Vector3f difference(Vector3f a, Vector3f b) {
        Vector3f difference = copyOf(a);
        difference.subtract(b);
        return difference;
    }

    public static Vector3f empty() {
        synchronized (cache) {
            if (cached == 0) {
                return new Vector3f();
            }

            cache[--cached].reset();
            return cache[cached];
        }
    }

    public static Vector3f from(Buffer buffer) {
        synchronized (cache) {
            if (cached == 0) {
                return new Vector3f(buffer);
            }

            cache[--cached].decode(buffer);
            return cache[cached];
        }
    }

    public static final float method6452(Vector3f vector3f, Vector3f vector3f_12_) {
        return vector3f.method6488(vector3f_12_);
    }

    public static final Vector3f method6454(Vector3f vector3f, Vector3f vector3f_14_) {
        Vector3f vector3f_15_ = copyOf(vector3f);
        vector3f_15_.cross(vector3f_14_);
        return vector3f_15_;
    }

    public static final Vector3f product(Vector3f a, Vector3f b) {
        Vector3f product = copyOf(a);
        product.multiply(b);
        return product;
    }

    public static final Vector3f product(Vector3f a, float scalar) {
        Vector3f product = copyOf(a);
        product.multiply(scalar);
        return product;
    }

    public static final Vector3f quotient(Vector3f a, Vector3f b) {
        Vector3f quotient = copyOf(a);
        quotient.divide(b);
        return quotient;
    }

    public static void resizeCache(int capacity) {
        cacheCapacity = capacity;
        cache = new Vector3f[capacity];
        cached = 0;
    }

    public static final Vector3f sum(Vector3f a, Vector3f b) {
        Vector3f sum = copyOf(a);
        sum.add(b);
        return sum;
    }

    public final void abs() {
        if (x < 0.0F) {
            x *= -1.0F;
        }

        if (y < 0.0F) {
            y *= -1.0F;
        }

        if (z < 0.0F) {
            z *= -1.0F;
        }
    }

    public final void add(Vector3f other) {
        x += other.x;
        y += other.y;
        z += other.z;
    }

    public void cache() {
        synchronized (cache) {
            if (cached < cacheCapacity - 1) {
                cache[cached++] = this;
            }
        }
    }

    public void copyFrom(Vector3f other) {
        set(other.x, other.y, other.z);
    }

    public void decode(Buffer buffer) {
        x = buffer.readFloat();
        y = buffer.readFloat();
        z = buffer.readFloat();
    }

    public final void divide(float scalar) {
        x /= scalar;
        y /= scalar;
        z /= scalar;
    }

    public boolean equals(Vector3f other) {
        return x == other.x && y == other.y && z == other.z;
    }

    public final void invert() {
        x = -x;
        y = -y;
        z = -z;
    }

    public final float distance() {
        return (float) Math.sqrt(x * x + y * y + z * z);
    }

    public final void normalise() {
        float scale = 1.0F / distance();
        x *= scale;
        y *= scale;
        z *= scale;
    }

    public final void method6448(Vector3f other, float scalar) {
        x += other.x * scalar;
        y += other.y * scalar;
        z += other.z * scalar;
    }

    public final void method6465(Matrix4x3 class405) {
        float x = this.x;
        float y = this.y;

        this.x = class405.aFloat4556 * x + class405.aFloat4564 * y + class405.aFloat4559 * z + class405.aFloat4565;
        this.y = class405.aFloat4562 * x + class405.aFloat4560 * y + class405.aFloat4555 * z + class405.aFloat4566;
        z = class405.aFloat4558 * x + class405.aFloat4561 * y + class405.aFloat4557 * z + class405.aFloat4567;
    }

    public final void method6466(Matrix4x3 class405) {
        float x = this.x;
        float y = this.y;

        this.x = class405.aFloat4556 * x + class405.aFloat4564 * y + class405.aFloat4559 * z;
        this.y = class405.aFloat4562 * x + class405.aFloat4560 * y + class405.aFloat4555 * z;
        z = class405.aFloat4558 * x + class405.aFloat4561 * y + class405.aFloat4557 * z;
    }

    public final void method6467(Vector3f other, float scalar) {
        multiply(1.0F - scalar);
        add(product(other, scalar));
    }

    public final void invertAndMultiply(Quaternion quaternion) {
        Quaternion copy = Quaternion.newInstance(x, y, z, 0.0F);
        Quaternion inverted = Quaternion.invertedCopy(quaternion);
        Quaternion product = Quaternion.multipliedCopy(inverted, copy);
        product.multiplyBy(quaternion);
        set(product.x, product.y, product.z);
        copy.cache();
        inverted.cache();
        product.cache();
    }

    public final float method6488(Vector3f other) {
        return x * other.x + y * other.y + z * other.z;
    }

    public final void multiply(float f) {
        x *= f;
        y *= f;
        z *= f;
    }

    public final void reset() {
        z = 0.0F;
        y = 0.0F;
        x = 0.0F;
    }

    public void set(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public final void subtract(Vector3f other) {
        x -= other.x;
        y -= other.y;
        z -= other.z;
    }

    @Override
    public String toString() {
        return x + ", " + y + ", " + z;
    }

    final void divide(Vector3f other) {
        x /= other.x;
        y /= other.y;
        z /= other.z;
    }

    final void cross(Vector3f other) {
        set((y * other.z) - (z * other.y),
                (z * other.x) - (x * other.z),
                (x * other.y) - (y * other.x)
        );
    }

    final void multiply(Vector3f other) {
        x *= other.x;
        y *= other.y;
        z *= other.z;
    }

}