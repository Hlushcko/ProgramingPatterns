package org.example.generation_patterns.builder.pen;

import java.awt.*;
import java.util.ArrayList;

public class Pen {

    private final ArrayList<Color> colors;
    private final float quantityInk;

    public Pen(ArrayList<Color> _colors, float _quantityInk){
        colors = _colors;
        quantityInk = _quantityInk;
    }

    public ArrayList<Color> getColors(){
        return colors;
    }

    public float getQuantityInk(){
        return quantityInk;
    }

}
