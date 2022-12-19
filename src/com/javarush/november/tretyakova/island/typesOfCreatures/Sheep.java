package com.javarush.november.tretyakova.island.typesOfCreatures;

import com.javarush.november.tretyakova.island.animal.Herbivores;
import com.javarush.november.tretyakova.island.animal.Parameters;

public class Sheep extends Herbivores {
    protected Sheep(Parameters parameters) {
        super(Parameters.SHEEP_PARAMETERS);
    }
}
