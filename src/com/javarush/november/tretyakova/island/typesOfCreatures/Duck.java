package com.javarush.november.tretyakova.island.typesOfCreatures;

import com.javarush.november.tretyakova.island.animal.Herbivores;
import com.javarush.november.tretyakova.island.animal.Parametres;

public class Duck extends Herbivores {
    protected Duck(Parametres parametres) {
        super(Parametres.DUCK_PARAMETRES);
    }
}
