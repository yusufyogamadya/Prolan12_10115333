public class OperatorAritmatika{
	public static void main(String[]args){
		byte x = 5;
		byte y = 4;
		System.out.println("Hasil Penambahan x dan y adalah " + (x+y));
		System.out.println("Hasil Pengurangan x dan y adalah " + (x-y));
		System.out.println("Hasil Perkalian x dan y adalah " + (x*y));
		System.out.println("Hasil div x dan y adalh"+(x/y));
		System.out.println("Hasil mod x dan y adalh"+(x%y));
		
		x++;
		y++;
		System.out.println("Hasil increment x adalah "+ x);
		System.out.println("Hasil decrement y adalah "+ y);
	}
} 