package com.javarush.november.tretyakova.island.plant;

public abstract class Plants {
    public final PlantParametres plantParametres;

    protected Plants(PlantParametres plantParametres) {
        this.plantParametres = plantParametres;
    }
}
