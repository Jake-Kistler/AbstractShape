//Jake Kistler
//Advanced java
//OCCC Spring
//Square class

public class Square extends Rectangle
{
    // Constructors
    public Square(double x, double y, double side)
    {
        super(x, y, side, side);  // Call Rectangle constructor with same width and height
    }

    // Getter and Setter methods
    public double getSide()
    {
        return getWidth();  // Square has same width and height, so we return width
    }

    public void setSide(double side)
    {
        setWidth(side);
        setHeight(side);  // Square has same width and height, so we set both to side
    }
}
