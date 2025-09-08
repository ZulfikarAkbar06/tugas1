/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        // Membuat dua object Mobil
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2022, "Hitam");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2023, "Merah");
        
        // Menampilkan informasi mobil
        System.out.println("=== INFORMASI MOBIL 1 ===");
        mobil1.displayInfo();
        
        System.out.println("=== INFORMASI MOBIL 2 ===");
        mobil2.displayInfo();
        
        // Menyalakan mesin mobil
        mobil1.startEngine();
        mobil2.startEngine();
        
        // Demonstrasi perubahan warna
        System.out.println("\n=== SETELAH PERUBAHAN WARNA ===");
        mobil1.setWarna("Biru");
        mobil2.setWarna("Silver");
        
        System.out.println("Informasi setelah perubahan:");
        mobil1.displayInfo();
        mobil2.displayInfo();
    }
}
