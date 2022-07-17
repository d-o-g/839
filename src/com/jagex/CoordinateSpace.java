package com.jagex;

public class CoordinateSpace {

    public Quaternion rotation = new Quaternion();
    public Vector3f translation = new Vector3f();

    public CoordinateSpace() {

    }

    public CoordinateSpace(CoordinateSpace other) {
        copyFrom(other);
    }

    public void copyFrom(CoordinateSpace other) {
        rotation.copyFrom(other.rotation);
        translation.copyFrom(other.translation);
    }

    public final void invert() {
        rotation.invert();
        translation.invert();
        translation.invertAndMultiply(rotation);
    }

    public final void invertAndAdd(CoordinateSpace other) {
        rotation.multiplyBy(other.rotation);
        translation.invertAndMultiply(other.rotation);
        translation.add(other.translation);
    }

    @Override
    public String toString() {
        return new StringBuilder().append("[").append(rotation.toString()).append("|")
                .append(translation.toString()).append("]").toString();
    }

}