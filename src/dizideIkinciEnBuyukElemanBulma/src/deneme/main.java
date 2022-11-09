package deneme;

public class main {

	public static void main(String[] args) {
		int[] array= {1,20,5,10};
		int secondMax=0;
		int enBuyuk = array[0];
		for(int sayi : array) {
			if(sayi> enBuyuk) {
				secondMax = enBuyuk;
				enBuyuk = sayi;
				
			}
			else if(sayi>secondMax){
                secondMax=sayi;
            }
		}
		System.out.println(secondMax);

	}
	/*int[] array= {1,20,5,10,100};
	Arrays.sort(array);
	System.out.println(array[array.lenght-2]);
	for (int i = 0; i < array.length; i++) {
		System.out.println(array[array.length-2]);
		break;
	}*/

}
