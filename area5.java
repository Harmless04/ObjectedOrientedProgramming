import java.util.*;

public class area5 
{
    public static void main(String[] args)
    {	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter side of square");
        int side=sc.nextInt();
        System.out.println("Enter length of rectangle");
        int l=sc.nextInt();
        System.out.println("Enter breadth of rectangle");
        int b=sc.nextInt();
        System.out.println("Enter radius");
        int r=sc.nextInt();
        
        Rectangle obj = new Rectangle();
        obj.Area(l,b);
       
        Circle obj1 = new Circle();
        obj1.Area(r);
   
        Square obj2 = new Square();
        obj2.Area(side);
        
        
        
    }
}
class Square 
{
    void Area(double side)
    {
        System.out.println("Area of the Square: "+ side * side);
    }
}
class Circle 
{
    static final double PI = Math.PI;
    void Area(double r)
    {
        double A = PI * r * r;
  
        System.out.println("The area of the circle is :" + A);
    }
}
class Rectangle 
{
    void Area(double l, double b)
    {
        System.out.println("Area of the rectangle: " + l * b);
    }
}
