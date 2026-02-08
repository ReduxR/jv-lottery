package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private enum Color {
        GREEN,
        RED,
        PURPLE,
        BLUE,
        WHITE,
        BLACK
    }

    public String getRandomColor() {
        int choice = new Random().nextInt(Color.values().length);
        Color color = Color.values()[choice];
        return color.toString();
    }
}
