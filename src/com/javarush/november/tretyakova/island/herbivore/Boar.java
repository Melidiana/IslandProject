package com.javarush.november.tretyakova.island.typesOfCreature;
import com.javarush.november.tretyakova.island.animal.Herbivores;

public class Boar extends Herbivores {
    public double weight;
    public int numberCellNoMoreThan;
    public double satiety;

    public Boar() {
        this.weight = 400;
        this.numberCellNoMoreThan = 2;
        this.satiety = 50;
    }
}
