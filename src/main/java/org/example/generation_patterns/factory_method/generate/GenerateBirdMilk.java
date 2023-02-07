package org.example.generation_patterns.factory_method.generate;

import org.example.generation_patterns.factory_method.BirdMilk;
import org.example.generation_patterns.factory_method.generate.logick.Candy;
import org.example.generation_patterns.factory_method.generate.logick.GetCandy;

public class GenerateBirdMilk extends GetCandy {

    @Override
    public Candy createCandy() {
        return new BirdMilk();
    }

}
