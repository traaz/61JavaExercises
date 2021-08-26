//String kisaltan fonksiyon
//naaaabeeeeeeer===>naber
package E53;

public class Main {
	public static void stringKisalt(String text) {
		String yeniKelime="";
		for(int i=0;i<text.length();i++) {
			if(i+1>=text.length()) {
				break;
			}
			if(text.charAt(i)!=text.charAt(i+1)) {
				yeniKelime=yeniKelime+text.charAt(i);
		}
		}
		System.out.println(yeniKelime+text.charAt(text.length()-1));
	}
	public static void main(String[] args) {
		stringKisalt("naaaabeeeeeeer");

	}

}
