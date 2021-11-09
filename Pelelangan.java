
package Lelang;

import java.util.ArrayList;
import java.util.Scanner;

public class Pelelangan {
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>(); 

    public Pelelangan() {
        this.idMasyarakat.add(0);
        this.idBarang.add(0);
        this.harga.add(2);
        this.idMasyarakat.add(0);
        this.idBarang.add(1);
        this.harga.add(3);
        this.idMasyarakat.add(1);
        this.idBarang.add(0);
        this.harga.add(1);
        this.idMasyarakat.add(1);
        this.idBarang.add(2);
        this.harga.add(2);
    }
    public void prosesPelelangan(Masyarakat masyarakat, Pelelangan pelelangan, Barang barang){
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Mulai pelelangan");
        System.out.println("Masukkan ID Masyarakat");
        int idMasyarakat = myObj.nextInt(); 
        System.out.println("Selamat datang "+masyarakat.getNama(idMasyarakat));
        System.out.println("Masukkan Nama Barang: ");
        String namaBarang = myObj.next();
        barang.setIdMasyarakat(idMasyarakat);
        barang.setNamaBarang(namaBarang);
        System.out.print(namaBarang+ " harga awalnya: ");
        barang.setHarga(myObj.nextInt());
        barang.setStatus(Boolean.TRUE);

        System.out.println("List barang sebagai berikut");
        System.out.println("Nama \tHarga \tStatus");

        int x = barang.getJmlBarang();
        for (int j = 0; j < x; j++){
            System.out.println(barang.getNamaBarang(j)+"\t"+
                barang.getHarga(j)+"\t"+
                barang.getStatus(j));
        }
        
        System.out.println("Masukkan ID Barang yang akan dilelang");
        int idBarang = myObj.nextInt(); 
        System.out.println("Barang yang akan dilelang "+barang.getNamaBarang(idBarang));
        if(barang.getStatus(idBarang) == false){
            System.out.println("Barang tidak bisa dilelang");
        }else{
            ArrayList<Integer> idPenawar = new ArrayList<Integer>();
            ArrayList<Integer> harga = new ArrayList<Integer>();
            int i=0;
            int temp=0;
            do{
                System.out.println("Masukkan ID Masyarakat:");
                temp=myObj.nextInt();
                if (temp!=99){
                    idPenawar.add(temp);
                    System.out.print(masyarakat.getNama(idPenawar.get(i))+ " menawar : ");
                    harga.add(myObj.nextInt());
                    i++;
                }
            }while (temp!=99); 

            System.out.println("Pelelangan barang "+barang.getNamaBarang(idBarang)+" sebagai berikut");
            System.out.println("Nama \tHarga \t");

            int total=0;
            int y = idPenawar.size();
            int menang = 0;
            int idMenang = 0;
            for (int j = 0; j < y; j++){
                System.out.println(masyarakat.getNama(idPenawar.get(j))+"\t"+
                harga.get(j));
                if(harga.get(j) > menang){
                    menang = harga.get(j);
                    idMenang = j;
                }
            }
            
            System.out.println("Pemenang lelang yaitu "+masyarakat.getNama(idMenang)+" dengan harga penawaran "+harga.get(idMenang));
        }
    }
    
    public int getIdBarang(int id){
        return this.idBarang.get(id);
    } 
    public int getBanyaknya(int id){
        return this.harga.get(id);
    } 
    public int getIdMasyarakat(int id){
        return this.idMasyarakat.get(id);
    } 
    public int getJmlPelelangan(){
        return this.idMasyarakat.size();
    }
}