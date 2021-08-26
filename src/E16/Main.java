// girilen 3 basamakli sayinin tersini yazdiran fonksiyon
package E16;

public class Main {
	public static void tersiniAl(int sayi) {
		int birler=(sayi%10)*100;
		int onlar=((sayi/10)%10)*10;
		int yüzler=(sayi/100)*1;
		int sonuc=birler+onlar+yüzler;
		System.out.println(sonuc);
	}
	public static void main(String[] args) {
		tersiniAl(164);

	}

}
