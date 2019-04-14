package pl.sda.dublin.strukturydanych;

public class StosProgram {
  public static void main(String[] args) {

int[]arr = new int[5];

    System.out.println(arr);

    Stos<String> stos = new Stos<>(3);
    System.out.println(stos);
    stos.push("A");
    stos.push("B");
    stos.push("C");

    System.out.println(stos);

//    for (int i = 0; i < 4; i++) {
//      String element = stos.pop();
//      System.out.println(element);
//    }


      Stos<Integer> stosLiczb = new Stos<>(10);

      int wiek = 0;

      // boxing
      Integer integer = 20;

      wiek =  integer;

      // boxing i unboxing



      //
      Integer liczba = null;
      int mojaLiczba = liczba;
  }
}
