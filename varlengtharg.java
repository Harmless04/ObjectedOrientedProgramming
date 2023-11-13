import java.util.Scanner;

public class varlengtharg {

    public static double calculateRectangleArea(double... sides) {
       
        double length = sides[0];
        double width = sides[1];
        return length * width;
    }

    public static double calculateCircleArea(double... radius) {
        
        double r = radius[0];
        return Math.PI * r * r;
    }

    public static double calculateTriangleArea(double... sides) {
        
        double base = sides[0];
        double height = sides[1];
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate area:");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");
        System.out.print("Enter the corresponding number: ");

        int choice = scanner.nextInt();

        double area = 0.0;

        switch (choice) {
            case 1:
                System.out.print("Enter length and width of the rectangle: ");
                area = calculateRectangleArea(scanner.nextDouble(), scanner.nextDouble());
                break;

            case 2:
                System.out.print("Enter radius of the circle: ");
                area = calculateCircleArea(scanner.nextDouble());
                break;

            case 3:
                System.out.print("Enter base and height of the triangle: ");
                area = calculateTriangleArea(scanner.nextDouble(), scanner.nextDouble());
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }

        System.out.println("Area: " + area);
    }
}
