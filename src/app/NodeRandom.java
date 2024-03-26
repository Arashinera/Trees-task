package app;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class NodeRandom {

    //створюємо наш сет для подальшої генерації унікальних чисел :
    private static final Set<Integer> generatedNumbers = new HashSet<>();

    public static int Random(int min, int max) {
        Random rand = new Random();
        int randomInRange;

        do {
            randomInRange = rand.nextInt(max - min + 1) + min;
        } while (generatedNumbers.contains(randomInRange));

        generatedNumbers.add(randomInRange);
        return randomInRange;
    }

    //створюємо метод для очищення нашого сету :
    public static void clearGeneratedNumbers() {
        generatedNumbers.clear();
    }
}
