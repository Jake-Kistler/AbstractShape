//Jake Kistler
//Advanced java
//OCCC Spring
//Rectangle class
public class Rectangle extends Shape
{
    // Fields
    private double width;
    private double height;

    // Constructors
    public Rectangle(double x, double y, double width, double height)
    {
        super();
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }


    // Getter and Setter methods
    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    // Overridden methods
    @Override
    public double getArea()
    {
        return width * height;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * (width + height);
    }

    @Override
    public void drawShape()
    {
        System.out.println("Drawing rectangle with width = " + width + " and height = " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
