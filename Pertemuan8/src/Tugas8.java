//// Nama : Kraka Kristianto
// Nim : 241011401389
// Tanggal : 21 April 2026, Pertemuan 8 (offline) minggu elearning
// : :  :   tugas   :  : :
// dosen menugaskan untuk membuat kodingan lalu membuat flowchart dari kodingan tersebut
// tapi dengan ketentuan ga melenceng dari flowchart tugas yang digambar di papan tulis? 
// materi pengulangan (for, while, do-while)
// 
// dah lah pake subjek kopi ae
// 

import java.util.Scanner;
public class Tugas8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Rekap nitip kopi");
        System.err.println("ketik 1 untuk mulai catatan pesanan");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("sebanyak apa kopi yang dipesan? ");
            int jumlahPesanan = input.nextInt();
            input.nextLine();

            String[] daftarPesanan = new String[jumlahPesanan];
            for (int i=0; i<jumlahPesanan; i++) {
                System.out.print("input pesenan kopi ke-" +(i+1)+": ");
                daftarPesanan[i] = input.nextLine();
            }
            System.out.println("\n   /    /   rekap pesanan   /   /");

            System.out.println("daftar pesanan yang harus dibeli : ");
            for (int i=0; i<jumlahPesanan; i++){
                System.out.println((i+1)+ ". " +daftarPesanan[i]);
            }
            System.out.println("\n -  -  - jangan lupa dibeli -   -   -\n\n ");
        } else {
            System.out.println("pilihan tidak ada");
        }
        input.close();
    }
}








 
