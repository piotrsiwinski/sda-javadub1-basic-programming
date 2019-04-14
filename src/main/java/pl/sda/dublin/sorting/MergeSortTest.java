package pl.sda.dublin.sorting;

import java.util.Random;

public class MergeSortTest {
  public static void main(String[] args) {
    //

    int[] tablicaDoPosortowania = {14, 7, 3, 12, 9, 11, 6, 2};

    System.out.println("Tablica przed sortowaniem");
    printArray(tablicaDoPosortowania);
    MergeSort.sort(tablicaDoPosortowania);

    System.out.println("Tablica po sortowaniu");
    printArray(tablicaDoPosortowania);

    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();

    int[] testowaTablica = getRandomArray(100);
    System.out.println("Tablica przed sortowaniem");
    printArray(testowaTablica);
    MergeSort.sort(testowaTablica);

    System.out.println("Tablica po sortowaniu");
    printArray(testowaTablica);
  }

  private static void printArray(int[] tab) {
    for (int i = 0; i < tab.length; i++) {
      System.out.print(tab[i] + ", ");
    }
    System.out.println();
  }

  private static int[] getRandomArray(int n) {
    final int bound =100;
    Random random = new Random();
    int[] resultArray = new int[n];
    for (int i = 0; i < n; i++) {
      resultArray[i] = random.nextInt(bound);
    }
    return resultArray;
  }
}
