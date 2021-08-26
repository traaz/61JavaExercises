//Banka atmsi
package E26;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Atm'ye Hoþgeldiniz.");
		double bakiye=0;
		System.out.println("Ýþlem Seçiniz\n1-Bakiye Sorgu\n2-Para Çek\n3-Para Yatýr\n4-Çýkýþ");
		while(true) {
			System.out.print("Ýþleminiz: ");
			int islem=scanner.nextInt();
			if(islem==1) {
				System.out.println("Bakiyeniz: "+bakiye+" TL.");
			}else if(islem==2) {
				System.out.print("Çekilecek miktar: ");
				double cek=scanner.nextDouble();
				if(cek>bakiye) {
					System.out.println("Hesabýnýzda bu kadar para bulunmamaktadýr..\nBakiyeniz: "+bakiye+" TL.");
				}else {
					System.out.print("Para çekiliyor..\n");
					bakiye=bakiye-cek;
				}
		    }else if(islem==3) {
		    	System.out.print("Yatýrýlacak miktar: ");
		    	double yatýr=scanner.nextDouble();
		    	System.out.print("Para yatýrýldý.\n");
		    	bakiye=bakiye+yatýr;
		    }else if(islem==4) {
		    	System.out.println("Çýkýþ yapýlýyor...");
		    	break;
		    }else {
		    	System.out.println("Hatalý iþlem girdiniz..");
		    }
		}
	}
}
