package pl.sda.dublin.math;

import pl.sda.dublin.oop.Figura;
import pl.sda.dublin.oop.Kwadrat;
import pl.sda.dublin.oop.Prostokat;
import pl.sda.dublin.strukturydanych.Stos;

public class Program {
  public static void main(String[] args) {
    Stos<Figura> imiona = new Stos<>(5);

    for (int i = 0; i < 10; i++) {
      imiona.push(new Kwadrat(2));
    }
  }
}
