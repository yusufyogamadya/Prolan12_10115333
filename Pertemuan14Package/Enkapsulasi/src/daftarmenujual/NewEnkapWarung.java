
package daftarmenujual;


import enkapsulasi.Enkapsulasi;
class NewEnkapWarung extends DataStokBarang{
public static void main(String [] args){
        Enkapsulasi enk = new Enkapsulasi();
        enk.getHgr1();
        enk.getHgr2();
        enk.getHgr3();
        enk.getHgr4();
        
        
        
        ////////////Out Put ///////////////////////
        System.out.println("   Daftar Harga Warung   ");
        System.out.println("-------------------------");
        System.out.println("Minyak = " +enk.getHgr1());
        System.out.println("Tepung = " +enk.getHgr2());
        System.out.println("Gula = " +enk.getHgr3());
        System.out.println("Telur = " +enk.getHgr4());
 
        DataStokBarang dsb = new DataStokBarang ();
        dsb.DataStok();

    }


} 
