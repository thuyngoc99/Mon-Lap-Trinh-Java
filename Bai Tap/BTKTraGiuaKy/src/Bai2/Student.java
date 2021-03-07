package Bai2;

import java.util.Scanner;

public class Student extends Person {
    private String studentId;
    private String lecId;
    private String topicTitle; //ten chu de
    private float grade;

    public Student() {
    }

    public Student(String name, String address, String studentId, String lecId, String topicTitle, float grade) {
        super(name, address);
        this.studentId = studentId;
        this.lecId = lecId;
        this.topicTitle = topicTitle;
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getLecId() {
        return lecId;
    }

    public void setLecId(String lecId) {
        this.lecId = lecId;
    }

    public String getTopicTitle() {
        return topicTitle;
    }

    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public void inputData() {
        super.inputData();
        Scanner nhapDL = new Scanner(System.in);
        System.out.println("Nhap studentId: ");
        studentId = nhapDL.nextLine();
        System.out.println("Nhap lecId: ");
        lecId = nhapDL.nextLine();
        System.out.println("Nhap topicTitle: ");
        topicTitle = nhapDL.nextLine();
        System.out.println("Nhap grade : ");
        grade  = nhapDL.nextFloat();
    }

    @Override
    public void display() {
        super.display();
        System.out.print("\t" + studentId + "\t" + lecId + "\t" + topicTitle + "\t" + grade);
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + studentId + "\t" + lecId + "\t" + topicTitle + "\t" + grade + "\n";
    }
}
