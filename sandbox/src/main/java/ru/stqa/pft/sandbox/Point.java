package ru.stqa.pft.sandbox;

public class Point {
  public double x;
  public double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distance(Point pointB) {
    return Math.sqrt(Math.pow((pointB.x - this.x), 2) + Math.pow((pointB.y - this.y), 2));
  }
}
