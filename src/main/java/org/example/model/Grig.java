package org.example.model;

public class Grig extends Entity {
    public Grig() {}

    public Grig(int x, int y) {
        super("Кузнечик", x, y);
    }

    @Override
    public void move() {
        int direction = (int) (Math.random() * 4);
        switch (direction) {
            case 0:
                if (y > 1){
                    y -= 2;
                }
                break;
            case 1:
                if ((x + 2) < fieldWidth){
                    x += 3;
                }
                break;
            case 2:
                if ((y+2) < fieldHeigth){
                    y += 2;
                }
                break;
            case 3:
                if (x > 1){
                    x -= 2;
                }
                break;
        }
    }
}
