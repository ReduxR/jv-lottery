package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();
    private final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor(), random.nextInt(MAX_NUMBER) + 1);
    }
}
