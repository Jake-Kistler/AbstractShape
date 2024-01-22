//Jake Kistler
//Shape class

import java.awt.Color;

public abstract class Shape
{
   protected double x,y;
   protected Color color;
   protected boolean fill;

   public static final boolean SHAPE_DEFAULT_FILL = false;
   public static final Color SHAPE_DEFAULT_COLOR = Color.gray;
   public static final boolean SHAPE_SET_FILL = true;
   public static final boolean SHAPE_SET_OUTLINE = false;

   public Shape()
   {
       this.x = 0.0;
       this.y = 0.0;
       this.color = SHAPE_DEFAULT_COLOR;
       this.fill = SHAPE_DEFAULT_FILL;
   }

   public Color getColor()
   {
       return color;
   }

   public void setColor(Color c)
   {
       color = c;
   }

   public boolean getFill()
   {
       return fill;
   }

   public void setFill(boolean f)
   {
       fill = f;
   }

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void drawShape();

}//END CLASS
