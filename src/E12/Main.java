//Bir sayiyi alan ve carpanlari gosteren fonksiyon
package E12;

import java.util.Scanner;

public class Main {
	
   public static void carpangoster(int a) {
	   for(int i=1;i<=a;i++) {
		   if(a%i==0) {
			   System.out.println(i);
		   }
	   }
   }
  public static void main(String[] args) {
		
	 carpangoster(60);
	   
	   

	}

}
