
package datakaryawan1;

public class Datakaryawan extends Jasa {
     
public static void main (String[] args){	    
//////////// Enkaptulasi  Gaji Karyawan/////////////////
            Datakaryawan kry = new Datakaryawan();
            kry.pertama();
}
    
public void pertama(){
            Gaji enk = new Gaji();
            enk.getGaji1();
            enk.getGaji2();
            enk.getGaji3();

                ////////////Out Put ///////////////////////
                System.out.println("------------------------------");
                System.out.println("     Daftar Gaji Karyawan     ");
                System.out.println("------------------------------");
                System.out.println("Manajer = " +enk.getGaji1());
                System.out.println("HRD = " +enk.getGaji2());
                System.out.println("Karyawan = " +enk.getGaji3());


                   
                    
        }
}