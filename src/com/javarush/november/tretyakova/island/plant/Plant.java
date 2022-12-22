package com.javarush.november.tretyakova.island.herbivore;

public class Plant extends Herbivores {
    public double weight;
    public String icon;

    public Plant() {
        this.weight = 1;
        this.icon = " \uD83E\uDEB4";
    }
    @Override
    public String toString() {
        return icon;
    }
}
