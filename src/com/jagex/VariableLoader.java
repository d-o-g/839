package com.jagex;

public interface VariableLoader {

    Varp getVarp(VarpType type, int id);

    VarpBit getVarpBit(int id);

}