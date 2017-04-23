package com.mitrais.cdc.java;

import java.util.*;

public class PolygonTest {

    public static void main(String[] args) {
    /*
     * Create Polygon using EquilateralTriangle and Square
	 * then print out the totalsides  
	 */

        RegularPolygon[] r = {
                new EquilateralTriangle(10),
                new Square(20),
                new EquilateralTriangle(11.5),
                new Square(14.7)
        };

        System.out.println(RegularPolygon.totalSides(r));


    }
}
