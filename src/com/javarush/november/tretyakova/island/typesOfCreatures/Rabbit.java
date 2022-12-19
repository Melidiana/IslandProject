package com.javarush.november.tretyakova.island.typesOfCreatures;
import com.javarush.november.tretyakova.island.animal.Herbivores;
import com.javarush.november.tretyakova.island.animal.Parametres;

public class Rabbit extends Herbivores {
    protected Rabbit(Parametres parametres) {
        super(Parametres.RABBIT_PARAMETRES);
    }
}
