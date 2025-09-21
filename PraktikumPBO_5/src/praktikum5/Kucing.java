/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author HP
 */
class Kucing extends Hewan {
    String warnaBulu;
    
    public Kucing(String nama, String warnaBulu) {
        super(nama, "Kucing");
        this.warnaBulu = warnaBulu;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Warna Bulu: " + warnaBulu);
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Meong! Meong!");
    }
}