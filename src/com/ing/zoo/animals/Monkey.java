package com.ing.zoo.animals;

import com.ing.zoo.behaviours.Carnivore;
import com.ing.zoo.behaviours.Herbivore;
import com.ing.zoo.behaviours.TrickPerformer;

public class Monkey extends Animal implements Herbivore, Carnivore, TrickPerformer {
    public Monkey(String name)
    {
        super(name, "oo oo aa aa");
    }

    @Override
    public void eatLeaves()
    {
        say("munch munch oo aa");
    }

    @Override
    public void eatMeat()
    {
        say("nomnomnom aa aa thx");
    }

    @Override
    public void performTrick()
    {
        sayRandom("swings from a branch", "juggles bananas");
    }
}
