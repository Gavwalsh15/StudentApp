package ie.atu;

public class Student {
    private String studName;
    private String studEmail;
    private String studCourse;

    public String getStudName() {
        return this.studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getStudEmail() {
        return this.studEmail;
    }

    public void setStudEmail(String studEmail) {
        this.studEmail = studEmail;
    }

    public String getStudCourse() {
        return this.studCourse;
    }

    public void setStudCourse(String studCourse) {
        this.studCourse = studCourse;
    }

    public Student(String studName) {
        this.studName = studName;
    }

    public Student() {
        this.studName = "";
        this.studEmail= "";
        this.studCourse= "";
    }

    public Student(String studName, String studEmail, String studCourse) {
        this.studName = studName;
        this.studEmail = studEmail;
        this.studCourse = studCourse;
    }
}
