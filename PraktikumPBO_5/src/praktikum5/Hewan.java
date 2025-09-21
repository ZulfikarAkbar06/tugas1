/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author HP
 */
// Kelas Induk Hewan
class Hewan {
    String nama;
    String jenis;

    // Constructor
    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    // Method untuk menampilkan informasi hewan
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
    }

    // Method untuk suara hewan
    public void bersuara() {
        System.out.println("Hewan mengeluarkan suara");
    }
}
