/*program inputjava*/
import java.util.Scanner;
class inputjavacmd
{
	public static void main(String argv[]){
		Scanner namaVariabel = new Scanner(System.in);
		String nama;
		System.out.print("nama : ");
		nama = namaVariabel.nextLine();
		String alamat;
		System.out.print("alamat : ");
		alamat = namaVariabel.nextLine();
	}
}