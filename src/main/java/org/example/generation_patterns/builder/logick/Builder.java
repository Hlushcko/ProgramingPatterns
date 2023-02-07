package org.example.generation_patterns.builder.logick;

import java.awt.*;

public interface Builder {

    public void addBlackColor();
    public void addBlueColor();
    public void addGrayColor();
    public void addGreenColor();
    public void addYellowColor();
    public void addPinkColor();
    public void addOrangeColor();
    public void addRedColor();
    public void addMyColor(Color color);
    public void setQuantityInk(float inkQuantity);

}
