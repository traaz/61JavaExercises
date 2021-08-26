//Klavyeden girilen fiyati, KDV(%18) ekleyerek ekrana yazdirin.
package E6;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Fiyatý giriniz: ");
		double fiyat=scanner.nextDouble();
		
		double kdv=((fiyat*18.0)/100.0)+fiyat;
		
		System.out.println("KDV eklendikten sonraki son fiyat: "+kdv+" TL.");
		

	}

}
