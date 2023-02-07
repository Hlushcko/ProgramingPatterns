package org.example.generation_patterns.factory_method.generate;

import org.example.generation_patterns.factory_method.Caramel;
import org.example.generation_patterns.factory_method.generate.logick.Candy;
import org.example.generation_patterns.factory_method.generate.logick.GetCandy;

public class GenerateCaramel extends GetCandy {

    @Override
    public Candy createCandy() {
        return new Caramel();
    }

}
