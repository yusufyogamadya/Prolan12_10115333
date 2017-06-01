/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datakaryawan1;

public class Manajer extends HRD {
void isiData ( String nama, String alamat,String tugas) { 
		this.nama=nama; 
		this.alamat=alamat;
		this.tugas=tugas;   
}

	String spec;
	public void manajer1(){
		System.out.println("\t\t=========================");
		System.out.println("\t\t        Data Manajer     ");
		System.out.println("\t\t=========================");
                
	}

    //keyword super
    @Override
     	public void bos1(){
     		super.bos1();
        }
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
    protected String getTugasPT() {
        return super.getTugasPT();
    }
    public void printTugasPT() {
        System.out.println(getTugasPT());
    }
}
