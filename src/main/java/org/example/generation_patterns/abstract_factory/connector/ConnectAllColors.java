package org.example.generation_patterns.abstract_factory.connector;

import org.example.generation_patterns.abstract_factory.generate.color.AllColors;
import org.example.generation_patterns.abstract_factory.generate.logick.Color;
import org.example.generation_patterns.abstract_factory.generate.logick.Printer;
import org.example.generation_patterns.abstract_factory.generate.printer.AllColorPrinter;

import java.awt.*;

public class ConnectAllColors implements ConnectPrinterAndColor {

    @Override
    public Printer createPrinter() {
        return new AllColorPrinter();
    }

    @Override
    public Color createColor() {
        return new AllColors();
    }

}
