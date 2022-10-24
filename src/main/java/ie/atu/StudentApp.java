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



        System.out.println("Please Enter Second Student Name");
        String studentName2 = input.nextLine();
        Student infoStudent2 = new Student(studentName2);
        //infoStudent2.setStudName(studentName2);

        System.out.println("Please Enter Second Student Email");
        String studentEmail2 = input.nextLine();
        infoStudent2.setStudEmail(studentEmail2);

        System.out.println("Please Enter Second Student Course");
        String studentCourse2 = input.nextLine();
        infoStudent2.setStudCourse(studentCourse2);


        System.out.println("Please Enter Third Student Name");
        String studentName3 = input.nextLine();
        System.out.println("Please Enter Third Student Email");
        String studentEmail3 = input.nextLine();
        System.out.println("Please Enter Third Student Course");
        String studentCourse3 = input.nextLine();
        Student infoStudent3 = new Student(studentName3, studentEmail3, studentCourse3);


        System.out.println("First Student Name - " + infoStudent.getStudName());
        System.out.println("First Student Email - " + infoStudent.getStudEmail());
        System.out.println("First Student Course - " + infoStudent.getStudCourse());

        System.out.println("Second Student Name - " + infoStudent2.getStudName());
        System.out.println("Second Student Email - " + infoStudent2.getStudEmail());
        System.out.println("Second Student Course - " + infoStudent2.getStudCourse());

        System.out.println("Third Student Name - " + infoStudent3.getStudName());
        System.out.println("Third Student Email - " + infoStudent3.getStudEmail());
        System.out.println("Third Student Course - " + infoStudent3.getStudCourse());



    }
}
