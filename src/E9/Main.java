//Medyan degerini bulan kod.
package E9;

import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		int[] array1= {1,6,10,2,7,204,14};
		Arrays.sort(array1);
		if(array1.length%2==1) {
			System.out.println("medyan degeri: "+array1[(array1.length)/2]);
		}else {
			System.out.println("medyan degeri: "+((array1[(array1.length)/2])+(array1[(array1.length)/2-1]))/2.0);
		}

	}

}
