package com.ing.zoo.animals;

import com.ing.zoo.behaviours.Carnivore;

public class Lion extends Animal implements Carnivore {
    public Lion(String name)
    {
        super(name, "roooaoaaaaar");
    }

    @Override
    public void eatMeat()
    {
        say("nomnomnom thx mate");
    }
}
