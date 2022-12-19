package com.javarush.november.tretyakova.island.typesOfCreature;
import com.javarush.november.tretyakova.island.animal.Herbivores;

public class Duck extends Herbivores {
    public double weight;
    public int numberCellNoMoreThan;
    public double satiety;

    public Duck() {
        this.weight = 1;
        this.numberCellNoMoreThan = 4;
        this.satiety = 0.15;
    }
}
