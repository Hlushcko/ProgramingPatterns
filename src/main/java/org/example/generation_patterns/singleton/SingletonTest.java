package org.example.generation_patterns.singleton;

public final class SingletonTest {
    private static SingletonTest singleton;
    public String value;

    private SingletonTest(String _value){
        value = _value;
    }

    public static synchronized SingletonTest getSingleton(String _value){
        if(singleton == null){
            singleton = new SingletonTest(_value);
        }

        return singleton;
    }

}
