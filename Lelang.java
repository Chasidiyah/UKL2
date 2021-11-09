
package Lelang;

public class Lelang {

    public static void main(String[] args) {
        Masyarakat masyarakat = new Masyarakat();
        Petugas petugas = new Petugas();
        Barang barang = new Barang();
        Pelelangan pelelangan = new Pelelangan();
        pelelangan.prosesPelelangan(masyarakat, pelelangan, barang);
    }
    
}