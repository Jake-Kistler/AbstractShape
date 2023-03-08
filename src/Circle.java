//Jake Kistler
//Advanced java
//OCCC Spring
//Circle class

public class Circle extends Ellipse
{
    // Constructors
    public Circle(double x, double y, double r)
    {
        super(x, y, r, r);
    }

    // Getter and Setter methods
    public double getRadius()
    {
        return getRadius1();
    }

    public void setRadius(double r)
    {
        setRadius1(r);
        setRadius2(r);
    }
}
