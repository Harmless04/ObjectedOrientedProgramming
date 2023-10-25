import java.util.Arrays;

public class str{
    public static void main(String[] args) {
        String[] stringArray = { "banana", "apple", "cherry", "gauva" , "orange"};
        Arrays.sort(stringArray);
        System.out.println("Sorted Array:");
        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}
