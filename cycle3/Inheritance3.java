class Staff {
    int code;
    String name;

    Staff(int code, String name) {
        this.code = code;
        this.name = name;
    }
}

class Faculty extends Staff {
    String department, sub_taken, res_area;

    Faculty(int code, String name, String department) {
        super(code, name);
        this.department = department;
    }

}

class Typist extends Staff {
    String office;
    int speed;

    Typist(int code, String name, int speed) {
        super(code, name);
        this.speed = speed;

    }
}

class Officer extends Staff {
    char grade;
    String rank;

    Officer(int code, String name, char grade) {
        super(code, name);
        this.grade = grade;
    }

}

class Permanent extends Typist {
    int salary;

    Permanent(int code, String name, int salary, int speed) {
        super(code, name, speed);
        this.salary = salary;
    }

    void display() {
        System.out.println("Name=" + name);
        System.out.println("speed=" + speed);
        System.out.println("Salary=" + salary);

    }
}

class Casual extends Typist {
    int dailywage;

    Casual(int code, String name, int speed, int x) {
        super(code, name, speed);
        dailywage = x;
    }

    void display() {
        System.out.println("Name=" + name);
        System.out.println("Dailywage=" + dailywage);
        System.out.println("Speed=" + speed);
    }

}

class Inheritance {
    public static void main(String args[]) {
        Casual c = new Casual(63, "yyy", 45, 450);
        Permanent p = new Permanent(23, "Ajay", 50000, 80);
        p.display();
        c.display();

    }
}