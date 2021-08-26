//dizideki elemanlarin ortalamasini bulan fonskiyon
package E55;

public class Main {
	public static void diziOrtalamasi(int [] array) {
		float toplam=0;
		for(int i=0;i<array.length;i++) {
			toplam+=array[i];
		}
		float ort=(toplam/array.length);
		System.out.println("Dizinin ortalamasi: "+ort);
		}

	public static void main(String[] args) {
		 int[] dizi= {1,2,3,4,5,1};
		 diziOrtalamasi(dizi);

	}

}
