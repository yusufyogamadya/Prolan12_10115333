import java.util.Scanner ;
public class SoalLab{
    Scanner input = new Scanner(System.in) ;
      int N, max, min, jumlah ;
      char pilih ;
    
      int[] array = new int[100] ; 
    
    public static void main(String args[])
    {
        
        SoalLab tampilkan = new SoalLab() ;
        tampilkan.isidata() ;      
    }        
    
    public void isidata()
    {
      System.out.println("			Latihan Lab 7");
      System.out.println("1.Untuk Nilai Maksimum             ");
      System.out.println("2.Untuk Nilai Minimum             ");      
      System.out.print("Banyak Nilai yang Diperoses       = ") ;   
              N = input.nextInt() ; 
      System.out.print("Pilih [1/2] = ") ; 
            pilih = input.next().charAt(0) ;
      
      masukandata() ;      
      if (pilih == '1'){
        pilihanA() ;
        System.out.println("Nilai Minimum   = "+min);
      } else if (pilih == '2') {
        pilihanB() ; 
        System.out.println("Nilai Maksimum  = "+max) ;
      }else if ((pilih != '2') || (pilih != '1')){
           System.out.println("Data Masukan False");
      } 
      
      System.out.println("Hasil= "+jumlah);
     }
    
    void masukandata()
    {
      int i ;
        for (i=0;i<N;i++) 
        { 
          System.out.printf("Isi data = ") ;    
            array[i] = input.nextInt() ;
        }   
    }      

    void pilihanA()
    {
      int i ;  
      min = array[0]; 
      //Nilai Minimum
      for (i=0;i<N;i++) 
        {  
           if (min > array[i])
             min = array[i] ;
        }
      //jumlah nilai keluar
       for (i=0;i<N;i++) 
        {  
           if (min == array[i] )
             jumlah++ ;
        }    
    }     
    
    void pilihanB()
    {
      int i ;  
      max = array[0];
      //Nilai Maximum
      for (i=0;i<N;i++) 
        {  
           if (max < array[i])
               max = array[i] ;
        }
     
       for (i=0;i<N;i++) 
        {  
           if (max == array[i] )
               jumlah++ ;
        }
    }

}