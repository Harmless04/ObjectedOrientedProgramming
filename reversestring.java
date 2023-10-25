import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = in.nextLine();
        StringBuilder str2 = new StringBuilder(str1).reverse();
        System.out.println("Original String: " + str1);
        System.out.println("Reversed String: " + str2);
    }
}
