import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong so nguyen n: ");
        int n = sc.nextInt();
        double tong = 0;
        System.out.println("Nhap vao " + n + " so nguyen:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so thu " + (i+1) + ": ");
            int x = sc.nextInt();
            tong += x;
        }
        double trungBinhCong = tong / n;
        System.out.println("Gia tri trung binh cong cua " + n + " so nguyen la: " + trungBinhCong);

        sc.close(); 
    }
}
