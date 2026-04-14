// Nama : Kraka Kristianto
// Nim : 241011401389
// Tanggal : 14 April 2026, Pertemuan 7 (offline) minggu non elearning
// pertemuan ini membahas mengenai kondisi if-else, kondisi switch, dan control flow

import java.util.Scanner;

public class Latihan7ifelse {
    public static void main(String[] args) {
        Scanner simpan = new Scanner(System.in);

        int pilihan;
        String rasa, menu;
        System.out.println("Menu 1: Ayam Goreng");
        System.out.println("Menu 2: Segera ada");
        System.out.println("masukkan pilihan menu (angka): ");
        pilihan = simpan.nextInt();
        simpan.nextLine();

        if (pilihan == 1){
            System.out.println("kamu memilih ayam goreng");
            System.out.println("Rasa : ");
            rasa = simpan.nextLine();
            menu = "Ayam Goreng";

            System.out.println("\n\npesanan kamu: " + menu + " rasa " + rasa);
        } else {
            System.out.println("Pilihan belum tersedia");
        }
        simpan.close();
    }
}

