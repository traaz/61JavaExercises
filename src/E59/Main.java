//dizideki en buyuk elemani bulan fonksiyon
package E59;

import java.util.Arrays;

public class Main {

	public static void enBuyuk(int[] dizi) {
		int a=dizi[0];
		for(int b:dizi) {
			if(a<b) {
				a=b;;
			}}
		System.out.println("Dizinin en buyuk elemani: "+a);
	}
	//ikinci yol
	public static void enBuyukk(int[] dizi) {
		Arrays.sort(dizi);
		for(int i=dizi.length-1;i<dizi.length;i++) {
			System.out.println("Dizinin en buyuk elemani: "+dizi[i]);
		}
	}
	public static void main(String[] args) {
		int[] dizi= {1,50,7,84,19,44,4};
		enBuyuk(dizi);
		enBuyukk(dizi);
}}
