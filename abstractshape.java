import java.util.*;

abstract class Shape{
	abstract void numberOfsides();
}

class Rectangle extends Shape{
void numberOfsides(){
int sides=4;
System.out.println("Number of sides is:" +sides);
}
}

class Triangle extends Shape{
void numberOfsides(){
int sides=3;
System.out.println("Number of sides is:" +sides);
}
}

class Hexagon extends Shape{
void numberOfsides(){
int sides=6;
System.out.println("Number of sides is:" +sides);
}
}

class abstractshape{
public static void main(String args[])
{
Rectangle shape1=new Rectangle();
Triangle shape2=new Triangle();
Hexagon shape3=new Hexagon();
shape1.numberOfsides();
shape2.numberOfsides();
shape3.numberOfsides();
}
}
