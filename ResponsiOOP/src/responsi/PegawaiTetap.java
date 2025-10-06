/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author HP
 */
public class PegawaiTetap extends Pegawai {
    private long tunjangan;

    public PegawaiTetap(String namaPegawai, long gaji, long tunjangan) {
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tunjangan: " + tunjangan);
    }
}
