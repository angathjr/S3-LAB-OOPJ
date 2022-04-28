class Employee {
    String name, add;
    int phno, age, salery;

    Employee(String name, String add, int phno, int age, int salery) {
        this.name = name;
        this.add = add;
        this.phno = phno;
        this.salery = salery;
        this.age = age;
    }

    void print_salery() {
        System.out.println("salery=" + salery);
    }
}

class Officer extends Employee {
    String specialization;

    Officer(String name, String add, int phno, int salery, int age) {
        super(name, add, phno, salery, age);
        specialization = "M.com";
    }

    void Display() {
        System.out.println("Name=" + name);
        System.out.println("Age=" + age);
        System.out.println("Phone" + phno);
        System.out.println("Specialization" + specialization);
    }
}

class Members extends Employee {
    String Department;

    Members(String name, String add, int phno, int age, int salery) {
        super(name, add, phno, age, salery);
        Department = "sales";
    }

    void Display() {
        System.out.println("Name=" + name);
        System.out.println("Age=" + age);
        System.out.println("Phone" + phno);
        System.out.println("Department" + Department);
    }
}

class Employee_d {
    public static void main(String args[]) {
        Members m = new Members("John", "palazhi", 56, 65432, 77777);
        Officer o = new Officer("John honnay", "Kottayam", 56, 6543, 33355);
        m.Display();
        m.print_salery();
        o.Display();
        o.print_salery();
    }
}