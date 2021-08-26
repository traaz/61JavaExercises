//disaridan girilen n sayisina kadar olan sayilarin toplami
package E46;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Lütfen bir sayý giriniz: ");
		int a=scanner.nextInt();
		int toplam=0;
		for(int i=1;i<=a;i++) {
			toplam+=i;
		}
		System.out.println("Girdiginiz sayiya kadar olan sayilarin toplami: "+toplam);
	}

}
