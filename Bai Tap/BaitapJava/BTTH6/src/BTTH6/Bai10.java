package BTTH6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap xau: ");
        String xau = nhap.nextLine();
        String[] st = xau.split(" ");

        Collections.reverse(Arrays.asList(st));
        System.out.println("Chuoi doi xung: " + String.join(" ", st));
    }
}
