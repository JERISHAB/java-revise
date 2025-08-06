package demo;
import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        // String name = "Jerishab";
        // int age = 25;
        // char initial = 'M';
        // float height = 1.46f;
        // boolean isStudent = true;

        // System.out.println("Name: " + name);
        // System.out.println("age: " + age);
        // System.out.println("initial: " + initial);
        // System.out.println("height: " + height);
        // System.out.println("Student: " + isStudent);

        // for (int i = 10; i > 0; i--) {
        // System.out.println("The number is: " + i);
        // }

        // FUNCTIONS AKA METHODS IN JAVA

        PrintName p = new PrintName();

        p.sayHello();

        // System.out.println("hello");
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number");
        // int age = sc.nextInt();
        // System.out.println(age);
        // sc.close();

    }

    void sayHello() {
        System.out.println("hello");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int age = sc.nextInt();
        System.out.println(age);
        sc.close();
    }
}
