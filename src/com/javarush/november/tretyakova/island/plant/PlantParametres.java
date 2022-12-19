package com.javarush.november.tretyakova.island.plant;

public class PlantParametres {
    public static final PlantParametres PLANT_PARAMETRES = new PlantParametres(1, 20);
    public double weight;
    public double maxNumberAnimalOnCage;

    public PlantParametres(int weight, int maxNumberAnimalOnCage) {
        this.weight = weight;
        this.maxNumberAnimalOnCage = maxNumberAnimalOnCage;
    }
}
