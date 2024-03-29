package com.javarush.november.tretyakova.island.animal.kind.predator;

import com.javarush.november.tretyakova.island.animal.Animal;
import com.javarush.november.tretyakova.island.animal.Fields;
import com.javarush.november.tretyakova.island.animal.kind.enumerator.Kind;
import com.javarush.november.tretyakova.island.config.Configuration;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static com.javarush.november.tretyakova.island.animal.utils.Counter.countDeath;

public abstract class Predator extends Animal {
    private double consumedFood = 0;
    private int hunger = 0;

    public Predator(Fields fields) {
        super(fields);
    }

    public int getHunger() {
        return hunger;
    }

    public void gettingHungry() {
        this.hunger++;
        this.consumedFood -= 10;
    }

    public void eat(List<Animal> animals) {
        int randomNumber;
        Iterator<Animal> iterator = animals.iterator();

        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            randomNumber = ThreadLocalRandom.current().nextInt(100);

            int predatorIndex = Kind.valueOf(this.getClass().getSimpleName().toUpperCase()).ordinal();
            int preyIndex = Kind.valueOf(animal.getClass().getSimpleName().toUpperCase()).ordinal();
            int currentProbability = Configuration.probabilities[predatorIndex][preyIndex];

            if (randomNumber < currentProbability) {
                this.consumedFood += animal.getFields().getWeight();
                if (this.getFields().getMaxFoodRequired() >= consumedFood) {
                    iterator.remove();
                    countDeath(animal);
                } else {
                    break;
                }
            }
        }
    }
}
