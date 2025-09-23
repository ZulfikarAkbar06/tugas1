/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author acer
 */
// KeranjangBelanja.java
import java.util.ArrayList;

class KeranjangBelanja {
    private ArrayList<Produk> daftarProduk = new ArrayList<>();

    public void tambahProduk(Produk p) {
        daftarProduk.add(p);
    }

    public double hitungTotal() {
        double total = 0;
        for (Produk p : daftarProduk) {
            total += p.getHargaSetelahDiskon();
        }
        return total;
    }

    public void tampilkanBelanja() {
        for (Produk p : daftarProduk) {
            System.out.println(p.getNama() + 
                               " | Harga: Rp" + p.getHarga() + 
                               " | Setelah Diskon: Rp" + p.getHargaSetelahDiskon());
        }
        System.out.println("Total Bayar: Rp" + hitungTotal());
    }
}
