package com.javarush.november.tretyakova.island.typesOfCreature;
import com.javarush.november.tretyakova.island.animal.Predators;

public class Fox extends Predators {
    public double weight;
    public int numberCellNoMoreThan;
    public double satiety;

    public Fox() {
        this.weight = 8;
        this.numberCellNoMoreThan = 2;
        this.satiety = 2;
    }
}
