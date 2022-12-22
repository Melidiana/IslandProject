package com.javarush.november.tretyakova.island.typesOfCreature;
import com.javarush.november.tretyakova.island.animal.Herbivores;

public class Rabbit extends Herbivores {
    public double weight;
    public int numberCellNoMoreThan;
    public double satiety;

    public Rabbit() {
        this.weight = 2;
        this.numberCellNoMoreThan = 2;
        this.satiety = 0.45;
    }
}
