package pl.sda.dublin.staticexample;

public class Person {

  public static final int ARRAY_SIZE = 20; // utworzenie stalej
  private static int liczbaOsob = 0;
  private String imie = "piotr";


  public Person(String imie) {
    liczbaOsob++;
    this.imie = imie;
    System.out.println("Jestem " + this.imie + "Utworzono juz: " + liczbaOsob);
  }
}
