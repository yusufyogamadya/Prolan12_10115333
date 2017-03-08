class Datakaryawan {

    public static void main(String[] args) {
       Manager  atasan = new Manager();
       Karyawan bawahan = new Karyawan();
       
       //data manager
       atasan.nama = "Yusuf Yoga Madya Sambodo";
       atasan.jabatan = "Manager";
       atasan.tugas   = "Meeting";
        
       //data karyawam
       atasan.Manager1();
       System.out.println("nama          ="+atasan.nama);
       System.out.println("jabatan       ="+atasan.jabatan);
       System.out.println("tugas         ="+atasan.tugas);
       
       //data output
       bawahan.karyawan();
       bawahan.karyawan1();
    }
}