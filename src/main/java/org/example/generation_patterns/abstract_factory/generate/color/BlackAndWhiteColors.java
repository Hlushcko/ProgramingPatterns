package org.example.generation_patterns.abstract_factory.generate.color;

import org.example.generation_patterns.abstract_factory.generate.logick.Color;

public class BlackAndWhiteColors implements Color {

    java.awt.Color[] color = new java.awt.Color[2];

    @Override
    public java.awt.Color[] getColor() {
        generateColor();
        return color;
    }

    //рекомендую глянути після абстрактної фабрики ще сінглтон, доволі корисна штука.
    private void generateColor(){
        color[0] = java.awt.Color.BLACK;
        color[1] = java.awt.Color.WHITE; //я знаю що принтери не використовують білий колір
    }

}
