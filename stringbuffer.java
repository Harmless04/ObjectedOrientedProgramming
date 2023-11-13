import java.util.*;

public class stringbuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do{

            System.out.println("enter stringbuffer");
            String a = sc.nextLine();

            
            System.out.println("enter choice");
            System.out.println("1. insert a string in given position");
            System.out.println("2. modify a char");
            System.out.println("3. append a string");
            System.out.println("4. exit");

            System.out.println("enter option");
            n = sc.nextInt();
            
            sc.nextLine();
            

            
            StringBuffer str = new StringBuffer(a);

            if(n ==1){
                System.out.println("enter string to be inserted");
                String trash = sc.nextLine();
                System.out.println("enter location");
                int x = sc.nextInt();
                str.insert(x,trash);
                System.out.println(str);
            }
            else if(n==2){
                System.out.println("enter location: ");
                int x = sc.nextInt();



                System.out.println("enter char: ");
                char c = sc.next().charAt(0);
                
                str.setCharAt(x, c);

                System.out.println(str);

            }
            else if(n==3){
                System.out.println("enter string");
                String s = sc.nextLine();

                str.append(s);
                System.out.println(str);
            }
            else if(n==4){
                break;
            }


        }while(n != 4);

    }
}
