//Asal mi degil mi ?
package E24;


public class Main {
	
	public static boolean asalMi(int sayi) {
		if(sayi==1) {
			return false;
		}
		for(int i=2;i<sayi;i++) {
			if(sayi%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(asalMi(1));

	}

}
