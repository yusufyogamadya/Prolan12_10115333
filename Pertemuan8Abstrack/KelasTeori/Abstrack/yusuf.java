public class yusuf extends Mahasiswa {

  
    @Override
    public void printKuliah() {
        System.out.println("printKuliah :Kuliah tidak,D.O Tak mau");
    }
    
    @Override
    public void printLulus() {
        System.out.println("printLulus :Cari yang terpenting ilmunya tahun itu hitungan");
    }
    
    @Override
    public void printTidakLulus() {
        System.out.println("printTidakLulus :Oh No");
    }

    public static void main(String[] args) {
        yusuf yoga= new yusuf();
        yoga.printKuliah();
        yoga.printLulus();
        yoga.printTidakLulus();
        
    }

}