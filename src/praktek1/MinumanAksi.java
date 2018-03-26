/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek1;

/**
 *
 * @author ASUS X456U
 */
public class MinumanAksi {
    public static void main(String[] args) {
        Minuman CocaCola = new Minuman();
        
        CocaCola.warna="hitam";
        CocaCola.kemasan="botol";
        CocaCola.jumlahisi="160ml";
        CocaCola.warnakemasan="putih";
        CocaCola.harga="Rp.5000";
        CocaCola.SPACI="";
        
        Minuman Sprite = new Minuman();
        
        Sprite.warna="putih";
        Sprite.kemasan="botol";
        Sprite.jumlahisi="160ml";
        Sprite.warnakemasan="hijau";
        Sprite.harga="Rp.5000";
        Sprite.SPACI="";
        
        Minuman Fanta = new Minuman();
        
        Fanta.warna="merah";
        Fanta.kemasan="botol";
        Fanta.jumlahisi="160ml";
        Fanta.warnakemasan="putih";
        Fanta.harga="Rp.5000";
        Fanta.SPACI="";
        
        CocaCola.CaraPengolahan();
        Sprite.CaraPengolahan();
        Fanta.CaraPengolahan();
    }
}
