package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    Point pointA = new Point(4,16);
    Point pointB = new Point(11,28);

    System.out.println("Расстояние между точками через отдельный метод: " + distance(pointA, pointB));
    System.out.println("Расстояние между точками через метод класса: " + pointA.distance(pointB));
  }

  // Первоначальное решение
  public static double distance(Point pointA, Point pointB) {
    return Math.sqrt(Math.pow((pointB.x - pointA.x), 2) + Math.pow((pointB.y - pointA.y), 2));
  }
}