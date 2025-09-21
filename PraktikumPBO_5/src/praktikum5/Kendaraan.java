/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author HP
 */
// Level 1: Kelas Induk Kendaraan
class Kendaraan {
    String nama;
    int tahunProduksi;
    
    // Constructor
    public Kendaraan(String nama, int tahunProduksi) {
        this.nama = nama;
        this.tahunProduksi = tahunProduksi;
    }
    
    // Method untuk menampilkan informasi kendaraan
    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }
    
    // Method untuk bergerak
    public void bergerak() {
        System.out.println("Kendaraan sedang bergerak");
    }
}