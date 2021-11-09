
package Lelang;

public class Laporan {
    public void laporan(Barang barang){
        int x=barang.getJmlBarang();

        System.out.println();
        System.out.println("Tabel Barang");
        System.out.println();
        System.out.println("Nama Barang \tHarga \tStatus");
        for (int i = 0; i < x; i++) {
            System.out.println(barang.getNamaBarang(i)+"\t"+
            barang.getHarga(i)+"\t"+
            barang.getStatus(i)); 
        }
        System.out.println("");
    }
    public void laporan(Masyarakat masyarakat){
        int x=masyarakat.getJmlMasyarakat();

        System.out.println();
        System.out.println("Tabel Masyarakat");
        System.out.println();
        System.out.println("Nama \tAlamat \tTelepon");
        for (int i = 0; i < x; i++) {
            System.out.println(masyarakat.getNama(i)+"\t"+
            masyarakat.getAlamat(i)+"\t"+masyarakat.getTelepon(i)); 
        }
        System.out.println("");
    }

    public void laporan(Pelelangan pelelangan, Barang barang){
        int x=pelelangan.getJmlPelelangan();

        System.out.println();
        System.out.println("Laporan Pelelangan");
        System.out.println();
        System.out.println("Nama Barang\tQty \tHarga");

        for (int i = 0; i < x; i++) {
            System.out.println(barang.getNamaBarang(pelelangan.getIdBarang(i))+"\t"+
                    pelelangan.getBanyaknya(i)+"\t"+barang.getHarga(pelelangan.getIdBarang(i))); 
        }
        System.out.println("");
    }
}