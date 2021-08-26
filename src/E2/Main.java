// Girilen vize ve final notlarina gore öðrencinin dersten gecip gecmedigini bulan kod
package E2;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Vize notunuz: ");
		int vize=scanner.nextInt();
		System.out.println("Final notunuz: ");
		int finall=scanner.nextInt();
		
		double sonuç=(vize+finall)/2.0;
		
		if(sonuç>=45 && sonuç<=100) {
			System.out.println("Dersten gectiniz.");
		}else if(sonuç<45 && sonuç>=0 ) {
			System.out.println("Dersten kaldiniz.");
		}else {
			System.out.println("Girdiginiz degerleri lutfen kontrol ediniz.");
		}
	}
}
