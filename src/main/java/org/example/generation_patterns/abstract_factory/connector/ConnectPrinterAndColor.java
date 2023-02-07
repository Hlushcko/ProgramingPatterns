package org.example.generation_patterns.abstract_factory.connector;

import org.example.generation_patterns.abstract_factory.generate.logick.Color;
import org.example.generation_patterns.abstract_factory.generate.logick.Printer;


public interface ConnectPrinterAndColor {
    public Printer createPrinter();
    public Color createColor();
}
