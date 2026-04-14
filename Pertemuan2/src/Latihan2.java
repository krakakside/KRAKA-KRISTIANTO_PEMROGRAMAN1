import java.util.Scanner;
public class Latihan2 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama; int usia; String alamat; String nim;
        System.out.print("input Nama: ");
        nama = input.nextLine();
        System.out.print("input Nim: ");
        nim = input.nextLine();
        System.out.print("input Usia: ");
        usia = input.nextInt();
        input.nextLine();
        System.out.print("Alamat: ");
        alamat = input.nextLine();
        System.out.println("\n\n================================");
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("Usia: " + usia);
        System.out.println("Alamat: " + alamat);
        System.out.println("================================\n\n");
    }
}

 
