import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi bất kỳ: ");
        String s = sc.nextLine();
        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int digitCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println(ch);
            if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            }
        }
        System.out.println("Số ký tự thường: " + lowercaseCount);
        System.out.println("Số ký tự hoa: " + uppercaseCount);
        System.out.println("Số ký tự số: " + digitCount);
        sc.close(); 
    }
}
