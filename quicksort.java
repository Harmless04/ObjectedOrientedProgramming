import java.util.Scanner;

public class quicksort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        String[] strings = new String[n];
        System.out.println("Enter " + n + " your string:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }
        quickSort(strings, 0, strings.length - 1);
        
        System.out.println("\nSorted array:");
        printArray(strings);
        
        scanner.close();
    }
    
    public static void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
     
       }
    }
    public static int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = (low - 1);
        
        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;
 
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }
    
    public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
