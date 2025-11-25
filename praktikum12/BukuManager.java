/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12;

/**
 *
 * @author user
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BukuManager {
    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.ser";
    private List<Buku> bukuList;

    public BukuManager() {
        this.bukuList = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        bukuList.add(buku);
        System.out.println("\n[SUKSES] Buku berhasil ditambahkan ke dalam memori!");
    }

    public void simpanKeFileTeks() {
        if (bukuList.isEmpty()) {
            System.out.println("\n[PERINGATAN] Tidak ada buku dalam memori untuk disimpan!");
            return;
        }
        
        try (FileWriter writer = new FileWriter(TEXT_FILE)) {
            for (Buku buku : bukuList) {
                writer.write(buku.toString() + "\n");
            }
            System.out.println("\n[SUKSES] Data buku berhasil disimpan ke file: " + TEXT_FILE);
        } catch (IOException e) {
            System.out.println("\n[ERROR] Terjadi kesalahan saat menyimpan ke file teks.");
        }
    }

    public void simpanKeFileSerial() {
        if (bukuList.isEmpty()) {
            System.out.println("\n[PERINGATAN] Tidak ada buku dalam memori untuk disimpan!");
            return;
        }
        
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(bukuList);
            System.out.println("\n[SUKSES] Objek buku berhasil disimpan ke file: " + SERIAL_FILE);
        } catch (IOException e) {
            System.out.println("\n[ERROR] Terjadi kesalahan saat menyimpan ke file serial.");
            e.printStackTrace();
        }
    }

    public void bacaDariFileTeks() {
        System.out.println("\n--- DAFTAR BUKU DARI FILE TEKS ---");
        
        File file = new File(TEXT_FILE);
        if (!file.exists()) {
            System.out.println("[INFO] File " + TEXT_FILE + " belum ada. Silakan simpan data terlebih dahulu.");
            return;
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(TEXT_FILE))) {
            String line;
            int count = 1;
            boolean adaData = false;
            
            while ((line = reader.readLine()) != null) {
                System.out.println(count + ". " + line);
                count++;
                adaData = true;
            }
            
            if (!adaData) {
                System.out.println("[INFO] File kosong.");
            }
        } catch (IOException e) {
            System.out.println("\n[ERROR] Terjadi kesalahan saat membaca file teks.");
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public void bacaDariFileSerial() {
        System.out.println("\n--- DAFTAR BUKU DARI FILE SERIAL ---");
        
        File file = new File(SERIAL_FILE);
        if (!file.exists()) {
            System.out.println("[INFO] File " + SERIAL_FILE + " belum ada. Silakan simpan data terlebih dahulu.");
            return;
        }
        
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(SERIAL_FILE))) {
            List<Buku> deserializedList = (List<Buku>) ois.readObject();
            
            if (deserializedList.isEmpty()) {
                System.out.println("[INFO] Tidak ada data buku dalam file serial.");
            } else {
                int count = 1;
                for (Buku buku : deserializedList) {
                    System.out.print(count + ". ");
                    buku.tampilkanInfo();
                    count++;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("\n[ERROR] Terjadi kesalahan saat membaca file serial.");
            e.printStackTrace();
        }
    }

    public void tampilkanBukuMemori() {
        System.out.println("\n--- DAFTAR BUKU DI MEMORI ---");
        
        if (bukuList.isEmpty()) {
            System.out.println("[INFO] Belum ada buku yang ditambahkan ke dalam memori.");
        } else {
            int count = 1;
            for (Buku buku : bukuList) {
                System.out.print(count + ". ");
                buku.tampilkanInfo();
                count++;
            }
        }
    }

    public int getJumlahBuku() {
        return bukuList.size();
    }
}