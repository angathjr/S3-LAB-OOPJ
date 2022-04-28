import java.io.*;
import java.util.Scanner;

class Student {
    public String name;
    public int roll;
    public int age;
    public String course;

    Student() {
        name = " ";
        age = 0;
        roll = 0;
        course = " ";
    }
}

class InvalidAge extends Exception {
    InvalidAge(String str) {
        super(str);
    }
}

class Q7 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter how many students :");
        int num = s.nextInt();
        Student Std[] = new Student[200];
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        for (int i = 0; i < num; i++) {
            try {
                Std[i] = new Student();
                System.out.println("Enter the name :");
                Std[i].name = br.readLine();
                System.out.println("Enter the roll number: ");
                Std[i].roll = s.nextInt();
                System.out.println("Enter the course name");
                Std[i].course = br.readLine();
                System.out.println("Enter the age: ");
                Std[i].age = s.nextInt();
                if (Std[i].age < 15 || Std[i].age > 21) {
                    throw new InvalidAge("invalid age ,age must be between 15 and 21");
                }
            } catch (InvalidAge e) {
                System.out.println("invalid age " + e);
            } catch (Exception em) {
                System.out.println("error:" + em);
            }
        }
        s.close();

    }
}