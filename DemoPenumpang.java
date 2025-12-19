/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbotugas11;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class DemoPenumpang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Penumpang penumpang;

        System.out.print("Masukkan Nama       : ");
        String nama = input.nextLine();

        System.out.print("Masukkan No Tiket   : ");
        String noTiket = input.nextLine();

        System.out.print("Jenis Penumpang (Reguler/VIP): ");
        String jenis = input.nextLine();

        if (jenis.equalsIgnoreCase("VIP")) {
            penumpang = new PenumpangVIP(nama, noTiket);
        } else {
            penumpang = new PenumpangReguler(nama, noTiket);
        }

        System.out.println("\n=== DATA PENUMPANG ===");
        penumpang.tampilkanData(jenis);
    }
}