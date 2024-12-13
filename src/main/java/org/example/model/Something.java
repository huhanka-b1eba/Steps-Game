package org.example.model;

public class Something extends Entity {


    public Something() {}

    public Something(int x, int y) {
        super("Нечто", x, y);
    }

    @Override
    public void move() {
        if (((int) (Math.random() * 500)) == 10) {
            x = (int) (Math.random() * fieldWidth);
            y = (int) (Math.random() * fieldHeigth);
        }
    }
}
