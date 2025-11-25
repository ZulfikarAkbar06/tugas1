/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author user
 */
import java.util.ArrayList;   

class Pengarang {
    private String nama;

    public Pengarang(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class Buku {
    private String judul;
    private Pengarang pengarang;

    public Buku(String judul) {
        this.judul = judul;
    }

    public void setPengarang(Pengarang p) {
        this.pengarang = p;
    }

    public void infoBuku() {
        System.out.println("Judul: " + judul);
        if (pengarang != null) {
            System.out.println("Pengarang: " + pengarang.getNama());
        }
    }
}

class Perpustakaan {
    private ArrayList<Buku> daftarBuku = new ArrayList<>();

    public Buku tambahBuku(String judul) {
        Buku b = new Buku(judul);
        daftarBuku.add(b);
        return b;
    }

    public void infoPerpustakaan() {
        for (Buku b : daftarBuku) {
            b.infoBuku();
        }
    }
}

public class MainTugas {
    public static void main(String[] args) {

        Pengarang p1 = new Pengarang("Tere Liye");
        Pengarang p2 = new Pengarang("Andrea Hirata");

        Perpustakaan p = new Perpustakaan();

        Buku b1 = p.tambahBuku("Hujan");
        b1.setPengarang(p1);

        Buku b2 = p.tambahBuku("Ayah");
        b2.setPengarang(p2);

        p.infoPerpustakaan();
    }
}
