package com.jagex;

public abstract class ClanChannelUpdate extends Node {

    abstract void apply(ClanSettings settings);

    abstract void decode(Buffer buffer);

}