//beden kitle endeksi bulma
package E14;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Kilonuzu giriniz:");
	        int kilo =scanner.nextInt();
	        System.out.print("Boyunuzu(m) giriniz(Örnek: 1,75):");
	        double boy=scanner.nextDouble();
	        double kitle_endeks=kilo/(boy*boy);
	        
	        System.out.println("Beden"
	                + "Kitle"
	                + "Endeksiniz:"+kitle_endeks);
	        
	        
	    }
	}

