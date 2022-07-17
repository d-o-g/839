package com.jagex;

//notes:
//used for models
//only pure java models^
public class Vertex {

    int z;
    int y;
    int x;

    Vertex() {

    }

    Vertex(Vertex other) {
        x = other.x;
        y = other.y;
        z = other.z;
    }

}