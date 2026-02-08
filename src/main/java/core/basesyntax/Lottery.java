package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(101);
        String randomColor = supplier.getRandomColor();

        return new Ball(randomColor, randomNumber);
    }
}
