package pl.sda.dublin.strukturydanych;

public class Stos<E> {

  private int index = 0;
  private Object[] elements;

  public Stos(int size) {
    elements = new Object[size];
  }

  public void push(E element) {
    // wyrzuć wyjątek - wypisac komunikat, ze stos pelny
    // jezeli index jest mniejszy od dlugosci tablicy - to mozemy wstawic nowy element
    if (index < elements.length){
      elements[index] = element;
      index++;
    } else {
      System.out.println("Przepelniony stos");
    }
  }


}
