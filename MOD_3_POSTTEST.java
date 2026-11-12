/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mod_3a;

import java.util.Scanner;

public class MOD_3_POSTTEST {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah;
        double total = 0;

        System.out.print("Jumlah Mahasiswa: ");
        jumlah = input.nextInt();

        String mahasiswa[][] = new String[jumlah][2];
        double nilaiAkhir[] = new double[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("NIM: ");
            mahasiswa[i][0] = input.next();

            System.out.print("Nama: ");
            mahasiswa[i][1] = input.next();

            System.out.print("Nilai Tugas: ");
            double tugas = input.nextDouble();

            System.out.print("Nilai UTS: ");
            double uts = input.nextDouble();

            System.out.print("Nilai UAS: ");
            double uas = input.nextDouble();

            nilaiAkhir[i] =
                (6 * tugas + 2 * uts + 2 * uas) / 10;

            total += nilaiAkhir[i];
        }

        System.out.println("\n===== HASIL NILAI MAHASISWA =====");
        System.out.println("NIM\tNama\tNilai Akhir");

        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%s\t%s\t%.2f%n",
                mahasiswa[i][0],
                mahasiswa[i][1],
                nilaiAkhir[i]);
        }

        double rataRata = total / jumlah;

        System.out.printf("\nNilai Rata-rata: %.2f%n", rataRata);

        input.close();
    }
}
