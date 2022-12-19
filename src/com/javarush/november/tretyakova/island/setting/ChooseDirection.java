package com.javarush.november.tretyakova.island.setting;
import com.javarush.november.tretyakova.island.enumerator.Direction;
import static com.javarush.november.tretyakova.island.enumerator.Direction.*;

public class ChooseDirection {

    Direction dir = Direction.generateRandomDirection();

    public void chooseDirection(Direction dir) {
        if (dir == UP) {
            System.out.println("Go up");
        }
        if (dir == DOWN) {
            System.out.println("Go down");
        }
        if (dir == LEFT) {
            System.out.println("Go left");
        }
        if (dir == RIGHT) {
            System.out.println("Go right");
        }
        if (dir == OnSPOT) {
            System.out.println("Stay on spot");
        }
    }
}
