package org.example.generation_patterns.abstract_factory.generate.color;

import org.example.generation_patterns.abstract_factory.generate.logick.Color;

public class AllColors implements Color {

    java.awt.Color[] color = new java.awt.Color[9];

    @Override
    public java.awt.Color[] getColor() {
        generateColor();
        return color;
    }

    //рекомендую глянути після абстрактної фабрики ще сінглтон, доволі корисна штука.
    private void generateColor(){
        color[0] = java.awt.Color.BLACK;
        color[1] = java.awt.Color.BLUE;
        color[2] = java.awt.Color.GRAY;
        color[3] = java.awt.Color.GREEN;
        color[4] = java.awt.Color.WHITE;
        color[5] = java.awt.Color.YELLOW;
        color[6] = java.awt.Color.PINK;
        color[7] = java.awt.Color.ORANGE;
        color[8] = java.awt.Color.RED;
    }

}
