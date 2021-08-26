//Klavyeden girilen Fahrenayt derecesini santigrad’a ceviren kod
package E8;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Fahrenayt derecesini giriniz :");
		double a=scanner.nextInt();
		double santigrad=((a-32.0)*5.0)/9.0;
		
		System.out.println(santigrad+" cantigrad.");
		
		

	}

}
