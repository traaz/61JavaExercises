//kaclýk ucgen olusturmak(yildizlarla) istediðini girdigin fonksiyon(sola dayali) yaz.
package E40;

public class Main {
	
	public static void ucgenOlustur(int dikey) {
		for(int i=1;i<=dikey;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		ucgenOlustur(3);

	}

}
