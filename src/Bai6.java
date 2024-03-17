import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 so: "); 
        int x = sc.nextInt();
        int X = x;
        int giaiThua = 1;
        do {
            giaiThua *= x;
            x -= 1;
        } while (x > 0);
        
        System.out.println("Giai thua cua " + X + " la: " + giaiThua);
        sc.close(); 
    }
}
