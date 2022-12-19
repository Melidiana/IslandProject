package com.javarush.november.tretyakova.island.typesOfCreature;
import com.javarush.november.tretyakova.island.animal.Predators;

public class Bear extends Predators {
    public double weight;
    public int numberCellNoMoreThan;
    public double satiety;

    public Bear() {
        this.weight = 500;
        this.numberCellNoMoreThan = 2;
        this.satiety = 80;
    }
}
