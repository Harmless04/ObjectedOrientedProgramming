import java.util.Scanner;

class Employee{
    String name;
    int age;
    int phonenum;
    String address;
    int salary;

    void printSalary(){
        System.out.println(salary);
    }
}

class Officer extends Employee{
    String specialization;
    Officer(String name, int age, int ph, String add, int sal, String spe){
        this.name = name;
        this.age = age;
        phonenum = ph;
        address = add;
        salary = sal;
        specialization = spe;
    }
}

class Manager extends Employee{
    String department;
    Manager(String name, int age, int ph, String add, int sal, String dept){
        this.name = name;
        this.age = age;
        phonenum = ph;
        address = add;
        salary = sal;
        department = dept;
    }
}

class inh1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name of officer: ");
        String name = sc.nextLine();
        System.out.println("enter age of officer: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("enter phone number of officer: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("enter address of officer: ");
        String add = sc.nextLine();
        System.out.println("enter salary of officer: ");
        int salary = sc.nextInt();
        sc.nextLine();
        System.out.println("enter specialization of officer: ");
        String spe = sc.nextLine();

        Officer o1 = new Officer(name, age, n, add, salary, spe);

        System.out.println("enter name of manager: ");
        name = sc.nextLine();
        System.out.println("enter age of manager: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("enter phone number of manager: ");
        n = sc.nextInt();
        sc.nextLine();
        System.out.println("enter address of manager: ");
        add = sc.nextLine();
        System.out.println("enter salary of manager: ");
        salary = sc.nextInt();
        sc.nextLine();
        System.out.println("enter department of manager: ");
        String dept = sc.nextLine();

        Manager m1 = new Manager(name, age, n, add, salary, dept);

        System.out.println(o1.name);
        System.out.println(o1.age);
        System.out.println(o1.phonenum);
        System.out.println(o1.address);
        System.out.println(o1.salary);
        System.out.println(o1.specialization);
        System.out.println(" ");

        System.out.println(m1.name);
        System.out.println(m1.age);
        System.out.println(m1.phonenum);
        System.out.println(m1.address);
        System.out.println(m1.salary);
        System.out.println(m1.department);

        sc.close();



    }
}
