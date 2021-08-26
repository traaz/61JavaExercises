// girilen herhangi bir sayinin tersini alan program
package E17;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int sonuç=0;
	    System.out.println("Sayý giriniz:");
		int sayý=scanner.nextInt();
		
		while(sayý>0) {
			sonuç=sonuç*10;
			sonuç=sonuç+sayý%10;
			sayý=sayý/10;
		}
	System.out.println("Tersi: "+sonuç);
	
	}

}
