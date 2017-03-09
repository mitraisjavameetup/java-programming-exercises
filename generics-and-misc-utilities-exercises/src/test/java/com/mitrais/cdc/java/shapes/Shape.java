package com.mitrais.cdc.java.shapes;

public interface Shape {
  double getArea(); // All real shapes must define a getArea 
  
  public static double sumAreas(Shape[] shapes) {
    double sum = 0;
    for(Shape s: shapes) {
      sum = sum + s.getArea();
    }
    return(sum);
  }
}