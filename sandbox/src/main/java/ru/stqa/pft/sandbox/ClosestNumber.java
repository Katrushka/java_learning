package ru.stqa.pft.sandbox;
import java.util.Scanner;

import static java.lang.Math.abs;

/**
 * Created by katrushka on 16.10.2016.
 */
public class ClosestNumber {
  public static void main(String[] args){

    System.out.println("Определим какое из двух числел a или b ближе к с ");
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите свое первое число(а):");
    double a = sc.nextDouble();

    System.out.println("Введите свое второе число(б):");
    double b = sc.nextDouble();

    System.out.println("Введите свое третье число(c):");
    double с = sc.nextDouble();
    if (abs(с-a)>abs(с-b)){
      System.out.println("Ближе к с: " + с + " число b: " + b);
    }
    if (abs(с-a)<abs(с-b)){
      System.out.println("Ближе к с: " + с + " число а: " + a);
    }
    if (abs(с-a)==abs(с-b)){
      System.out.println("Ближе к с: " + с + " число а: " + a);
    }

  }
}
