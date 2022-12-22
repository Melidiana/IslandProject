package com.javarush.november.tretyakova.island.typesOfCreature;
import com.javarush.november.tretyakova.island.animal.Herbivores;

public class Goat extends Herbivores {
    public double weight;
    public int numberCellNoMoreThan;
    public double satiety;

    public Goat() {
        this.weight = 60;
        this.numberCellNoMoreThan = 3;
        this.satiety = 10;
    }
}
