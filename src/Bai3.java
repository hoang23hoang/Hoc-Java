import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String name = sc.nextLine();  
        System.out.print("Nhập năm sinh của bạn: ");
        int year = sc.nextInt();  
        int old = 2024 - year; 
        if (old < 16) {
            System.out.println("Bạn " + name + " đang ở độ tuổi vị thành niên.");
        } else if (old >= 16 && old < 18) {
            System.out.println("Bạn " + name + " đang ở độ tuổi trưởng thành.");
        } else {
            System.out.println("Bạn " + name + " đã già.");
        }
        sc.close(); 
    }
}
