//girilen bir sayinin rakamlari toplamini veren fonksiyon
package E47;

public class Main {

	public static void rakamTopla(int sayi) {
		int toplam=0;
		while(sayi>0) {
			int i=sayi%10;
			toplam+=i;
			sayi=sayi/10;
		}System.out.println("sayinin rakamlari toplami: "+toplam);
	}
	
	public static void main(String[] args) {
		rakamTopla(1000000001);

	}

}
