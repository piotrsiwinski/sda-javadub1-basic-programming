package pl.sda.dublin.oop;

public class Kwadrat extends Figura {

  private double a;
  private double mojaWartosc;

  public Kwadrat(double a) {
    if (a <= 0) {
      throw new IllegalArgumentException("Bok kwadratu nie moze byc mniejszy od zera");
    }
    this.a = a;
  }

  public double obliczPole() {
    return a * a;
  }

  public double obliczObwod() {
    return 4 * a;
  }
}
