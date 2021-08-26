//dizide elemanlarin kendi indeksiyle carpilip,toplamini donduren fonksiyon
package E18;

public class Main {
	public static void indexCarpici(int[] array) {
		int toplam=0;
		for(int i=0;i<=array.length-1;i++) {
			toplam=toplam+(i*array[i]);
		}
		System.out.println(toplam);
	}

	public static void main(String[] args) {
		int[] dizi= {1,2,3,4,5};
		indexCarpici(dizi);
	}
}
