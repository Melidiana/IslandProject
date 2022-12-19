package com.javarush.november.tretyakova.island.animal;

public abstract class Animal {
    public final Parameters parameters;

    protected Animal(Parameters parameters) {
        this.parameters = parameters;
    }
}
