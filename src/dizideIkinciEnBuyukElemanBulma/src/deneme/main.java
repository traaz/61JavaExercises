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
	
}
