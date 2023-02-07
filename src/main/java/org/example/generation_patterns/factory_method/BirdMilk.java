package org.example.generation_patterns.factory_method;

import org.example.generation_patterns.factory_method.generate.logick.Candy;

public class BirdMilk implements Candy {

    @Override
    public void eat() {
        System.out.println("eat bird milk");
    }

}
