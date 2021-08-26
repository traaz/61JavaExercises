//kirmizi mavi iki takim olsun
//her takim iki zar atiyor(random bilgisayar)
//gelen zarlarin toplami buyuk olan kazanir.
//duses gelirse vurgula
package E27;
import java.util.Random;
public class Main {
 public static void main(String[] args) {
		Random rand=new Random();
		int kirmizi1=rand.nextInt(6);
		kirmizi1+=1;
		int kirmizi2=rand.nextInt(6);
		kirmizi2+=1;
		
		int mavi1=rand.nextInt(6);
		mavi1+=1;
		int mavi2=rand.nextInt(6);
		mavi2+=1;
		
		if(kirmizi1+kirmizi2>mavi1+mavi2) {
			System.out.println("Kýrmýzý takým: "+kirmizi1+","+kirmizi2+"\nMavi Takým: "+mavi1+","+mavi2);
			System.out.println("Kazanan kýrmýzý takým..!");
			if(kirmizi1==6 && kirmizi2==6) {
				System.out.println("Hem  de düþeþle..!!!!!!");
			}
	   }else if(mavi1+mavi2>kirmizi1+kirmizi2) {
		System.out.println("Kýrmýzý takým: "+kirmizi1+","+kirmizi2+"\nMavi Takým: "+mavi1+","+mavi2);
		System.out.println("Kazanan mavi takým..!");
		if(mavi1==6 && mavi2==6) {
			System.out.println("Hem  de düþeþle..!!!!!!");
		}
	  }else {
		System.out.println("Kýrmýzý takým: "+kirmizi1+","+kirmizi2+"\nMavi Takým: "+mavi1+","+mavi2);
		System.out.println("Sonuç berabere.");
	}
}
}
