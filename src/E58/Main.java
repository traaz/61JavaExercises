//mutlak deger hesaplayan fonksiyon
package E58;

public class Main {

	public static void mutlak(int sayi) {
		if(sayi<0) {
			int sonuc =sayi=sayi*-1;
			System.out.println("Mutlak degeri: "+sonuc);
			}
		else if(sayi>=0) {
			System.out.println("Mutlak degeri: "+sayi);
		}
	}
	public static void main(String[] args) {
		mutlak(5);
		mutlak(-2);
		mutlak(0);

	}

}
