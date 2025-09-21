/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author HP
 */
public class MainTugas {
    public static void main(String[] args) {
        System.out.println("=== DEMO INHERITANCE HEWAN ===");
        
        // Membuat objek Kucing
        Kucing kucing = new Kucing("Kitty", "Putih");
        kucing.tampilkanInfo();
        kucing.bersuara();
        System.out.println();
        
        // Membuat objek Anjing
        Anjing anjing = new Anjing("Buddy", "Golden Retriever");
        anjing.tampilkanInfo();
        anjing.bersuara();
        System.out.println();
        
        System.out.println("=== DEMO HIERARKI KENDARAAN 3 LEVEL ===");
        
        // Membuat objek Mobil
        Mobil mobil = new Mobil("Toyota Avanza", 2022, 4, "Bensin", 5, "Automatic");
        mobil.tampilkanInfo();
        mobil.bergerak();
        mobil.klakson();
        System.out.println();
        
        // Membuat objek SepedaMotor
        SepedaMotor motor = new SepedaMotor("Honda Beat", 2023, 2, "Bensin", 
                                           "4-tak", true);
        motor.tampilkanInfo();
        motor.bergerak();
        motor.standarTengah();
    }
}