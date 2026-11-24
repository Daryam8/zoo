package com.ing.zoo.animals;

import com.ing.zoo.behaviours.Herbivore;

public class Zebra extends Animal implements Herbivore {
    public Zebra(String name)
    {
        super(name, "zebra zebra");
    }

    @Override
    public void eatLeaves()
    {
        say("munch munch zank yee bra");
    }
}
