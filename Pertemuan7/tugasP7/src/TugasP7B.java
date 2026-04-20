// Nama : Kraka Kristianto
// Nim : 241011401389
// tanggal 20 April 2026, Senin. 
// Tugas switch
// menambahkan pilihan menu

// Nama : Kraka Kristianto
// Nim : 241011401389
// Tanggal : 14 April 2026, Pertemuan 7 (offline) minggu non elearning

import java.util.Scanner;
public class TugasP7B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hewan = "";
        System.out.print("Masukkan huruf (a/b): ");
        String huruf = input.nextLine();

        switch (huruf) {
            case "a":
                hewan = "ayam";              
                break;
            case "b":
                hewan = "burung";
                break;
            default:
                hewan = "hewan tidak diketahui";
                break;
        }
        System.out.println("hewan yang dipilih: " + hewan);
        input.close();
    }
    
}
