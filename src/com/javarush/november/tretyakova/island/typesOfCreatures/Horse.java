package com.javarush.november.tretyakova.island.typesOfCreatures;
import com.javarush.november.tretyakova.island.animal.Herbivores;
import com.javarush.november.tretyakova.island.animal.Parametres;

public class Horse extends Herbivores {
    protected Horse(Parametres parametres) {
        super(Parametres.HORSE_PARAMETRES);
    }
}
