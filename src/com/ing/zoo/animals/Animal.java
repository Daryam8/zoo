package com.ing.zoo.animals;

import java.util.Random;

public abstract class Animal {
    private static final Random RANDOM = new Random();

    private final String name;
    private final String helloText;

    protected Animal(String name, String helloText)
    {
        this.name = name;
        this.helloText = helloText;
    }

    public String getName()
    {
        return name;
    }

    public void sayHello()
    {
        say(helloText);
    }

    protected void say(String text)
    {
        System.out.println(name + ": " + text);
    }

    protected void sayRandom(String... texts)
    {
        say(texts[RANDOM.nextInt(texts.length)]);
    }
}
