package pl.sda.dublin.oop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Program {

  public static void wypiszDaneFigury(Figura figura){
    double obwod = figura.obliczObwod();
    double v = figura.podajIloscLiterWNazwie();
    System.out.println(obwod);
  }

  public void test(Object o){

  }

  public static void main(String[] args) {


    double bok = 5;

    double a = 10;
    double b = 20;

    Kwadrat malyKwadrat = new Kwadrat(bok);
    Prostokat p = new Prostokat(a, b);

    Figura mojaFigura = malyKwadrat;

    Figura drugaFigura = new Prostokat(2,2);

    drugaFigura.obliczObwod();


    wypiszDaneFigury(malyKwadrat);
    wypiszDaneFigury(mojaFigura);
    wypiszDaneFigury(new Prostokat(2,3));
    wypiszDaneFigury(new Prostokat(8,10));
    wypiszDaneFigury(new Kwadrat(2));



  }
}
