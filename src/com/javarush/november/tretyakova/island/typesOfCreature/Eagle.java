package com.javarush.november.tretyakova.island.typesOfCreature;
import com.javarush.november.tretyakova.island.animal.Predators;

public class Eagle extends Predators {
    public double weight;
    public int numberCellNoMoreThan;
    public double satiety;

    public Eagle() {
        this.weight = 6;
        this.numberCellNoMoreThan = 3;
        this.satiety = 1;
    }
}
