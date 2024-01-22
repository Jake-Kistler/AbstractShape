//Jake Kistler
//Ellipse class

public class Ellipse extends Shape
{
    // Properties
    private double radius1;
    private double radius2;

    // Constructors
    public Ellipse(double x, double y, double r1, double r2)
    {
        super();
        this.x = x;
        this.y = y;
        this.radius1 = r1;
        this.radius2 = r2;
    }

    // Getter and Setter methods
    public double getRadius1()
    {
        return radius1;
    }

    public void setRadius1(double r1)
    {
        radius1 = r1;
    }

    public double getRadius2()
    {
        return radius2;
    }

    public void setRadius2(double r2)
    {
        radius2 = r2;
    }

    // Override methods from Shape
    @Override
    public double getArea()
    {
        return Math.PI * radius1 * radius2;
    }

    @Override
    public double getPerimeter()
    {
        return 2.0 * Math.PI * Math.sqrt((radius1 * radius1 + radius2 * radius2) / 2.0);
    }

    @Override
    public void drawShape()
    {
        System.out.println("Drawing ellipse with radius1 = " + radius1 + " and radius2 = " + radius2);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

}


