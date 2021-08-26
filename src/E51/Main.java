//Permutasyon hesaplayan fonskiyon
package E51;

public class Main {

	public static void p(int a,int b) {
		int c=a-b;
		int carp=1;
		int carpp=1;
		for(int i=1;i<=a;i++) {	
			carp*=i;
		}
		for(int i=1;i<=c;i++) {
			if(c==0) {
				carpp=1;
			}else {
				carpp*=i;
			}
		}
		System.out.println("İki sayinin permutasyonu: \n"+carp/carpp);
	}
	
	public static void main(String[] args) {
		p(6,3);
	}

}
