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


        Student infoStudent2 = new Student();
        System.out.println("Please Enter Second Student Name");
        String studentName2 = input.nextLine();
        infoStudent.setStudName(studentName2);

        System.out.println("Please Enter Second Student Email");
        String studentEmail2 = input.nextLine();
        infoStudent.setStudEmail(studentEmail2);

        System.out.println("Please Enter Second Student Course");
        String studentCourse2 = input.nextLine();
        infoStudent.setStudCourse(studentCourse2);

        System.out.println(studentName);
        System.out.println(studentEmail);
        System.out.println(studentCourse);
        System.out.println(studentName2);
        System.out.println(studentEmail2);
        System.out.println(studentCourse2);

    }
}
