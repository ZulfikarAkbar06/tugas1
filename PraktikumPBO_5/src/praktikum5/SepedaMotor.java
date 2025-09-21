/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author HP
 */
// Level 3: Kelas Turunan SepedaMotor
class SepedaMotor extends KendaraanDarat {
    String jenisMesin;
    boolean memilikiBoks;
    
    // Constructor
    public SepedaMotor(String nama, int tahunProduksi, int jumlahRoda, String bahanBakar, 
                       String jenisMesin, boolean memilikiBoks) {
        super(nama, tahunProduksi, jumlahRoda, bahanBakar);
        this.jenisMesin = jenisMesin;
        this.memilikiBoks = memilikiBoks;
    }
    
    // Overriding method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
        System.out.println("Memiliki Boks: " + (memilikiBoks ? "Ya" : "Tidak"));
    }
    
    // Method khusus sepeda motor
    public void standarTengah() {
        System.out.println(nama + " menggunakan standar tengah");
    }
}