package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();

        int randomNumber = new Random().nextInt(100);
        String randomColor = supplier.getRandomColor();

        return new Ball(randomColor, randomNumber);
    }
}
