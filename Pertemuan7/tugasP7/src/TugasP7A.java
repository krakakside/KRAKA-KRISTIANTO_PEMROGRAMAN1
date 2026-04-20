// Nama : Kraka Kristianto
// Nim : 241011401389
// 20 April 2026
// tugas if else
// menambahkan pilihan menu lain


import java.util.Scanner;

public class TugasP7A {
    public static void main(String[] args) {
        Scanner simpan = new Scanner(System.in);

        int pilihan;
        String rasa = "", menu = "";

        System.out.println("  o  o  o  o  Daftar Menu Resto Aduhai  o  o  o  o  ");
        System.out.println("Menu 1: Ayam Goreng");
        System.out.println("Menu 2: Nasi Goreng");
        System.out.println("Menu 3: Mie Ayam");
        System.out.println("Menu 4: Bakso");
        System.out.println("menu 5: sate ayam");
        System.out.println("Menu 6: sate Kambing");
        System.out.println("menu 7: sate sapi");
        System.out.println("menu 8: ayam bakar");
        System.out.println("menu 9: ayam geprek");
        System.out.println("menu 10: ayam rica rica");
        System.out.println("menu 11: ayam kremes");
        System.out.println("o o o o oo o o o o oo o o o o");
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


