package org.example.generation_patterns.prototype;

public class Dog extends Animal{

    private String breed;

    public Dog(String _breed){
        breed = _breed;
    }

    private Dog(Dog dog){
        super(dog);

        if(dog != null){
            breed = dog.breed;
        }

    }

    @Override
    public Animal clone() {
        return new Dog(this);
    }

}
