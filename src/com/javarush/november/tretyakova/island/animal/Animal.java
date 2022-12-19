package com.javarush.november.tretyakova.island.animal;

public abstract class Animal {
    public final Parametres parametres;

    protected Animal(Parametres parametres) {
        this.parametres = parametres;
    }
}
