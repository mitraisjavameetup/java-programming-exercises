package com.mitrais.cdc.java.shapes;

public class Rectangle implements Shape {
  private double width, height;

  /**
   * Constructor of Rectangle
   * @param width
   * @param height
   */
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }
  
  /**
   * returns width of rectangle
   * @return width
   */
  public double getWidth() {
    return(width);
  }

  /**
   * Sets width of rectangle
   * @param width
   */
  public void setWidth(double width) {
    this.width = width;
  }

  /**
   * Return height of rectangle
   * @return height
   */
  public double getHeight() {
    return(height);
  }

  /**
   * Sets height of rectangle
   * @param height
   */
  public void setHeight(double height) {
    this.height = height;
  }

  /**
   * Calculate area of rectangle
   * @return area
   */
  @Override
  public double getArea() {
    return(width * height);
  }
}