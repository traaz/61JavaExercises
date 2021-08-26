//Hesap Makinesi
package E25;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ýþlem seçiniz\n1-Toplama\n2-Çýkarma\n3-Çarpma\n4-Bölme\n5-Çýkýþ");
		while(true) {
			System.out.print("Ýþleminiz: ");
			int islem=scanner.nextInt();
			if(islem==1) {
				System.out.println("Birinci sayi:");
				double a=scanner.nextDouble();
				System.out.println("Ýkinci sayi:");
				double b=scanner.nextDouble();
				System.out.println(a+b);
			}
			else if(islem==2) {
				System.out.println("Birinci sayi:");
				double a=scanner.nextDouble();
				System.out.println("Ýkinci sayi:");
				double b=scanner.nextDouble();
				System.out.println(a-b);
			}
			else if(islem==3) {
				System.out.println("Birinci sayi:");
				double a=scanner.nextDouble();
				System.out.println("Ýkinci sayi:");
				double b=scanner.nextDouble();
				System.out.println(a*b);
			}
			else if(islem==4) {
				System.out.println("Birinci sayi:");
				double a=scanner.nextDouble();
				System.out.println("Ýkinci sayi:");
				double b=scanner.nextDouble();
				System.out.println(a/b);
			}else if(islem==5) {
				System.out.println("Hesap Makinesinden çýkýlýyor..");
				break;
			}else {
				System.out.println("Hatalý iþlem girdiniz.");
			}
	}
	}
}
