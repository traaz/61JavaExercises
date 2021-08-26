//Tarihi,yuzyila ceviren fonksiyon
package E15;

public class Main {
	
	public static void hangiYuzyil(int tarih) {
		int yuzyýl=(tarih/100)+1;
		
		System.out.println(yuzyýl+". yuzyýl.");
	}

	public static void main(String[] args) {
		hangiYuzyil(2021);
	}

}
