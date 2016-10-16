package ru.stqa.pft.sandbox;

import java.util.Scanner;

/**
 * Created by katrushka on 16.10.2016.
 */
public class OddEvenTern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите целое число:");
    int number = sc.nextInt();
    String message = (number % 2) == 0 ? "Четное!" : "Нечетное!";
    System.out.println("Ваше число " + message);
    }

  }


