package BaitapJava_Buoi3;

import java.util.Scanner;

public class HinhTron {
    private float r;
    private final float pi = 3.14f;

    public HinhTron(float r){
        this.r = r;
    }
    public void setHT(float r){
        this.r = r;
    }

    public float getHT(){
        return r;
    }
    public float chuVi(){
        return (2*pi*r);
    }

    public float dienTich(){
        return (pi*r*r);
    }

    public static void main(String[] args) {
        float r;
        Scanner nhapDl = new Scanner(System.in);
        System.out.println("Nhap ban kinh duong tron: ");
        r = nhapDl.nextFloat();
        HinhTron x = new HinhTron(r);
        System.out.println("Chu vi duong tron: " + x.chuVi());
        System.out.println("Dien tich duong tron: " + x.dienTich());
    }
}
