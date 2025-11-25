/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12;

/**
 *
 * @author user
 */
import java.io.Serializable;

public class Buku implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    
    /**
     * Constructor untuk membuat objek Buku
     * @param judul Judul buku
     * @param pengarang Nama pengarang buku
     * @param tahunTerbit Tahun terbit buku
     */
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }
    
    // Getter methods
    public String getJudul() {
        return judul;
    }
    
    public String getPengarang() {
        return pengarang;
    }
    
    public int getTahunTerbit() {
        return tahunTerbit;
    }
    
    // Setter methods
    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    
    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    
    /**
     * Method untuk menampilkan informasi buku
     */
    public void tampilkanInfo() {
        System.out.println("Judul: " + judul + 
                         ", Pengarang: " + pengarang + 
                         ", Tahun Terbit: " + tahunTerbit);
    }
    
    /**
     * Override toString untuk representasi string dari objek Buku
     */
    @Override
    public String toString() {
        return "Judul: " + judul + 
               ", Pengarang: " + pengarang + 
               ", Tahun Terbit: " + tahunTerbit;
    }
}
    

