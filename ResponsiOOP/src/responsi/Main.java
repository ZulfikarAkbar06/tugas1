/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author HP
 */
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Elektronik laptop = new Elektronik("Laptop", 15000000, 2);
        laptop.tampilkanInfo();
        System.out.println();

        PegawaiTetap budi = new PegawaiTetap("Budi", 5000000, 1000000);
        budi.tampilkanInfo();
        System.out.println();

        Produk snack = new Makanan("Snack", 15000, LocalDate.parse("2023-12-30"));
        snack.tampilkanInfo();
        System.out.println();

        Pegawai andi = new PegawaiKontrak("Andi", 3000000, 12);
        andi.tampilkanInfo();
    }
}
