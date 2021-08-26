//iki sayinin yerini degistir.
package E22;

import java.util.Scanner;


public class Main {
		
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	      int sayi1;
	      int sayi2;
	        System.out.println("Birinci sayi:");
	        sayi1=scanner.nextInt();
	        System.out.println("Ýkinci sayi:");
	        sayi2=scanner.nextInt();
	        
	        int a = sayi1;
	        sayi1=sayi2;
	        sayi2=a;
	        
	        System.out.println("yeni1:"+sayi1);
	        System.out.println("yeni2:"+sayi2);
	   }}