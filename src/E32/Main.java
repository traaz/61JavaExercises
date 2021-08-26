//50'den kucuk 2 ve 7'in kati olan sayilari yazdir ve topla
package E32;

public class Main {

	public static void main(String[] args) {
		int toplam=0;
				
		for(int i=1;i<=50;i++) {
			if(i%2==0 && i%7==0) {
				System.out.println(i);
				toplam+=i;
			}
		}System.out.println("Sayilarin toplami: "+toplam);
	}

}
