class hasil {
    
    public static void main (String[] args){
        hewan pelihara = new hewan();
        Pegawai perawat = new Pegawai();
        Panganhewan stok = new Panganhewan();
        
        //data pegawai
        perawat.nama = "Yusuf Yoga Madya Sambodo";
        perawat.bagian = "Pawang Singa";
        
        //data hewan
        perawat.pegawai1();
        System.out.println("Nama Hewan = "+pelihara.namahewan);
        System.out.println("Jenis Hewan = "+pelihara.jenishewan);
        System.out.println("Makanan Hewan = "+pelihara.makananhewan);
        
        //data pangan
        perawat.pegawai2();
        System.out.println(" Stok Makan Gudang ="+stok.stoktersediaan);
        System.out.println(" Kandungan Gizi ="+stok.kandungangizi);
        
        
    }
    
}