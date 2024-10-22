import java.util.Scanner;
public class Tugas2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlPendaftar, cabor;
        String namaPoltek, namaCabor, namaAtlet;

        System.out.print("Masukkan jumlah poltek yang mendaftar : ");
        jmlPendaftar = sc.nextInt();
        sc.nextLine();

        for (int a = 1; a <= jmlPendaftar; a++) {
            System.out.print("Masukkan nama poltek ke-" +a + " : ");
            namaPoltek = sc.nextLine();
            System.out.print("Masukkan jumlah cabor : ");
            cabor = sc.nextInt();
            sc.nextLine();
            System.out.println();

            System.out.println("Nama Poltek : " + namaPoltek);

            for (int b = 1; b <= cabor; b++) {
                System.out.print("Masukkan nama cabor ke-" +b + " : ");
                namaCabor = sc.nextLine();
                System.out.println("Cabor : " + namaCabor);
                String kumpulanAtlet = "";

                for (int c = 1; c <= 5; c++) {
                    System.out.print("Nama atlet ke-" +c + " : ");
                    namaAtlet = sc.nextLine();
                    kumpulanAtlet += namaAtlet + ",";
                }
                System.out.println("Atlet " +namaCabor + " : " + kumpulanAtlet);
                System.out.println();
            }
        }
    }
}
