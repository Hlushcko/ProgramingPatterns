package org.example.structural_patterns.adapter.data;

import org.example.structural_patterns.adapter.data.standart.Cube;

public class CubeB implements Cube<Float> {
    //щоб було менше коду додаю поля будуть публічні.
    public float x;
    public float y;
    public float z;

    public CubeB(float _x, float _y, float _z){
        x = _x;
        y = _y;
        z = _z;
    }

    @Override
    public Float getSum() {
        return x + y + z;
    }

}
