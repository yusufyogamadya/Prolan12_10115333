class Datakaryawan extends gajimanajer{ //si anak

    public static void main(String[] args) {
	   Datakaryawan method = new Datakaryawan();
	    method.data("\t\tPERUSAHAAN");
		method.data("\t\tahli","jujur");
		method.tampilkanManager();//
		method.alamat();
	 
	  alamat tempat = new alamat();
	  tempat.alamat1();//alamat perusahaan
	  System.out.println("Alamat Perusahaan ");

      HRD hrd1 = new HRD(); 
      hrd1.sts1();//header HRD
      hrd1.isiData ("Said","102897362829","Jln Setiabudi","HRD karyawan"); //isinya (HARUS SESUAI DENGAN PERATURAN KAKER)
      System.out.println( "Id              = "+hrd1.id); 
      System.out.println( "Nama            = "+hrd1.nama);  
      System.out.println( "Bagian Dalam HRD = "+hrd1.jabatan); 


      Karyawan bawahan  =  new Karyawan();
      bawahan.karyawan1();//header Karyawan
      bawahan.karyawan();//isi data karyawan
 
	 
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
		  
	  
	public void gajimanajer(){ //panggil gaji manajer
		  int a = 15000000;
		  Datakaryawan call = new Datakaryawan();
		  call.gajimanajer();//gaji manajer
		  call.alamat();//alamat di gajimanajer
	  }
		  
	  
	  
	 
}