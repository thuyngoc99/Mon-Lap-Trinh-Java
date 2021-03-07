package Bai1;

public class Student {
    private long ID;
    private String name;
    private int score;

    public Student(long ID, String name, int score) {
        this.ID = ID;
        this.name = name;
        this.score = score;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "[" + ID + "_" + name + "_" + score + "]";
    }
}
