package com.ing.zoo.animals;

import com.ing.zoo.behaviours.Carnivore;
import com.ing.zoo.behaviours.TrickPerformer;

public class Tiger extends Animal implements Carnivore, TrickPerformer {
    public Tiger(String name)
    {
        super(name, "rraaarww");
    }

    @Override
    public void eatMeat()
    {
        say("nomnomnom oink wubalubadubdub");
    }

    @Override
    public void performTrick()
    {
        sayRandom("jumps in tree", "scratches ears");
    }
}
