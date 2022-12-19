package com.javarush.november.tretyakova.island.typesOfCreatures;
import com.javarush.november.tretyakova.island.animal.Herbivores;
import com.javarush.november.tretyakova.island.animal.Parametres;

public class Deer extends Herbivores {
    protected Deer(Parametres parametres) {
        super(Parametres.DEER_PARAMETRES);
    }
}
