/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author HP
 */
// Level 3: Kelas Turunan Mobil
class Mobil extends KendaraanDarat {
    int jumlahPintu;
    String transmisi;

    // Constructor
    public Mobil(String nama, int tahunProduksi, int jumlahRoda, String bahanBakar,
                 int jumlahPintu, String transmisi) {
        super(nama, tahunProduksi, jumlahRoda, bahanBakar); // Memanggil constructor parent class
        this.jumlahPintu = jumlahPintu;
        this.transmisi = transmisi;
    }

    // Overriding method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil method dari parent class
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Transmisi: " + transmisi);
    }
    
    // Method khusus mobil
    public void klakson() {
        System.out.println(nama + " membunyikan klakson: Tin! Tin!");
    }
}