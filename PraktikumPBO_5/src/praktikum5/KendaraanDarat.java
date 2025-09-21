/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author HP
 */
// Level 2: Kelas Menengah KendaraanDarat
class KendaraanDarat extends Kendaraan {
    int jumlahRoda;
    String bahanBakar;

    // Constructor
    public KendaraanDarat(String nama, int tahunProduksi, int jumlahRoda, String bahanBakar) {
        super(nama, tahunProduksi); // Memanggil constructor parent class
        this.jumlahRoda = jumlahRoda;
        this.bahanBakar = bahanBakar;
    }

    // Overriding method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil method dari parent class
        System.out.println("Jumlah Roda: " + jumlahRoda);
        System.out.println("Bahan Bakar: " + bahanBakar);
    }

    // Overriding method bergerak
    @Override
    public void bergerak() {
        System.out.println("Kendaraan darat sedang berjalan di jalan raya");
    }
}