package org.example.generation_patterns.abstract_factory.generate.printer;

import org.example.generation_patterns.abstract_factory.generate.logick.Printer;
import java.awt.*;

public class BlackAndWhitePrinter implements Printer {

    @Override
    public void printPhoto(Color[] colors) {
        System.out.println("black and white printer has: ");

        for(Color color : colors){
            System.out.println(" " + color);
        }
    }

}
