// Nama : Kraka Kristianto
// Nim : 241011401389
// tanggal 20 April 2026, Senin. 
// Tugas switch
// menambahkan pilihan menu

import java.util.Scanner;
public class TugasP7B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hewan = "";
        System.out.println("index hewan (free version)");
        System.out.print("Masukkan huruf (a sampai h): ");
        String huruf = input.nextLine();

        switch (huruf) {
            case "a":
                hewan = "ayam, anjing, angsa";              
                break;
            case "b":
                hewan = "burung, bebek, badak";
                break;
            case "c":
                hewan = "cicak, capung, cacing";
                break;
            case "d":
                hewan = "domba, dinosaurus";
                break;
            case "e":
                hewan = "elang, entok, emu";
                break;
            case "f":
                hewan = "flamingo, ferret, falcon";
                break;
            case "g":
                hewan = "gajah, gorila, gagak";
                break;
            case "h":
                hewan = "Harimau, hiu, hamster";
                break;
            default:
                hewan = "hewan belum diketahui ";
                break;
        }
        System.out.println("hewan yang dipilih: " + hewan);
        input.close();
    }
    
}
