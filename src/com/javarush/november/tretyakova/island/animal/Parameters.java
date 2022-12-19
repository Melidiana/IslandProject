package com.javarush.november.tretyakova.island.animal;

public class Parameters {

    public static final Parameters WOLF_PARAMETERS = new Parameters(50, 30, 3, 8);
    public static final Parameters BOA_PARAMETERS = new Parameters(15, 30, 1, 3);
    public static final Parameters FOX_PARAMETERS = new Parameters(8, 30, 2, 2);
    public static final Parameters BEAR_PARAMETERS = new Parameters(500, 5, 2, 80);
    public static final Parameters EAGLE_PARAMETERS = new Parameters(6, 20, 3, 1);
    public static final Parameters HORSE_PARAMETERS = new Parameters(400, 20, 4, 60);
    public static final Parameters DEER_PARAMETERS = new Parameters(300, 20, 4, 50);
    public static final Parameters RABBIT_PARAMETERS = new Parameters(2, 150, 2, 0.45);
    public static final Parameters MOUSE_PARAMETERS = new Parameters(0.05, 500, 1, 0.01);
    public static final Parameters GOAT_PARAMETERS = new Parameters(60, 140, 3, 10);
    public static final Parameters SHEEP_PARAMETERS = new Parameters(70, 140, 3, 15);
    public static final Parameters BOAR_PARAMETERS = new Parameters(400, 50, 2, 50);
    public static final Parameters BUFFALO_PARAMETERS = new Parameters(700, 10, 3, 100);
    public static final Parameters DUCK_PARAMETERS = new Parameters(0.01, 1000, 0, 0);

    public double weight;
    public int maxNumberAnimalOnCage;
    public int numberCageNoMoreThan;
    public double feed;

    public Parameters(double weight, int maxNumberAnimalOnCage, int numberCageNoMoreThan, double feed) {
        this.weight = weight;
        this.maxNumberAnimalOnCage = maxNumberAnimalOnCage;
        this.numberCageNoMoreThan = numberCageNoMoreThan;
        this.feed = feed;
    }
}
