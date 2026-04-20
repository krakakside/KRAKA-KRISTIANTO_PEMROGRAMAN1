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
        String note = "", menu = "";
        boolean valid = true;

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
        System.out.println("o   o   o  o oo T.T oo  o  o  o  o\n\n");
        System.out.println("masukkan pilihan menu (angka): ");
        pilihan = simpan.nextInt();
        simpan.nextLine();

        if (pilihan == 1){
            menu = "Ayam Goreng";
        } else if (pilihan == 2){
            menu = "Nasi Goreng";
        } else if (pilihan == 3){
            menu = "Mie Ayam";
        } else if (pilihan == 4){
            menu = "Bakso";
        } else if (pilihan == 5){
            menu = "sate ayam";
        } else if (pilihan == 6){
            menu = "sate kambing";
        } else if (pilihan == 7){
            menu = "sate sapi";
        } else if (pilihan == 8){
            menu = "ayam bakar";
        } else if (pilihan == 9){
            menu = "ayam geprek";
        } else if (pilihan == 10){
            menu = "ayam rica rica";
        } else if (pilihan == 11){
            menu = "ayam kremes";
        } else {
            valid = false;
            System.out.println("Pilihan menu tidak valid");
        }
        if (valid) {
            System.out.println("kamu memilih > " + menu);
            System.out.print("catatan (cth: pedas/tidak pakai sayur): ");
            note = simpan.nextLine();
            System.out.println("\n\n   ~    ~    ~    ~   \n\n\n");
            System.out.println("pesanan disimpan");
            System.out.println("pesanan kamu: " + menu);
            System.out.println("dengan catatan: " + note ) ;
            System.out.println("\n\n\n");
        }   else{
            System.out.println("\n\n pilihan menu angka >> " + pilihan + " << invalid atau belum tersedia saat ini \n\n\n\n\n\n");
        simpan.close();
    }
}
}


