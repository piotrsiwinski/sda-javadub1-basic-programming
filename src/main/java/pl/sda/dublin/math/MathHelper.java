package pl.sda.dublin.math;

public class MathHelper {

  // Zaimplementuj silnie rekurencyjnie
  public static int factorial(int n) {
    System.out.println(n);
    if (n == 0 || n == 1) {
      return 1;
    }
    return n * factorial(n - 1);
  }
}
