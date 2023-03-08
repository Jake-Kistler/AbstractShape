//Jake Kistler
//Advanced java
//OCCC Spring
//Hexagon class

import java.awt.Color;

public class Hexagon extends Shape
{
    // Properties
    private double sideLength;

    // Constants
    private static final int NUM_SIDES = 6;
    private static final double SQRT_3 = Math.sqrt(3);

    // Constructors
    public Hexagon(double x, double y, double sideLength)
    {
        super();
        this.x = x;
        this.y = y;
        this.sideLength = sideLength;
    }

    // Getter and Setter methods
    public double getSideLength()
    {
        return sideLength;
    }

    public void setSideLength(double sideLength)
    {
        this.sideLength = sideLength;
    }

    // Override methods
    @Override
    public double getArea()
    {
        return (3 * SQRT_3 / 2) * Math.pow(sideLength, 2);
    }

    @Override
    public double getPerimeter()
    {
        return NUM_SIDES * sideLength;
    }

    @Override
    public void drawShape()
    {
        System.out.println("Drawing hexagon with side length " + sideLength + " at (" + getX() + ", " + getY() + ")");
    }
}

