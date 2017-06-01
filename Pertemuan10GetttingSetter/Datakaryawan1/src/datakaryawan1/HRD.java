/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datakaryawan1;
public class HRD extends Karyawan{
void isiData ( String nama, String alamat,String tugas) { 
		this.nama=nama; 
		this.alamat=alamat;
		this.tugas=tugas;    
}

//override class dokter
	public void bos1(){
		System.out.println("\t\t=========================");
		System.out.println("\t\t        Data HRD         ");
		System.out.println("\t\t=========================");
	}	
	
//Abstrak override
@Override
    protected String getNamaPT() {
        return super.getNamaPT();
    }
@Override
    public void printNamaPT() {
        System.out.print(getNamaPT());
    } 
    
@Override
    protected String getAlamatPT() {
        return super.getAlamatPT();
    }
@Override
    public void printAlamatPT() {
        System.out.println(getAlamatPT());
    }

    String getTugasPT() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

} 

