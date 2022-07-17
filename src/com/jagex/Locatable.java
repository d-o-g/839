package com.jagex;

public class Locatable {

    CoordinateSpace invertedCoordinateSpace;
    CoordinateSpace primaryCoordinateSpace;
    CoordinateSpace pendingCoordinateSpace;

    protected boolean pendingLighting;

    boolean pendingCoordUpdate;
    boolean pendingInvert;
    boolean pendingMatrixUpdate;

    Matrix4x3 matrix;

    Locatable top;
    Locatable middle;
    Locatable bottom;

    Locatable() {
        pendingCoordinateSpace = new CoordinateSpace();
        primaryCoordinateSpace = new CoordinateSpace();
        pendingCoordUpdate = true;
        invertedCoordinateSpace = new CoordinateSpace();
        pendingInvert = true;
        matrix = new Matrix4x3();
        pendingMatrixUpdate = true;
        pendingLighting = true;
    }

    public final CoordinateSpace getCoordinateSpace() {
        if (pendingCoordUpdate) {
            pendingCoordUpdate = false;
            primaryCoordinateSpace.copyFrom(pendingCoordinateSpace);

            if (top != null) {
                primaryCoordinateSpace.invertAndAdd(top.getCoordinateSpace());
            }
        }

        return primaryCoordinateSpace;
    }

    public final void setPosition(Vector3f vector3f) {
        pendingCoordinateSpace.translation.copyFrom(vector3f);
        method10172();
        if (middle != null) {
            middle.method10173();
        }
    }

    public final void setPosition(float x, float height, float z) {
        pendingCoordinateSpace.translation.set(x, height, z);
        method10172();

        if (middle != null) {
            middle.method10173();
        }
    }

    public final void method10174() {
        if (top != null) {
            Locatable locatable_3_ = top.middle;
            if (locatable_3_ == this) {
                top.middle = bottom;
            } else {
                for (; locatable_3_.bottom != this; locatable_3_ = locatable_3_.bottom) {

                }
                locatable_3_.bottom = bottom;
            }
        }
        method10172();
        if (middle != null) {
            middle.method10173();
            Locatable locatable_4_ = middle;
            while (true) {
                locatable_4_.pendingCoordinateSpace.invertAndAdd(pendingCoordinateSpace);
                locatable_4_.top = top;
                if (locatable_4_.bottom == null) {
                    locatable_4_.bottom = top.middle;
                    break;
                }
                locatable_4_ = locatable_4_.bottom;
            }
            top.middle = middle;
        }
        top = null;
        bottom = null;
        middle = null;
    }

    public final void method10179(Quaternion quaternion) {
        pendingCoordinateSpace.rotation.copyFrom(quaternion);
        method10172();
        if (middle != null) {
            middle.method10173();
        }
    }

    public final CoordinateSpace method10180() {
        return pendingCoordinateSpace;
    }

    final CoordinateSpace invert() {
        if (pendingInvert) {
            pendingInvert = false;
            invertedCoordinateSpace.copyFrom(getCoordinateSpace());
            invertedCoordinateSpace.invert();
        }
        return primaryCoordinateSpace;
    }

    final Matrix4x3 updateAndGetMatrix() {
        if (pendingMatrixUpdate) {
            pendingMatrixUpdate = false;
            matrix.store(getCoordinateSpace());
        }
        return matrix;
    }

    final void method10171(CoordinateSpace coordinateSpace) {
        if (top != null) {
            CoordinateSpace coordinateSpace_2_ = new CoordinateSpace(coordinateSpace);
            coordinateSpace_2_.invertAndAdd(top.invert());
            method10186(coordinateSpace_2_);
        } else {
            method10186(coordinateSpace);
        }
    }

    final void method10172() {
        pendingCoordUpdate = true;
        pendingInvert = true;
        pendingMatrixUpdate = true;
        pendingLighting = true;
    }

    final void method10173() {
        method10172();
        if (middle != null) {
            middle.method10173();
        }
        if (bottom != null) {
            bottom.method10173();
        }
    }

    final void method10186(CoordinateSpace coordinateSpace) {
        pendingCoordinateSpace.copyFrom(coordinateSpace);
        method10172();
        if (middle != null) {
            middle.method10173();
        }
    }

}