/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum4;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
        // Buat objek dari kelas Pekerja
        Pekerja pekerja1 = new Pekerja("Budi", 25, "Software Developer", 7500000);
        
        // Tampilkan informasi pekerja dengan menggunakan metode toString()
        System.out.println("Informasi Awal:");
        System.out.println(pekerja1.toString());
        
        // Ubah nama pekerja menggunakan metode setter
        pekerja1.setNama("Budi Santoso");
        
        // Tampilkan ulang informasi pekerja
        System.out.println("\nInformasi Setelah Perubahan Nama:");
        System.out.println(pekerja1.toString());
        
        // Coba akses langsung atribut
        System.out.println("\nCoba Akses Langsung:");
        
        // Akses atribut public (pekerjaan) - BISA
        System.out.println("Pekerjaan: " + pekerja1.pekerjaan);
        
        // Akses atribut protected (usia) - BISA karena dalam package yang sama
        System.out.println("Usia: " + pekerja1.usia);
        
        // Akses atribut private (nama) - TIDAK BISA, akan menyebabkan error kompilasi
        // System.out.println("Nama: " + pekerja1.nama); // Error: nama has private access
        
        // Akses atribut private (gaji) - TIDAK BISA, akan menyebabkan error kompilasi
        // System.out.println("Gaji: " + pekerja1.gaji); // Error: gaji has private access
        
        System.out.println("\nAkses melalui Getter:");
        System.out.println("Nama: " + pekerja1.getNama()); // BISA melalui getter
        System.out.println("Gaji: " + pekerja1.getGaji()); // BISA melalui getter
    }
}