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
            case "i":
                hewan = "ikan, itik, iguana";
                break;
            case "j":
                hewan = "jerapah, jangkrik, jaguar";
                break;
            case "k":
                hewan = "kucing, kuda, kambing";
                break;
            case "l":
                hewan = "lebah, landak, laler";
                break;
            case "m":
                hewan = "monyet, macan, musang";
                breka;
            case "n":
                hewan = "nyamuk, nila"
                break;
            case "o":
                hewan = "orca, orangutan"
                break;
            case "p":
                hewan = "panda, paus, penyu";
                break;
            case "q":
                hewan = "indeks huruf ini tidak diketahui"
                break;
            case "r":
                hewan = "rakun, rusa, rubah";
                break;
            case "s":
                hewan = "sapi, semut, singa";
                break;
            case "t":
                hewan = "tapir, tikus, tupai";
                break;
            case "u":
                hewan = "ular, unta, udang";
                break;
            case "v":
                hewan = "indeks huruf ini tidak dikteahui";
                break;
            case "w":
                hewan = "walang sangit, wombat";
                break;
            case "x":
                hewan = "indeks dihuruf ini tidak diketahui";
                break;
            case "y":
                hewan = "yak";
                break;
            case "z":
                hewan = "zebra";
                break;
            default:
                hewan = "hewan belum diketahui ";
                break;
        }
        System.out.println("hewan yang dipilih: " + hewan);
        input.close();
    }
    
}
