//Verilen tamsayinin sifir, pozitif ya da negatif olup olmadiðini bulan kod
package E3;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Sayi giriniz: ");
		int a=scanner.nextInt();
		if(a>0) {
			System.out.println("Sayi pozitiftir.");
		}else if(a<0) {
			System.out.println("Sayi negatiftir.");
		}else {
			System.out.println("Sayi sifirdir.");
		}

	}

}
