import java.util.Scanner;
public class calculatorMain {
    
    public static void main(String[] args){
        double operan1, operan2;
        Perhitungan cal = new Perhitungan();
        
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Nilai Pertama :");
            operan1 = input.nextDouble();
        System.out.print("Masukan Nilai Kedua :");
            operan2 = input.nextDouble();
            
        System.out.println("\t\t=========================");
	System.out.println("\t\t        Calculator       ");
	System.out.println("\t\t=========================");
        System.out.println("Hasil pertambahan adalah:" +cal.hasilTambah(operan1,operan1));
        System.out.println("Hasil pengurangan adalah:" +cal.hasilKurang(operan1,operan1));
        System.out.println("Hasil perkalian adalah:" +cal.hasilKali(operan1,operan1));
        System.out.println("Hasil pembagian adalah:" +cal.hasilBagi(operan1,operan1));
        
        System.out.println("Hasil Lebih Besar Dari adalah"+cal.hasilLebihBesarDari(operan1,operan2));
        System.out.println("Hasil Lebih Kecil Dari adalah"+cal.hasilLebihKecilDari(operan1,operan2));
        System.out.println("Hasil Lebih Besar Sama Dengan Dari adalah"+cal.hasilLebihBesarSamaDenganDari(operan1,operan2));
        System.out.println("Hasil Lebih Kecil Sama Dengan Dari adalah"+cal.hasilLebihKecilSamaDenganDari(operan1,operan2));
                 
                 
    }
    
}