package org.example.generation_patterns.builder.pen;

import org.example.generation_patterns.builder.logick.Builder;

import java.awt.*;
import java.util.ArrayList;

public class PenBuilder implements Builder {

    private final ArrayList<Color> colors = new ArrayList<Color>();
    private float quantityInk = 10f;


    @Override
    public void addBlackColor() {
        colors.add(Color.BLACK);
    }

    @Override
    public void addBlueColor() {
        colors.add(Color.BLUE);
    }

    @Override
    public void addGrayColor() {
        colors.add(Color.GRAY);
    }

    @Override
    public void addGreenColor() {
        colors.add(Color.GREEN);
    }

    @Override
    public void addYellowColor() {
        colors.add(Color.YELLOW);
    }

    @Override
    public void addPinkColor() {
        colors.add(Color.PINK);
    }

    @Override
    public void addOrangeColor() {
        colors.add(Color.ORANGE);
    }

    @Override
    public void addRedColor() {
        colors.add(Color.RED);
    }

    @Override
    public void addMyColor(Color color) {
        colors.add(color);
    }

    @Override
    public void setQuantityInk(float inkQuantity) {
        quantityInk = inkQuantity;
    }


    public Pen buildPen(){
        return new Pen(colors, quantityInk);
    }

}
