import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        int a[] = {7,0,3,9};
		for(int i = 0; i < a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
		Arrays.sort(a);
		System.out.println("mang sau khi sap xep la: ");
		 for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i]);
	            if (i < a.length - 1) {
	                System.out.print(", ");
	            }
	        }
		System.out.println("\nCác số nguyên tố trong mảng trên là : ");
		int count = 0;
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 1; j <= a[i]; j++)
			{
				if(a[i] % j == 0)
					count++;
			}
			if (count == 2) {
			    System.out.println("\nSố nguyên tố trong mảng là: " + a[i]);
			}
		}
    }
}
