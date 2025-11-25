/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class MenuPerpustakaan {
    private BukuManager bukuManager;
    private Scanner scanner;

    public MenuPerpustakaan() {
        this.bukuManager = new BukuManager();
        this.scanner = new Scanner(System.in);
    }

    private void tampilkanHeader() {
        System.out.println("SISTEM MANAJEMEN BUKU PERPUSTAKAAN");
    }
    
    private void tampilkanMenu() {
        System.out.println("\nMENU UTAMA");
        System.out.println("1. Tambah Buku Baru");
        System.out.println("2. Simpan ke File Teks (buku.txt)");
        System.out.println("3. Simpan Objek ke File Serial (buku.ser)");
        System.out.println("4. Tampilkan Buku dari File Teks");
        System.out.println("5. Tampilkan Buku dari File Serial");
        System.out.println("6. Tampilkan Semua Buku di Memori");
        System.out.println("7. Keluar");
        System.out.print("Pilihan Anda: ");
    }
    
    private void tambahBuku() {
        System.out.println("\n--- TAMBAH BUKU BARU ---");
        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        
        System.out.print("Masukkan nama pengarang: ");
        String pengarang = scanner.nextLine();
        
        System.out.print("Masukkan tahun terbit: ");
        int tahunTerbit = scanner.nextInt();
        scanner.nextLine();
        
        Buku bukuBaru = new Buku(judul, pengarang, tahunTerbit);
        bukuManager.tambahBuku(bukuBaru);
    }
    
    private void tampilkanFooter() {
        System.out.println("Terima kasih telah menggunakan sistem!");
        System.out.println("Program selesai.");
    }
    
    public void jalankan() {
        tampilkanHeader();
        
        while (true) {
            tampilkanMenu();
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (pilihan) {
                case 1 -> tambahBuku();
                case 2 -> bukuManager.simpanKeFileTeks();
                case 3 -> bukuManager.simpanKeFileSerial();
                case 4 -> bukuManager.bacaDariFileTeks();
                case 5 -> bukuManager.bacaDariFileSerial();
                case 6 -> bukuManager.tampilkanBukuMemori();
                case 7 -> {
                    tampilkanFooter();
                    scanner.close();
                    return;
                }
                default -> System.out.println("\n[ERROR] Pilihan tidak valid! Silakan coba lagi.");
            }
        }
    }
}
