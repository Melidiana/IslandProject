package com.javarush.november.tretyakova.island.typesOfCreatures;
import com.javarush.november.tretyakova.island.animal.Herbivores;
import com.javarush.november.tretyakova.island.animal.Parameters;

public class Deer extends Herbivores {
    protected Deer(Parameters parameters) {
        super(Parameters.DEER_PARAMETERS);
    }
}
