package com.mitrais.cdc.java.shapes;

public class Square extends Rectangle {
	/**
	 * Constructor of square
	 * @param width
	 */
  public Square(double width) {
    super(width, width);
  }

  /**
   * Get Width of square
   * @return width of square
   */
  @Override
  public double getHeight() {
    return(getWidth());
  }

  /**
   * Set side length of square
   * @param side
   */
  private void setSides(double side) {
    super.setWidth(side);
    super.setHeight(side);
  }
  
  /**
   * set side of square
   * @param height
   */
  @Override
  public void setHeight(double height) {
    setSides(height);
  }
  /**
   * set side of square
   * @param width
   */
  @Override
  public void setWidth(double width) {
    setSides(width);
  }
  /**
   * calculate side of square
   * @param area
   */
  public void setArea(double area) {
    setWidth(Math.sqrt(area));
  }
}