package ie.atu;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        System.out.println("Please Enter A Student Name");
        Scanner input = new Scanner(System.in);
        String studentName = input.next();

        System.out.println("Please Enter A Student Email");
        String studentEmail = input.next();
        System.out.println(studentEmail);

        System.out.println("Please Enter A Student Course");
        String studentCourse = input.next();
        System.out.println(studentCourse);

    }
}
