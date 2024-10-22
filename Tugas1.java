import java.util.Scanner;
public class Tugas1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        for(int iOuter=1; iOuter<=n; iOuter++){
            for (int i = 1; i <= n; i++) { 
                if (iOuter == 1 || iOuter == n || i == 1 || i == n) {
                    System.out.print(n + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
