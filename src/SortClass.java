import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class SortClass {
    private static int[] tableau;
    Instant start;
    // Des instructions qui peuvent prendre du temps
    Instant end;
    static int SIZE = Integer.MAX_VALUE / 1000 ;

    public static void initialiserTableau() {
        Instant start = Instant.now();
        System.out.println("Debut d’initialisation...");
        Random random = new Random();
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = random.nextInt(SIZE);
        }
        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        System.out.println("L’initialisation a pris " + duration + " ms");
    }
}
