import java.util.Scanner;

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class periconstruct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dimensions of the first rectangle:");
        System.out.print("Length: ");
        double length1 = scanner.nextDouble();
        System.out.print("Width: ");
        double width1 = scanner.nextDouble();

        System.out.println("Enter the dimensions of the second rectangle:");
        System.out.print("Length: ");
        double length2 = scanner.nextDouble();
        System.out.print("Width: ");
        double width2 = scanner.nextDouble();

        Rectangle rectangle1 = new Rectangle(length1, width1);
        Rectangle rectangle2 = new Rectangle(length2, width2);

        double perimeter1 = rectangle1.calculatePerimeter();
        double perimeter2 = rectangle2.calculatePerimeter();

        System.out.println("Perimeter of the first rectangle: " + perimeter1);
        System.out.println("Perimeter of the second rectangle: " + perimeter2);

        scanner.close();
    }
}
