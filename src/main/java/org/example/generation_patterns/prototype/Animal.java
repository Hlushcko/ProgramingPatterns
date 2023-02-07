package org.example.generation_patterns.prototype;

public abstract class Animal {

    protected int age;
    protected String name;

    public Animal(){}

    protected Animal(Animal animal){
        if(animal != null){
            age = animal.age;
            name = animal.name;
        }
    }

    public abstract Animal clone();

}
