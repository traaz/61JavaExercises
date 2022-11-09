package deneme;

public class main {

	public static void main(String[] args) {
		int[] array= {1,20,5,10};
		int ikinciBuyuk=0;
		int enBuyuk = array[0];
		for(int sayi : array) {
			if(sayi> enBuyuk) {
				ikinciBuyuk = enBuyuk;
				enBuyuk = sayi;
				
			}
			else if(sayi>ikinciBuyuk){
                ikinciBuyuk=sayi;
            }
		}
		System.out.println(ikinciBuyuk);

	}
	/*int[] array= {1,20,5,10,100};
	Arrays.sort(array);
	System.out.println(array[array.lenght-2]);
	for (int i = 0; i < array.length; i++) {
		System.out.println(array[array.length-2]);
		break;
	}*/

}
