
package daftarmenujual;
import enkapsulasi.IsiStok;
public class DataStokBarang {
    IsiStok isi = new IsiStok();
        isi.getStok1();
        isi.getStok2();
        isi.getStok3();
        isi.getStok4();
    //////////////// out put//////////////////
    public void DataStok() {
     System.out.println("---------------Daftar Stok Barang----------------");
     System.out.println("Minyak  ="+isi.getStok1());
     System.out.println("Tepung  ="+isi.getStok2());
     System.out.println("Gula    ="+isi.getStok3());
     System.out.println("Telur   ="+isi.getStok4());        
    }
}
