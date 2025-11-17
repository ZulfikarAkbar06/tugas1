/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author user
 */
public class MainPembayaran {
    public static void main(String[] args) {
        Pembayaran elektronik = new Elektronik();
        Pembayaran makanan = new Makanan();

        double hargaElektronik = 2000000; 
        double hargaMakanan = 50000; 

        System.out.println("SISTEM PEMBAYARAN TOKO");
        System.out.printf("Harga Elektronik: Rp%.2f%n", hargaElektronik);
        System.out.printf("Pajak Elektronik (10%%): Rp%.2f%n", elektronik.hitungPajak(hargaElektronik));
        System.out.printf("Total Elektronik: Rp%.2f%n%n", hargaElektronik + elektronik.hitungPajak(hargaElektronik));

        System.out.printf("Harga Makanan: Rp%.2f%n", hargaMakanan);
        System.out.printf("Pajak Makanan (5%%): Rp%.2f%n", makanan.hitungPajak(hargaMakanan));
        System.out.printf("Total Makanan: Rp%.2f%n", hargaMakanan + makanan.hitungPajak(hargaMakanan));
    }
}
