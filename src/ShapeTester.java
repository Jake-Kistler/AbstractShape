//Jake Kistler
//Advanced java
//OCCC Spring
//ShapeTester

import java.awt.Color;

public class ShapeTester
{
    public static void main(String[] args)
    {
        /*
        // Create a default Shape object
        Shape shape = new Shape();
        System.out.println("Shape color: " + shape.getColor());
        System.out.println("Shape fill: " + shape.getFill());
        System.out.println("Shape x: " + shape.getX());
        System.out.println("Shape y: " + shape.getY());
        System.out.println("Shape area: " + shape.getArea());
        System.out.println("Shape perimeter: " + shape.getPerimeter());
        shape.drawShape();

         */

        // Create an Ellipse object
        Ellipse ellipse = new Ellipse(10, 10, 5, 3);
        System.out.println("Ellipse color: " + ellipse.getColor());
        System.out.println("Ellipse fill: " + ellipse.getFill());
        System.out.println("Ellipse x: " + ellipse.getX());
        System.out.println("Ellipse y: " + ellipse.getY());
        System.out.println("Ellipse area: " + ellipse.getArea());
        System.out.println("Ellipse perimeter: " + ellipse.getPerimeter());
        ellipse.drawShape();
        System.out.println();

        // Create a Circle object
        Circle circle = new Circle(20, 20, 5);
        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Circle fill: " + circle.getFill());
        System.out.println("Circle x: " + circle.getX());
        System.out.println("Circle y: " + circle.getY());
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        circle.drawShape();
        System.out.println();

        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(30, 30, 4, 6);
        System.out.println("Rectangle color: " + rectangle.getColor());
        System.out.println("Rectangle fill: " + rectangle.getFill());
        System.out.println("Rectangle x: " + rectangle.getX());
        System.out.println("Rectangle y: " + rectangle.getY());
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        rectangle.drawShape();
        System.out.println();

        // Create a Square object
        Square square = new Square(40, 40, 5);
        System.out.println("Square color: " + square.getColor());
        System.out.println("Square fill: " + square.getFill());
        System.out.println("Square x: " + square.getX());
        System.out.println("Square y: " + square.getY());
        System.out.println("Square area: " + square.getArea());
        System.out.println("Square perimeter: " + square.getPerimeter());
        square.drawShape();
        System.out.println();

        // Create a Hexagon object
        Hexagon hexagon = new Hexagon(50, 50, 5);
        System.out.println("Hexagon color: " + hexagon.getColor());
        System.out.println("Hexagon fill: " + hexagon.getFill());
        System.out.println("Hexagon x: " + hexagon.getX());
        System.out.println("Hexagon y: " + hexagon.getY());
        System.out.println("Hexagon area: " + hexagon.getArea());
        System.out.println("Hexagon perimeter: " + hexagon.getPerimeter());
        hexagon.drawShape();
        System.out.println();
    }//END MAIN
}//END CLASS
