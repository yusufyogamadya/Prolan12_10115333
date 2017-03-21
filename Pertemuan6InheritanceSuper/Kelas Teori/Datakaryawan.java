class Datakaryawan extends Manager{ //si anak

    public static void main(String[] args) {
	   Datakaryawan method = new Datakaryawan();
	    method.data("\t\tPERUSAHAAN");
		method.data("\t\tahli","jujur");
      
      Datakaryawan methoddkt = new Datakaryawan();
	  methoddkt.tampilkanManager();
       

      HRD2 hrd1 = new HRD2 ( ); 
      hrd1.sts1();
      hrd1.isiData ("102929288383","Bambang","jl. soekarno hatta","anggrek"); 
      System.out.println( "Id              = "+ hrd1.id); 
      System.out.println( "Nama            = "+ hrd1.nama);  
      System.out.println( "Bagian Dalam HRD = "+ hrd1.jabatan); 


      Karyawan bawahan  =  new Karyawan();
      bawahan.karyawan1();
      bawahan.karyawan();
 
		
}

     private void data(String nama){

      System.out.println(nama);
     }
  
     private void data(String nama1, String nama2){
    System.out.println(nama1+nama2);
     }

      public void tampilkanManager(){
      Manager atasan = new Manager();
		 

	 	atasan.nama = "Yusuf Yoga Madya";
  		atasan.jabatan = "Manager Bidang Agensi";
  		atasan.tugas="Agensi Kepegawaian";


  		atasan.Manager1();
  		System.out.println("Nama		= "+atasan.nama);
		System.out.println("Jabatan		= "+atasan.jabatan);
		System.out.println("Tugas		= "+atasan.tugas);
      } 	
	  
	  public static void main (String args[]){ //panggil gaji manajer
		  int a = 15000000;
		  Datakaryawan call = new Datakaryawan();
		  call.gajikaryawan(a);
	  }
}