import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap so b: ");
        int b = sc.nextInt();
        System.out.println("Tong cua a va b la: " + (a + b));
        System.out.println("Hieu cua a va b la: " + (a - b));
        System.out.println("Tich cua a va b la: " + (a * b));
        System.out.println("Thuong cua a va b la: " + (a / b));
        System.out.println("Phan du cua a va b la: " + (a % b));
        if (a > b) {
            System.out.println("So lon la : " + a);
            System.out.println("So be la: " + b);
        } else {
            System.out.println("So lon la: " + b);
            System.out.println("So be la: " + a);
        }

        sc.close();
    }
}
