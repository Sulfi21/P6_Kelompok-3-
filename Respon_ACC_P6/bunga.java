/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tumbuhann;

/**
 *
 * @author Sulfi Wahyudi R
 */
class bunga extends Tumbuhann{
    String warna = " Merah";
    String Tumbuh = " Mawar";
    void hasilbunga(){
        System.out.println("Tumbuhan Bunga " + Tumbuh + " berwarna" + warna);
    }
    @Override
    void fotosintesis(){
        System.out.println("Proses Fototsintesis pada" + Tumbuh + " yaitu sangat istimewa");
    }
    
}
 