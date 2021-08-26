//Fibonacci dizisini yazdirin(1-60 arasi)
package E33;

public class Main {

	public static void main(String[] args) {
		
		int a=1;
		int b=1;
		int c=1;
		System.out.println(a);
		System.out.println(b);
		while(c<50) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		
			
	}

}
