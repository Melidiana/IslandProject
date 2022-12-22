package com.javarush.november.tretyakova.island.typesOfCreature;
import com.javarush.november.tretyakova.island.animal.Predators;

public class Wolf extends Predators {
    public double weight;
    public int numberCellNoMoreThan;
    public double satiety;

    public Wolf() {
        this.weight = 50;
        this.numberCellNoMoreThan = 3;
        this.satiety = 8;
    }
}
