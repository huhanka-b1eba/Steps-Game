package org.example.model;

public class Turtle extends Entity {
    public Turtle() {}

    public Turtle(int x, int y) {
        super("Черепаха", x, y);
    }

    @Override
    public void move() {
        int direction = (int) (Math.random() * 4);
        switch (direction) {
            case 0:
                if (y > 0 && x > 0){
                    --y;
                    --x;
                }
                break;
            case 1:
                if (x < fieldWidth && y < fieldHeigth){
                    ++x;
                    ++y;
                }
                break;
            case 2:
                if (y < fieldHeigth && x > 0){
                    ++y;
                    --x;
                }
                break;
            case 3:
                if (x > 0 && y < fieldWidth){
                    --x;
                    ++y;
                }
                break;
        }
    }
}
