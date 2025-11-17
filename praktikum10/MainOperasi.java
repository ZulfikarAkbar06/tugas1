/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author user
 */
public class MainOperasi {
    public static void main(String[] args) {
        OperasiHitung tambah = new Penjumlahan();
        OperasiHitung kurang = new Pengurangan();
        
        int a = 10, b = 5;
        System.out.println("Penjumlahan: " + tambah.hitung(a, b));
        System.out.println("Pengurangan:" + kurang.hitung(a, b));
    }
}
