package org.example.generation_patterns.abstract_factory;

import org.example.generation_patterns.abstract_factory.connector.ConnectPrinterAndColor;
import org.example.generation_patterns.abstract_factory.generate.logick.Color;
import org.example.generation_patterns.abstract_factory.generate.logick.Printer;

public class AbstractFactory {

    Printer printer;
    Color color;

    public AbstractFactory(ConnectPrinterAndColor connector){
        color = connector.createColor();
        printer = connector.createPrinter();
    }

    public void print(){
        printer.printPhoto(color.getColor());
    }
}
