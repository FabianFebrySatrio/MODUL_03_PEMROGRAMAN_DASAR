/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mod_3a;

import java.util.Scanner;

public class MOD_3TUGAS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah;

        System.out.print("Jumlah Karyawan: ");
        jumlah = input.nextInt();
        input.nextLine();

        String karyawan[][] = new String[jumlah][4];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Karyawan ke-" + (i + 1));

            System.out.print("Nama: ");
            karyawan[i][0] = input.nextLine();

            System.out.print("Jabatan: ");
            karyawan[i][1] = input.nextLine();

            System.out.print("Gaji Pokok: ");
            karyawan[i][2] = input.nextLine();

            System.out.print("Tunjangan: ");
            karyawan[i][3] = input.nextLine();
        }

        System.out.println("\n========== DATA GAJI KARYAWAN ==========");
        System.out.printf("%-5s %-15s %-15s %-15s %-15s%n",
                "NO", "NAMA", "JABATAN", "GAPOK", "TUNJANGAN");

        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-5d %-15s %-15s %-15s %-15s%n",
                    (i + 1),
                    karyawan[i][0],
                    karyawan[i][1],
                    karyawan[i][2],
                    karyawan[i][3]);
        }

        input.close();
    }
}
