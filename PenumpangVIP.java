/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbotugas11;

/**
 *
 * @author Lenovo
 */
class PenumpangVIP extends Penumpang {
    public PenumpangVIP(String nama, String noTiket) {
        super(nama, noTiket);
    }

    @Override
    public double hitungHargaTiket() {
        return 100000;
    }
}