package com.javarush.november.tretyakova.island.typesOfCreature;
import com.javarush.november.tretyakova.island.animal.Herbivores;

public class Mouse extends Herbivores {
    public double weight;
    public int numberCellNoMoreThan;
    public double satiety;

    public Mouse() {
        this.weight = 0.05;
        this.numberCellNoMoreThan = 1;
        this.satiety = 0.01;
    }
}
