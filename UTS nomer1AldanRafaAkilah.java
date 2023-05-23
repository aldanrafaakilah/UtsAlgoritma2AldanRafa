package tester; 
import java.util.Scanner; 
public class Tester {

    // Mendefinisikan method utama (main) yang akan dieksekusi saat program dijalankan.
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna.
        Scanner input = new Scanner(System.in);
        // Mendeklarasikan variabel "nilai" dengan tipe data int.
        int nilai;
        // Mendeklarasikan variabel "ulang" dengan tipe data String.
        String ulang;
        
        // Memulai perulangan do-while
        do {
            // Menampilkan pesan ke layar meminta pengguna untuk memasukkan nilai.
            System.out.print("Masukkan Nilai: "); 
            // Membaca nilai yang dimasukkan oleh pengguna dan menyimpannya dalam variabel "nilai".
            nilai = input.nextInt(); 
            // Memeriksa apakah nilai yang di input Lebih besar atau sama dengan 90.
            if (nilai >= 90) {
                 // Menampilkan "A" ke layar jika kondisi benar.
                System.out.println("A");
            // Memeriksa apakah nilai yang di input lebih besar atau sama dengan 80.
            } else if (nilai >= 80) {
                // Menampilkan "B" ke layar jika kondisi benar.
                System.out.println("B"); 
            // Memeriksa apakah nilai yang di input lebih besar atau sama dengan 65.
            } else if (nilai >= 65) {
                // Menampilkan "C" ke layar jika kondisi benar.
                System.out.println("C"); 
             // Memeriksa apakah nilai yang di input lebih besar atau sama dengan 50.
            } else if (nilai >= 50) {
                // Menampilkan "D" ke layar jika kondisi benar.
                System.out.println("D"); 
            }

            // Menampilkan pesan ke layar meminta pengguna untuk mengulang atau tidak.
            System.out.print("Apakah Anda ingin mengulang? (ya/tidak): "); 
            // Membaca input dari pengguna (ya/tidak) dan menyimpannya dalam variabel "ulang".
            ulang = input.next(); 

         // Melanjutkan perulangan jika input pengguna adalah "ya".
        } while (ulang.equalsIgnoreCase("ya"));
    }
}
