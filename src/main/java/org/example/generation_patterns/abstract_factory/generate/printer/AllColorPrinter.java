package org.example.generation_patterns.abstract_factory.generate.printer;

import org.example.generation_patterns.abstract_factory.generate.logick.Printer;

import java.awt.*;

public class AllColorPrinter implements Printer {

    @Override
    public void printPhoto(java.awt.Color[] colors) {
        System.out.println("all color printer has: ");

        for(Color color : colors){
            System.out.println(" " + color);
        }
    }

}
