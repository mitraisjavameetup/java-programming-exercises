package com.mitrais.cdc.java.shapes;

public interface Shape {
  double getArea(); // All real shapes must define a getArea 
  
  /**
   * Sum area of shapes
   * @param shapes
   * @return sum of shapes
   */
  public static double sumAreas(Shape[] shapes) {
    double sum = 0;
    for(Shape s: shapes) {
      sum = sum + s.getArea();
    }
    return(sum);
  }
}