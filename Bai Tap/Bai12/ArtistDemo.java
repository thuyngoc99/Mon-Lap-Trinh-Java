package Bai12;

import java.util.Scanner;

public class ArtistDemo {
    public static void main(String[] args) {
        int chieudai;
        int chieurong;
        int canhvuong;

        Scanner nhapDl = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        chieudai = nhapDl.nextInt();
        System.out.println("Nhap chieu rong: ");

        chieurong = nhapDl.nextInt();
        Rectangle Shape = new Rectangle(chieudai,chieurong);
        Artist artist = new Artist();
        artist.drawShape(Shape);


        System.out.println("Nhap canh vuong: ");
        canhvuong = nhapDl.nextInt();

        RightTriangle shape = new RightTriangle(canhvuong);
        artist.drawShape(shape);

    }
}
