package com.ing.zoo.animals;

import com.ing.zoo.behaviours.Carnivore;
import com.ing.zoo.behaviours.Herbivore;
import com.ing.zoo.behaviours.TrickPerformer;

public class Bear extends Animal implements Herbivore, Carnivore, TrickPerformer {
    public Bear(String name)
    {
        super(name, "grrrowl");
    }

    @Override
    public void eatLeaves()
    {
        say("munch munch berry nice");
    }

    @Override
    public void eatMeat()
    {
        say("nomnomnom grrreat");
    }

    @Override
    public void performTrick()
    {
        sayRandom("stands on two legs", "catches a fish");
    }
}
