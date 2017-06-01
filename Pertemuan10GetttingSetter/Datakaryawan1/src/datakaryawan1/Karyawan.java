/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datakaryawan1;
public abstract class Karyawan {
 String tugas, jammasuk,alamat,nama;
            protected String namaperusahaan   = "PT.SEHATSENTOSA";
            protected String alamatperusahaan = " jl.Wastukencana No 122 kota Bandung";
    
            protected String getNamaPT() {
                    return namaperusahaan;
            }
    
             protected String getAlamatPT(){
                    return alamatperusahaan;
            }         
            public abstract void printNamaPT(); // abstract method
            public abstract void printAlamatPT(); //-> abstract method
            
	protected void kry(){
	nama	 = "Annisa Rahayu";
	tugas    = "Pendataan Barang";
	jammasuk = "08.00";
	alamat 	 = "JL. Hegamanah,Bandung";

	System.out.println("Nama Karyawan    = "+nama);
  	System.out.println("Tugas/Bagia      = "+tugas);
  	System.out.println("Alamat           = "+alamat);
  	System.out.println("Jam Oprasional   = "+jammasuk);

  }
  	public void headerkaryawan(){
  		System.out.println("\t\t========================================");
		System.out.println("\t\t            Data Staf Karyawan          ");
		System.out.println("\t\t========================================");
  	}

	public void tampilkan(){
	System.out.println(" Pendataan Staf Karyawan PT.SEHATSENTOSA");
    }

   

}
