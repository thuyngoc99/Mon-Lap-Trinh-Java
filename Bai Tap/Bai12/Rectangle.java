package Bai12;

import java.util.Scanner;

public class Rectangle extends Shape {
    public int chieudai;
    public int chieurong;

    public Rectangle() {
    }

    public Rectangle(int chieudai, int chieurong) {
        if(chieudai < 1 || chieudai > 15){
            System.out.println("Khong hop le");
            return;
        }
        if(chieurong < 1 || chieurong > 15){
            System.out.println("Khong hop le");
            return;
        }
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public int getChieudai() {
        return chieudai;
    }

    public void setChieudau(int chieudai) {
        this.chieudai = chieudai;
    }

    public int getChieurong() {
        return chieurong;
    }

    public void setChieurong(int chieurong) {
        this.chieurong = chieurong;
    }

    @Override
    public void draw() {
        super.draw();
        for(int i = 0; i < chieurong; i++){
            for(int j = 0; j < chieudai; j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }


}
