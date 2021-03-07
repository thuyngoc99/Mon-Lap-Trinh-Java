package Bai1;

import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private float score;

    public Student() {
    }

    public Student(String id, String name, float score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public void nhap(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap id: ");
        id = nhap.nextLine();
        System.out.println("Nhap name: ");
        name = nhap.nextLine();
        System.out.println("Nhap score: ");
        score = nhap.nextFloat();
    }

    @Override
    public String toString() {
        return "Student{ " + "id: " + id + ", name: " + name + ", score: " + score + '}';
    }

    public void hien(){
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
        System.out.print("\n");
    }
}
