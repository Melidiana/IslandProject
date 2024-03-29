package com.javarush.november.tretyakova.island.animal;

import com.javarush.november.tretyakova.island.animal.kind.Factory;
import com.javarush.november.tretyakova.island.animal.kind.enumerator.Kind;
import com.javarush.november.tretyakova.island.config.Configuration;
import com.javarush.november.tretyakova.island.location.Cell;
import com.javarush.november.tretyakova.island.model.IslandGenerator;

import java.util.concurrent.ThreadLocalRandom;

import static com.javarush.november.tretyakova.island.animal.utils.Counter.countBirth;
import static com.javarush.november.tretyakova.island.animal.utils.Counter.countMoves;
import static com.javarush.november.tretyakova.island.config.Configuration.breedChance;

public abstract class Animal {
    public static final String PLANT = "Plant";
    private final Fields fields;

    public Animal(Fields fields) {
        this.fields = fields;
    }

    public Fields getFields() {
        return fields;
    }

    public boolean move(Cell cell) {
        if (fields.getName().equals(PLANT)) {
            return false;
        }
        int newRow = (cell.getRow() + fields.getSpeed()) % Configuration.row;
        int newColumn = (cell.getColumn() + fields.getSpeed()) % Configuration.column;

        boolean isMove = ThreadLocalRandom.current().nextBoolean();

        if (newRow < 0 || newColumn < 0) {
            isMove = false;
        }

        if (isMove) {
            Kind kind = Kind.valueOf(this.getClass().getSimpleName().toUpperCase());
            IslandGenerator.ISLAND[newRow][newColumn].getAnimals().get(kind).add(this);
            countMoves(kind);
        }

        return isMove;
    }

    public void breed(Cell cell) {
        int randomNumber = ThreadLocalRandom.current().nextInt(100);
        Kind kind = Kind.valueOf(this.getClass().getSimpleName().toUpperCase());
        int currentProbability = breedChance.get(kind);

        int column = cell.getColumn();
        int row = cell.getRow();

        if (randomNumber < currentProbability) {
            IslandGenerator.ISLAND[row][column].getAnimals().get(kind).add(Factory.getInstance().getAnimalByKind(kind));
            countBirth(kind);
        }
    }

    @Override
    public String toString() {
        return fields.getIcon();
    }
}
