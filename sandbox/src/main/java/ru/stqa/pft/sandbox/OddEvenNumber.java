package ru.stqa.pft.sandbox;

import java.util.Scanner;

/**
 * Created by katrushka on 16.10.2016.
 */
public class OddEvenNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите целое число:");
    int number = sc.nextInt();
    if (number % 2 == 0) {
      System.out.println("Четное!");
    } else {
      System.out.println("Нечетное!");
    }

  }

}
