package org.example.structural_patterns.adapter.data;

import org.example.structural_patterns.adapter.data.standart.Cube;

public class CubeA implements Cube<Double> {
    //щоб було менше коду додаю поля будуть публічні.
    public double x;
    public double y;
    public double z;

    public CubeA(double _x, double _y, double _z){
        x = _x;
        y = _y;
        z = _z;
    }

    @Override
    public Double getSum() {
        return x + y + z;
    }
}
