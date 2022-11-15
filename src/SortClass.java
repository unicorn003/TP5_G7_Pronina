import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
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
    public static int @NotNull [] copyTableau(){
        int[] tableauSelection = new int[SIZE];
        System.arraycopy(tableau, 0, tableauSelection, 0, SIZE);
        return  tableauSelection;
    }
    public static void triSelection(int[] tableauSelection){
        Instant start = Instant.now();
        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        System.out.println("Le tri par sélection a pris " + duration + " ms");

    }
    public static void triInsertion(int[] tableauSelection){
        Instant start = Instant.now();
        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        System.out.println("Le tri par insertion a pris " + duration + " ms");

    }
    // triBulles
    public static void triBulles(int[] tableauSelection){
        Instant start = Instant.now();
        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        System.out.println("Le tri par bulles a pris " + duration + " ms");

    }
    public static void swap(int[] tableauSelection, int i, int j){
        int temp = tableauSelection[i];
        tableauSelection[i] = tableauSelection[j];
        tableauSelection[j]= temp;
    }
    public static int  partition(int[] tableauSelection,  int indGauche, int indDroit){
        int pivot = tableauSelection[indDroit];
        int i = indGauche - 1;
        for (int j = indGauche; j <= indDroit - 1; j++) {
            if (tableauSelection[j] < pivot){
               i++;
               swap(tableauSelection, i,j);
            }
        }
        swap(tableauSelection, i+1, indDroit);
        return i+1;
    }
    public static void  quickSort(int[] tableauSelection,  int indGauche, int indDroit){
        Instant start = Instant.now();
        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        System.out.println("Le tri par quickSort a pris " + duration + " ms");

    }

    public static void triJava(int[] tableauSelection){
        Instant start = Instant.now();
        Arrays.sort(tableauSelection);
        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        System.out.println("Le tri par Java a pris " + duration + " ms");

    }
}
