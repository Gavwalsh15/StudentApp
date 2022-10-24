package ie.atu;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        System.out.println("Please Enter A Student Name");
        Scanner input = new Scanner(System.in);
        String studentName = input.nextLine();
        Student infoStudent = new Student();
        infoStudent.setStudName(studentName);

        System.out.println("Please Enter A Student Email");
        String studentEmail = input.nextLine();
        infoStudent.setStudEmail(studentEmail);

        System.out.println("Please Enter A Student Course");
        String studentCourse = input.nextLine();
        infoStudent.setStudCourse(studentCourse);

    }
}
