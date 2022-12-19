package com.javarush.november.tretyakova.island.typesOfCreatures;

import com.javarush.november.tretyakova.island.animal.Herbivores;
import com.javarush.november.tretyakova.island.animal.Parameters;

public class Duck extends Herbivores {
    protected Duck(Parameters parameters) {
        super(Parameters.DUCK_PARAMETERS);
    }
}
