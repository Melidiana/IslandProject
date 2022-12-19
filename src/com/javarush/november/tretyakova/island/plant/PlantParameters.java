package com.javarush.november.tretyakova.island.plant;

public class PlantParameters {
    public static final PlantParameters PLANT_PARAMETERS = new PlantParameters(1, 20);
    public double weight;
    public double maxNumberAnimalOnCage;

    public PlantParameters(int weight, int maxNumberAnimalOnCage) {
        this.weight = weight;
        this.maxNumberAnimalOnCage = maxNumberAnimalOnCage;
    }
}
