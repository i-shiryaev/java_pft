package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testDistance() {
    Point pointA = new Point(4, 16);
    Point pointB = new Point(11, 28);
    Assert.assertEquals(pointA.distance(pointB), 13.892443989449804);
  }

  @Test
  public void testDistanceAgain() {
    Point pointA = new Point(11, 22);
    Point pointB = new Point(33, 44);
    Assert.assertEquals(pointA.distance(pointB), 31.11269837220809);
  }
}