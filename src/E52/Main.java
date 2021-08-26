
//kombinasyon hesaplayan fonksiyon
package E52;

public class Main {

	public static void c(int a,int b) {
		int c=a-b;
		int carpa=1;
		int carpb=1;
		int carpc=1;
		for(int i=1;i<=a;i++) {
			carpa*=i;
		}
		for(int i=1;i<=b;i++) {
			carpb*=i;
		}
		for(int i=1;i<=c;i++) {
			carpc*=i;
		}
		System.out.println("Ýki sayinin kombinasyonu: \n"+(carpa/(carpb*carpc)));
	}
	public static void main(String[] args) {
		c(6, 3);

	}

}
