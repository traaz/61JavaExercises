//1-100 arasi bir sayi tut(Bilgisayar)
//7 hakta bulmaya calis.yoksa kaybedersin.
package E28;
import java.util.Random;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Random rand=new Random();
		int sayi=rand.nextInt(50);
		sayi+=1;
		int hak=1;
		while(true) {
			System.out.println("1-50 arasi bir sayi söyleyin: ");
			int a=scanner.nextInt();
			if(a>sayi) {
				System.out.println("Asagiya in");
				System.out.println("*******");
				hak+=1;
			}else if(a<sayi) {
				System.out.println("Yukariya cik");
				System.out.println("*******");
				hak+=1;
			}else if(a==sayi) {
				System.out.println("Tebrikler oyunu kazandin..");
				System.out.println(hak+". hakkinda bildin.");
				System.out.println("Skorun: "+100/hak);
				break;
			}
			if(hak==8) {
				System.out.println("Oyunu kaybettin...\nTutulan sayi:"+ sayi);
				break;
			}}}}
