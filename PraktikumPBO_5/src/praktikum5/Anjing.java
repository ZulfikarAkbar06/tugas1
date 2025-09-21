/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author HP
 */
// Kelas Turunan Anjing
class Anjing extends Hewan {
    String ras;

    // Constructor
    public Anjing(String nama, String ras) {
        super(nama, "Anjing"); // Memanggil constructor parent class
        this.ras = ras;
    }

    // Overriding method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil method dari parent class
        System.out.println("Ras: " + ras);
    }

    // Overriding method bersuara
    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Guk! Guk!"); // Perbaiki: namea → nama
    }
}