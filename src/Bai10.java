import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi không quá 80 ký tự:");
        String s = sc.nextLine();
        if (s.length() > 80) {
            System.out.println("Chuỗi không hợp lệ");
        }
        else{
            System.out.println("Nhập vào một ký tự:");
            char x = sc.next().charAt(0); 
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == x) {
                    count++;
                }
            }
            System.out.println("Ký tự '" + x + "' xuất hiện " + count + " lần trong chuỗi.");
        }
        sc.close();
    }
}
