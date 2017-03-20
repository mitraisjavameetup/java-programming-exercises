package com.mitrais.cdc.java.shapes;

public class Circle implements Shape {
  private double radius;

  /** Builds a Circle with the given radius. 
   *  @param radius
   * */
  
  public Circle(double radius) {
    this.radius = radius;
  }

  /** Returns the current radius. 
   *  @return radius
   * */
  
  public double getRadius() {
    return(radius);
  }

  /** Sets the current radius. 
   *  @param radius
   * */
  
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /** Calculates the area from the radius. 
   *  @return area of circle
   * */
  @Override
  public double getArea() {
    return(Math.PI * radius * radius);
  }

  /** Indirectly sets the area by working backward to the radius.
   *  The resultant area may not be EXACTLY what you set, due to roundoff
   *  error when working with doubles.
   *  @param area
    */
  public void setArea(double area) {
    radius = Math.sqrt(area / Math.PI);
  }
}