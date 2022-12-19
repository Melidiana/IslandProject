package com.javarush.november.tretyakova.island.typesOfCreatures;

import com.javarush.november.tretyakova.island.animal.Herbivores;
import com.javarush.november.tretyakova.island.animal.Parametres;

public class Sheep extends Herbivores {
    protected Sheep(Parametres parametres) {
        super(Parametres.SHEEP_PARAMETRES);
    }
}
