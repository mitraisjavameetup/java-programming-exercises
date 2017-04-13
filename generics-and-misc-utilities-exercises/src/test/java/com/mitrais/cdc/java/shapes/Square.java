package com.mitrais.cdc.java.shapes;

public class Square extends Rectangle {
  public Square(double width) {
    super(width, width);
  }

  @Override
  public double getHeight() {
    return(getWidth());
  }

  private void setSides(double side) {
    super.setWidth(side);
    super.setHeight(side);
  }
  
  @Override
  public void setHeight(double height) {
    setSides(height);
  }
  
  @Override
  public void setWidth(double width) {
    setSides(width);
  }

  public void setArea(double area) {
    setWidth(Math.sqrt(area));
  }
}