/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbotugas11;

/**
 *
 * @author Lenovo
 */
abstract class Penumpang {
    protected String nama;
    protected String noTiket;

    public Penumpang(String nama, String noTiket) {
        this.nama = nama;
        this.noTiket = noTiket;
    }

    public abstract double hitungHargaTiket();

    public void tampilkanData() {
        System.out.println("Nama      : " + nama);
        System.out.println("No Tiket  : " + noTiket);
        System.out.println("Harga     : " + hitungHargaTiket());
    }

    public void tampilkanData(String ket) {
        tampilkanData();
        System.out.println("Ket       : " + ket);
    }
}