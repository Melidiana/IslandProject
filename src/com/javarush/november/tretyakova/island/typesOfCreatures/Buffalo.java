package com.javarush.november.tretyakova.island.typesOfCreatures;
import com.javarush.november.tretyakova.island.animal.Herbivores;

public class Buffalo extends Herbivores {
    public double weight;
    public int numberCellNoMoreThan;
    public double satiety;

    public Buffalo() {
        this.weight = 700;
        this.numberCellNoMoreThan = 3;
        this.satiety = 100;
    }
}
