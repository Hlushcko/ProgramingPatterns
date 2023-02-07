package org.example.generation_patterns.builder;

import org.example.generation_patterns.builder.logick.Builder;
import org.example.generation_patterns.builder.pen.Pen;

public class Director {

    public void generateBluePen(Builder builder){
        builder.addBlueColor();
        builder.setQuantityInk(20f);
    }

    public void generateRedPen(Builder builder){
        builder.addRedColor();
        builder.setQuantityInk(20f);
    }

    public void generateBlackPen(Builder builder){
        builder.addBlackColor();
        builder.setQuantityInk(20f);
    }

}
