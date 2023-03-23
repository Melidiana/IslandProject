package com.javarush.november.tretyakova.island.animal.kind.predator;

import com.javarush.november.tretyakova.island.animal.Fields;

public class Bear extends Predator {
    public static int deathCounter = 0;
    public static int moveCounter = 0;
    public static int bornCounter = 0;

    public Bear(Fields fields) {
        super(fields);
    }
}
