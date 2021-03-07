package BTTH6;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap xau: ");
        String xau = nhap.nextLine();
        int count1 = 0, count2 = 0, count3 = 0;
        for (int i = 0; i < xau.length(); i++) {
            if (Character.isDigit(xau.charAt(i))) {
                count1++;
            }
            if (Character.isLetter(xau.charAt(i))) {
                count2++;
            }
        }
            String[] st = xau.split(" ",0);
            for (String str : st){
                if (!str.isEmpty()){
                    count3++;
                }
            }

        System.out.println("So ky tu chu so : " + count1 );
        System.out.println("So ky tu chu cai : " + count2 );
        System.out.println("So tu : " + count3 );
    }
}
