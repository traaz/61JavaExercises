//en buyuk ortak bölen(ebob)bulma
package E35;

public class Main {
	public static void ebobBul(int a,int b) {
		int ebob=1;
		for(int i=1;i<=a;i++) { // i<=b'de yapabiliriz fark etmez sonuçta en büyük ortak bölen arýyoruz.
			if(a%i==0 && b%i==0) {
				ebob=i;
			}
		}System.out.println("Ebob:"+ebob);
	}

	public static void main(String[] args) {
		ebobBul(100, 8);

	}

}
