package BTTH6;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        String[] nguyenAm = {"a", "e", "i", "u", "o", "y"};
        System.out.println("Nhap xau: ");
        String xau = nhap.nextLine();
        for (String str : nguyenAm){
            if (xau.contains(str)){
                xau = xau.replaceAll(str,"");
            }
        }
        System.out.println(xau);
    }
}
