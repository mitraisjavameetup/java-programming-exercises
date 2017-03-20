package com.mitrais.cdc.java.shape;

/**
 * Mitrais Java Training List
 * Rectangle class
 * @author mitrais
 * @version 1.1
 *
 */

public class Rectangle extends Shape {
  private double width, height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return(width);
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return(height);
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public double getArea() {
    return(width * height);
  }
}