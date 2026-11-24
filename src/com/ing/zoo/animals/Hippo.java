package com.ing.zoo.animals;

import com.ing.zoo.behaviours.Herbivore;

public class Hippo extends Animal implements Herbivore {
    public Hippo(String name)
    {
        super(name, "splash");
    }

    @Override
    public void eatLeaves()
    {
        say("munch munch lovely");
    }
}
