/*program inputjavacmd2*/
import java.util.Scanner;
class inputjavacmd2
{

	public static void main (String argv[])
	{
		Scanner input = new Scanner(System.in);
		String nama;
		char jeniskelamin;
		int tinggibadan;
		boolean menikah;
		
		System.out.print("Masukan Nama : ");
			nama = input.nextLine();
		System.out.print("Masukan Jenis Kelamin : ");
			jeniskelamin = input.next().charAt(0);
		System.out.print("Masukan Tinggi Badan : ");
			tinggibadan = input.nextInt();	
		System.out.print("Masukan Status Menikah : ");
			menikah = input.nextBoolean();
		
		
		
	}
}
