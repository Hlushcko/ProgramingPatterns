package org.example.generation_patterns.factory_method.generate.logick;

public abstract class GetCandy {

    public void eatCandy(){
        Candy candy = createCandy();
        candy.eat();
    }

    public abstract Candy createCandy();

}
