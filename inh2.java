class Employee {
    int salary;

    void display() {
        System.out.println("employee");
    }

    void calcSalary() {
        System.out.println("employee-1000");
    }
}

class Enginner extends Employee {
    void calcSalary() {
        super.calcSalary();
        System.out.println("engineer-2000");
    }
}

class inh2 {
    public static void main(String[] args) {
        Enginner e1 = new Enginner();
        e1.display();
        e1.calcSalary();

    }
}
