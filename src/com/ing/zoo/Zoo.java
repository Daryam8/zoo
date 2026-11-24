package com.ing.zoo;

import com.ing.zoo.animals.Animal;
import com.ing.zoo.animals.Bear;
import com.ing.zoo.animals.Hippo;
import com.ing.zoo.animals.Lion;
import com.ing.zoo.animals.Monkey;
import com.ing.zoo.animals.Pig;
import com.ing.zoo.animals.Tiger;
import com.ing.zoo.animals.Zebra;
import com.ing.zoo.behaviours.Carnivore;
import com.ing.zoo.behaviours.Herbivore;
import com.ing.zoo.behaviours.TrickPerformer;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    private static final String HELLO = "hello";
    private static final String GIVE_LEAVES = "give leaves";
    private static final String GIVE_MEAT = "give meat";
    private static final String PERFORM_TRICK = "perform trick";
    private static final String EXIT = "exit";

    private final List<Animal> animals = Arrays.<Animal>asList(
            new Lion("henk"),
            new Hippo("elsa"),
            new Pig("dora"),
            new Tiger("wally"),
            new Zebra("marty"),
            new Monkey("george"),
            new Bear("bruno")
    );

    public static void main(String[] args)
    {
        new Zoo().run();
    }

    private void run()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in (of exit): ");

        while(scanner.hasNextLine())
        {
            String input = scanner.nextLine().trim();
            if(input.equals(EXIT))
            {
                return;
            }
            execute(input);
            System.out.print("Voer uw command in (of exit): ");
        }
    }

    private void execute(String input)
    {
        if(input.equals(HELLO))
        {
            helloAll();
        }
        else if(input.startsWith(HELLO + " "))
        {
            hello(input.substring(HELLO.length()).trim());
        }
        else if(input.equals(GIVE_LEAVES))
        {
            giveLeaves();
        }
        else if(input.equals(GIVE_MEAT))
        {
            giveMeat();
        }
        else if(input.equals(PERFORM_TRICK))
        {
            performTricks();
        }
        else
        {
            System.out.println("Unknown command: " + input);
        }
    }

    private void helloAll()
    {
        for(Animal animal : animals)
        {
            animal.sayHello();
        }
    }

    private void hello(String name)
    {
        for(Animal animal : animals)
        {
            if(animal.getName().equalsIgnoreCase(name))
            {
                animal.sayHello();
                return;
            }
        }
        System.out.println("Unknown animal: " + name);
    }

    private void giveLeaves()
    {
        for(Animal animal : animals)
        {
            if(animal instanceof Herbivore)
            {
                ((Herbivore) animal).eatLeaves();
            }
        }
    }

    private void giveMeat()
    {
        for(Animal animal : animals)
        {
            if(animal instanceof Carnivore)
            {
                ((Carnivore) animal).eatMeat();
            }
        }
    }

    private void performTricks()
    {
        for(Animal animal : animals)
        {
            if(animal instanceof TrickPerformer)
            {
                ((TrickPerformer) animal).performTrick();
            }
        }
    }
}
