package BaitapJava_Buoi3;

import java.util.Scanner;

public class HinhTamGiac {
    private int ma, mb, mc;
    public HinhTamGiac(){

    }

    public HinhTamGiac(int a, int b, int c) {
        if (a < 0) {
            System.out.println("Canh a khong hop le.");
            a = 0;
            return;
        }
        if (b < 0) {
            System.out.println("Canh b khong hop le.");
            b = 0;
            return;
        }
        if (c < 0) {
            System.out.println("Canh c khong hop le.");
            a = 0;
            return;
        }
        if ((a + b <= c) || (b + c <= a) || (c + a <= b)) {
            System.out.println("Khong phai hinh tam giac");
            a = b = c = 0;
            return;
        }
            ma = a;
            mb = b;
            mc = c;

    }

    public int getCanhA(){
        return ma;
    }

    public void setCanhA(int v) {
        if ((v < 0) && ((v + mb <= mc) || (mb + mc <= v) || (mc + v <= mb))) {
            System.out.println("Cac canh cua tam giac khong hop le");
        }
        else {
            ma = v;
        }
    }

    public int getCanhB(){
        return mb;
    }

    public void setCanhB(int v){
        if ((v < 0) && ((ma + v <= mc) || (v + mc <= ma) || (mc + ma <= v))) {
            System.out.println("Cac canh cua tam giac khong hop le");
        }
        else {
            mb = v;
        }
    }

    public int getCanhC(){
        return mc;
    }

    public void setCanhC(int v){
        if ((v < 0) && ((ma + mb <= v) || (mb + v <= ma) || (v + ma <= mb))) {
            System.out.println("Cac canh cua tam giac khong hop le");
        }
        else {
            mc = v;
        }
    }

    public boolean laTamGiac(){
        if((ma + mb > mc) && (mb + mc > ma) && (mc + ma > mb) && ma > 0 && mb > 0 && mc > 0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean laTamGiac(int a, int b, int c){
        if((a + b > c) && (b + c > a) && (c + a > b) && ma > 0 && mb > 0 && mc > 0){
            return true;
        }
        else{
            return false;
        }
    }
    public int getChuVi(){
        return (ma + mb + mc);
    }
    public double getDienTich(){
        double p = (double) (ma + mb + mc)/2;
        return (double) Math.sqrt(p*(p-ma)*(p-mb)*(p-mc));
    }

    public static void main(String[] args) {
        int a, b, c;
        Scanner nhapDuLieu = new Scanner(System.in);
        System.out.println("Nhap canh a: ");
        a = nhapDuLieu.nextInt();
        System.out.println("Nhap canh b: ");
        b = nhapDuLieu.nextInt();
        System.out.println("Nhap canh c: ");
        c = nhapDuLieu.nextInt();
        HinhTamGiac tamGiac = new HinhTamGiac(a,b,c);
        if(tamGiac.laTamGiac()){
        System.out.println("Chu vi hinh tam giac: " + tamGiac.getChuVi());
        System.out.println("Dien tich hinh tam giac: " + (double)tamGiac.getDienTich());
        }

    }
}
