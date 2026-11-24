package com.ing.zoo.animals;

import com.ing.zoo.behaviours.Carnivore;
import com.ing.zoo.behaviours.Herbivore;
import com.ing.zoo.behaviours.TrickPerformer;

public class Pig extends Animal implements Herbivore, Carnivore, TrickPerformer {
    public Pig(String name)
    {
        super(name, "splash");
    }

    @Override
    public void eatLeaves()
    {
        say("munch munch oink");
    }

    @Override
    public void eatMeat()
    {
        say("nomnomnom oink thx");
    }

    @Override
    public void performTrick()
    {
        sayRandom("rolls in the mud", "runs in circles");
    }
}
