package org.example.generation_patterns.factory_method.generate;

import org.example.generation_patterns.factory_method.Jelly;
import org.example.generation_patterns.factory_method.generate.logick.Candy;
import org.example.generation_patterns.factory_method.generate.logick.GetCandy;

public class GenerateJelly extends GetCandy {

    @Override
    public Candy createCandy() {
        return new Jelly();
    }

}
