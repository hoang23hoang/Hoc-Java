import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot so x: ");
        int x = sc.nextInt();
        if (x % 2 == 0)
            System.out.println(+x + " la so chan !");
        else
            System.out.println(+x + " la so le !");
        sc.close(); 
    }
}
