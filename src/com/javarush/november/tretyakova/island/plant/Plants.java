package com.javarush.november.tretyakova.island.plant;

public abstract class Plants {
    public final PlantParameters plantParameters;

    protected Plants(PlantParameters plantParameters) {
        this.plantParameters = plantParameters;
    }
}
