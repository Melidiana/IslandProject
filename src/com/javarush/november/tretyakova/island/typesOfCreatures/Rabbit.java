package com.javarush.november.tretyakova.island.typesOfCreatures;
import com.javarush.november.tretyakova.island.animal.Herbivores;
import com.javarush.november.tretyakova.island.animal.Parameters;

public class Rabbit extends Herbivores {
    protected Rabbit(Parameters parameters) {
        super(Parameters.RABBIT_PARAMETERS);
    }
}
