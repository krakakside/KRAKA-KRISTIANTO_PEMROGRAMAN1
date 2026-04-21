// Nama : Kraka Kristianto
// Nim : 241011401389
// Tanggal : 21 April 2026, Pertemuan 8 (offline) minggu elearning
// materi minggu ini membahas perulangan
// for, while, do-while.
// 1. struktur for
// for (inisiasi; kondisi; incirement) {
//     statement for
// }
// 2. struktur while
// while (kondisi) {
//   statement while 
// }
// 3. Struktur do-while
// do {
//    statement
// } while (kondisi)
//
// for (a=1;a<=b;a++) {
//  System.out.println("nilai: " +a);
//  }
//  






public class Latihan8 {
    public static void main(String[] args) throws Exception {
        for (int a=1; a<=5; a++){
            System.out.println("nilai for: " +a);
        }
        System.out.println("\n");

        int b=1;
        while (b<=5){
            System.out.println("nilai while: " +b); b++;
        }
        System.out.println("\n");

        int c=1;
        do {
            System.out.println("nilai do-while: " +c); c++;
        } while (c<=5);
    }
}

