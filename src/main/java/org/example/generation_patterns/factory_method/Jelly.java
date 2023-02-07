package org.example.generation_patterns.factory_method;

import org.example.generation_patterns.factory_method.generate.logick.Candy;

public class Jelly implements Candy {

    @Override
    public void eat() {
        System.out.println("eat Jelly");
    }

}
