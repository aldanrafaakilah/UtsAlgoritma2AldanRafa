
package utsno3aldanrafaakilah;
import java.util.Scanner;
public class UTSNo3AldanRafaAkilah {
    
   public static void main(String[] args) {
        System.out.println("## COLDPLAY MUSIC of SPHERES ##");
        System.out.println("========== WORLD TOUR ==========");
        System.out.println("GELORA BUNG KARNO STADIUM JAKARTA");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kategori tiket yang tersedia:");
        System.out.println("1. Category 1 (Rp5.000.000)");
        System.out.println("2. Category 2 (Rp4.000.000)");
        System.out.println("3. Category 3 (Rp3.250.000)");
        System.out.println("4. Category 4 (Rp2.500.000)");

        System.out.print("Pilih kategori tiket (1-4): ");
        int category = scanner.nextInt();

        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        int jumlahtiket = scanner.nextInt();

        int price = 0;
        switch (category) {
            case 1:
                price = 5000000 * jumlahtiket;
                break;
            case 2:
                price = 4000000 * jumlahtiket;
                break;
            case 3:
                price = 3250000 * jumlahtiket;
                break;
            case 4:
                price = 2500000 * jumlahtiket;
                break;
            default:
                price = 0;
                break;
        }

        System.out.println("=============================================");
        System.out.println("             INVOICE PEMBELIAN               ");
        System.out.println("=============================================");
        System.out.println("Kategori Tiket: Category " + category);
        System.out.println("Jumlah Tiket  : " + jumlahtiket);
        System.out.println("Harga Tiket   : Rp" + price);
        System.out.println("=============================================");

        System.out.print("Masukkan jumlah uang yang akan dibayarkan: ");
        int payment = scanner.nextInt();

        int change = payment - price;

        System.out.println("Kembalian: Rp" + change);
        System.out.println("=============================================");
    }
    
}
