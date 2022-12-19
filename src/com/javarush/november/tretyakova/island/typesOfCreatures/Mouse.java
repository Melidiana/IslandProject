package com.javarush.november.tretyakova.island.typesOfCreatures;
import com.javarush.november.tretyakova.island.animal.Herbivores;
import com.javarush.november.tretyakova.island.animal.Parametres;

public class Mouse extends Herbivores {
    protected Mouse(Parametres parametres) {
        super(Parametres.MOUSE_PARAMETRES);
    }
}
