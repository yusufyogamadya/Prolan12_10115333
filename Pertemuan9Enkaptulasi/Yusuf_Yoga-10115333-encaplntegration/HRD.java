class HRD extends Karyawan{  //kakek
String nama; 
String id;
String alamat;
String jabatan; 

void isiData ( String nama,String id, String alamat, String jabatan) { //thisnya harus di kirim ke Datakaryawan.java niiih (PERATURAN)
this.nama=nama; 
this.id=id;
this.jabatan=jabatan;
this.alamat=alamat;   
}
	public void sts1(){
		System.out.println("\t\t================================");
		System.out.println("\t\t        Data Ketugasan HRD      ");
		System.out.println("\t\t================================");
	}
	//////////////////////////////////////////////////////////////////
	public void alamat(){
		System.out.println("Jln.Hergamanah 152,Kota Bandung");
	}
//////////////////////////////////////////////////////////////////////////
	} 
