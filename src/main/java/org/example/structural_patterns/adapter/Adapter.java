package org.example.structural_patterns.adapter;

import org.example.structural_patterns.adapter.data.CubeA;
import org.example.structural_patterns.adapter.data.CubeB;

public class Adapter{

    public static CubeA cubeBtoCubeA(CubeB cube) {
        return new CubeA(
                cube.x,
                cube.y,
                cube.z
        );
    }


    public static CubeB cubeAtoCubeB(CubeA cube) {
        return new CubeB(
                (float) cube.x,
                (float) cube.y,
                (float) cube.z
        );
    }


}
