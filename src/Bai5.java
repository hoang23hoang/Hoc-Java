import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 1 so: ");
        int sum = 0;
        while (sum < 100) {
            int x = sc.nextInt();
            sum += x;
        }
        System.out.println("tong cac so da nhap la: " + sum);
        sc.close(); 
    }
}
