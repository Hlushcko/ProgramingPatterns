package org.example.generation_patterns.abstract_factory.connector;

import org.example.generation_patterns.abstract_factory.generate.color.BlackAndWhiteColors;
import org.example.generation_patterns.abstract_factory.generate.logick.Color;
import org.example.generation_patterns.abstract_factory.generate.logick.Printer;
import org.example.generation_patterns.abstract_factory.generate.printer.BlackAndWhitePrinter;

import java.awt.*;

public class ConnectBlackColors implements ConnectPrinterAndColor{

    @Override
    public Printer createPrinter(){
        return new BlackAndWhitePrinter();
    }

    @Override
    public Color createColor() {
        return new BlackAndWhiteColors();
    }

}
