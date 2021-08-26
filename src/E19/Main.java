//Palindrome Number-tersi kendisine esit olan sayiya denir.
package E19;

public class Main {
	public static void isCheck(int sayi) {
		int x=0;
		int sayi2=sayi;
		while(sayi>0) {
		    x=x*10;
			x=x+sayi%10;
			sayi=sayi/10;
		}
		if(x==sayi2) {
			System.out.println("it's palindrome number.");
		}else {
			System.out.println("it isn't palindrome number.");
		}
}	
public static void main(String[] args) {
		isCheck(161);
	}

}
