/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author acer
 */
// Main.java
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        Produk buku = new Buku("Pemrograman Java", 100000);
        Produk hp = new Elektronik("Smartphone", 3000000);
        Produk baju = new Pakaian("Kemeja", 200000);

        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(hp);
        keranjang.tambahProduk(baju);

        keranjang.tampilkanBelanja();
    }
}
                                                                                                                                                                                                                                    