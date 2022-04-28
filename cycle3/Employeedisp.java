class Employeee {
    void calc_salery() {
        System.out.println("The salery of Employee is 10000");
    }

    void display() {
        System.out.println("The name of the class is Employee");
    }
}

class Engineer extends Employeee {
    void calc_salery() {
        System.out.println("The salery of Employee is 20000 ");
        super.display();
        super.calc_salery();
    }

    void display() {
        System.out.println("The name of the class is Engineer");
    }
}

class Employeedisp {
    public static void main(String args[]) {
        Engineer emp = new Engineer();
        emp.display();
        emp.calc_salery();

    }
}