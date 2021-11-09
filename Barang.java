
package Lelang;

import java.util.ArrayList;

public class Barang {
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();

    public Barang() {
        this.namaBarang.add("Cokelat enak");
        this.status.add(true);
        this.harga.add(10000);
        this.idMasyarakat.add(0);
        this.namaBarang.add("Sabun Beri");
        this.status.add(false);
        this.harga.add(5000);
        this.idMasyarakat.add(1);
        this.namaBarang.add("Odol SIWAK");
        this.status.add(true);
        this.harga.add(15000);
        this.idMasyarakat.add(2);
    }
    public int getJmlBarang(){
        return this.namaBarang.size();
    }
    public void setNamaBarang(String namaBarang ){
        this.namaBarang.add(namaBarang);
    }
    public String getNamaBarang(int idBarang){
        return this.namaBarang.get(idBarang);
    }
    
    public void setIdMasyarakat(int idMasyarakat ){
        this.idMasyarakat.add(idMasyarakat);
    }
    public int getIdMasyarakat(int idBarang){
        return this.idMasyarakat.get(idBarang);
    }

    public void setStatus(Boolean status ){
        this.status.add(status);
    }
    public Boolean getStatus(int idBarang){
        return this.status.get(idBarang);
    } 
    public void editStatus(int idBarang, Boolean status){
        this.status.set(idBarang, status);
    } 
    public void setHarga(int harga ){
        this.harga.add(harga);
    }
    public int getHarga(int idBarang){
        return this.harga.get(idBarang);
    }
}


