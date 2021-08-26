//Girilen stringi ters ceviren kod
package E10;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Kelime giriniz: ");
		String kelime=scanner.nextLine();
		String tersKelime="";
		
		for(int i=kelime.length()-1;i>=0;i--) {
			tersKelime=tersKelime+kelime.charAt(i);
		}
		System.out.println(tersKelime);
		}

}
