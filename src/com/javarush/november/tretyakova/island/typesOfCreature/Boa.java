package com.javarush.november.tretyakova.island.typesOfCreature;
import com.javarush.november.tretyakova.island.animal.Predators;

public class Boa extends Predators {
    public double weight;
    public int numberCellNoMoreThan;
    public double satiety;

    public Boa() {
        this.weight = 15;
        this.numberCellNoMoreThan = 1;
        this.satiety = 3;
    }
}
