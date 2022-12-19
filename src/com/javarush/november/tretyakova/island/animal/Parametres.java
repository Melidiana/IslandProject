package com.javarush.november.tretyakova.island.animal;

public class Parametres {

    public static final Parametres WOLF_PARAMETRES = new Parametres(50, 30, 3, 8);
    public static final Parametres BOA_PARAMETRES = new Parametres(15, 30, 1, 3);
    public static final Parametres FOX_PARAMETRES = new Parametres(8, 30, 2, 2);
    public static final Parametres BEAR_PARAMETRES = new Parametres(500, 5, 2, 80);
    public static final Parametres EAGLE_PARAMETRES = new Parametres(6, 20, 3, 1);
    public static final Parametres HORSE_PARAMETRES = new Parametres(400, 20, 4, 60);
    public static final Parametres DEER_PARAMETRES = new Parametres(300, 20, 4, 50);
    public static final Parametres RABBIT_PARAMETRES = new Parametres(2, 150, 2, 0.45);
    public static final Parametres MOUSE_PARAMETRES = new Parametres(0.05, 500, 1, 0.01);
    public static final Parametres GOAT_PARAMETRES = new Parametres(60, 140, 3, 10);
    public static final Parametres SHEEP_PARAMETRES = new Parametres(70, 140, 3, 15);
    public static final Parametres BOAR_PARAMETRES = new Parametres(400, 50, 2, 50);
    public static final Parametres BUFFALO_PARAMETRES = new Parametres(700, 10, 3, 100);
    public static final Parametres DUCK_PARAMETRES = new Parametres(0.01, 1000, 0, 0);

    public double weight;
    public int maxNumberAnimalOnCage;
    public int numberCageNoMoreThan;
    public double feed;

    public Parametres(double weight, int maxNumberAnimalOnCage, int numberCageNoMoreThan, double feed) {
        this.weight = weight;
        this.maxNumberAnimalOnCage = maxNumberAnimalOnCage;
        this.numberCageNoMoreThan = numberCageNoMoreThan;
        this.feed = feed;
    }
}
