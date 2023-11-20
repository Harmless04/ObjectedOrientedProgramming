import java.util.Scanner;

interface Sports {
    float sportwt = 6.0F;
    void putwt();
}

class Student {
    int rollnumber;

    void getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        rollnumber = scanner.nextInt();
    }

    void putNumber() {
        System.out.println("Rollno: " + rollnumber);
    }
}

class Test extends Student {
    float term1, term2;

    void getMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Term 1 marks: ");
        term1 = scanner.nextFloat();
        System.out.print("Enter Term 2 marks: ");
        term2 = scanner.nextFloat();
    }

    void putMarks() {
        System.out.println("Marks obtained");
        System.out.println("Term 1=" + term1);
        System.out.println("Term 2=" + term2);
    }
}

class Results extends Test implements Sports {
    public void putwt() {
        System.out.println("Sports weightage=" + sportwt);
    }

    void displayTotalScore() {
        float totalScore = term1 + term2 + sportwt;
        System.out.println("Total Score=" + totalScore);
    }
}

public class Main {
    public static void main(String[] args) {
        Results result = new Results();
        result.getNumber();
        result.getMarks();
        result.putNumber();
        result.putMarks();
        result.putwt();
        result.displayTotalScore();
    }
}

	
