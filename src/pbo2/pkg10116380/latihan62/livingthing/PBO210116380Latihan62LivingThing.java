/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan62.livingthing;

/**
 * @author 
 * Nama : Zain Achmad R
 * Nim : 10116380
 * Kelas : PBO2 
 * Deskripsi Program : Program ini berisi tentang melakukan kegiatan
 */
public class PBO210116380Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Human hm = new Human();
        hm.setNama("Zain Achmad Rizqullah");
        hm.walk(hm.getNama());
        hm.breath(hm.getNama());
        hm.eat(hm.getNama());
       
    }
    
}
