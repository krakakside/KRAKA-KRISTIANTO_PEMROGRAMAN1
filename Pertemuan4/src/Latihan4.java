// Nama : Kraka Kristianto
// NIM : 241011401389
// Kelas : 04TPLP005
// dosen meminta untuk improve setelah perkuliahan selesai

//Penilaian
// Bobot kehadiran = kehadiran/realisasi * 10
// Bobot tugas = tugas * 20/100
// Bobot UTS = UTS * 30/100
// Bobot UAS = UAS * 40/100
// Nilai akhir = bobot kehadiran + bobot tugas + bobot UTS + bobot UAS


import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double kehadiran, realisasi, tugas, UTS, UAS;
        double Tkehadiran, TTugas, TUTS, TUAS, nilaiAkhir;
    
        System.out.print("Masukkan kehadiran: ");
        kehadiran = sc.nextDouble();
        System.out.print("Masukkan realisasi: ");
        realisasi = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        tugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        UTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        UAS = sc.nextDouble();

        Tkehadiran = (kehadiran / realisasi) * 10;
        Tugas = tugas * 0.2;
        TUTS = UTS * 0.3;
        TUAS = UAS * 0.4;
        nilaiAkhir = Tkehadiran + Tugas + TUTS + TUAS;
        System.out.println("Nilai akhir " + nilaiAkhir);
        sc.close();
    }
}

