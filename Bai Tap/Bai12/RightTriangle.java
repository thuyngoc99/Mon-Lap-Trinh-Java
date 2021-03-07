package Bai12;

public class RightTriangle extends Shape{
    public int canhvuong;

    public RightTriangle() {
    }

    public RightTriangle(int canhvuong) {
        if(canhvuong < 1 || canhvuong > 20) {
            System.out.println("Khong hop le.");
        }
        else {
            this.canhvuong = canhvuong;
        }
    }

    public int getCanhvuong() {
        return canhvuong;
    }

    public void setCanhvuong(int canhvuong) {
        this.canhvuong = canhvuong;
    }

    @Override
    public void draw() {
        super.draw();
        for(int i = 1; i < canhvuong; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
