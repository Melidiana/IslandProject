package com.javarush.november.tretyakova.island.typesOfCreature;
import com.javarush.november.tretyakova.island.animal.Herbivores;

public class Deer extends Herbivores {
    public double weight;
    public int numberCellNoMoreThan;
    public double satiety;

    public Deer() {
        this.weight = 300;
        this.numberCellNoMoreThan = 4;
        this.satiety = 50;
    }
}
