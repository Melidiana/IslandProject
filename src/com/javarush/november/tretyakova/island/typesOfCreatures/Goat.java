package com.javarush.november.tretyakova.island.typesOfCreatures;
import com.javarush.november.tretyakova.island.animal.Herbivores;
import com.javarush.november.tretyakova.island.animal.Parametres;

public class Goat extends Herbivores {
    protected Goat(Parametres parametres) {
        super(Parametres.GOAT_PARAMETRES);
    }
}
