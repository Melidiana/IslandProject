package com.javarush.november.tretyakova.island.typesOfCreature;
import com.javarush.november.tretyakova.island.animal.Herbivores;

public class Sheep extends Herbivores {
    public double weight;
    public int numberCellNoMoreThan;
    public double satiety;

    public Sheep() {
        this.weight = 70;
        this.numberCellNoMoreThan = 3;
        this.satiety = 15;
    }
}
