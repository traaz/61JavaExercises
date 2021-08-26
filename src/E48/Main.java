//Mukemmel sayi mi deðil mi bulan fonskyion
//Kendisi haric butun pozitif tamsayi carpanlari toplami, kendisine esit olan sayiya denir.
package E48;

public class Main {

	public static void isCheck(int sayi) {
		int toplam=0;
		for(int i=1;i<sayi;i++) {
			if(sayi%i==0) {
				toplam+=i;
				}
		}
		if(toplam==sayi) {
			System.out.println("Sayi mukemmel sayi");
		}else {
			System.out.println("Sayi mukemmel sayi degil");
		}
	}
	public static void main(String[] args) {
		isCheck(6);
		isCheck(8);

	}

}
