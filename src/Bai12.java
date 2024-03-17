import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số dòng của ma trận: ");
        int n = sc.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        System.out.println("Nhập giá trị cho các phần tử của ma trận:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
        int max = a[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        System.out.println("Phần tử có giá trị lớn nhất trong ma trận là: " + max);
        sc.close();
    }
}
