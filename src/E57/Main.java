//palindromik kelime(tersi kendisiyle ayni olan kelime)
//ata
package E57;


public class Main {

	public static void palindromikMi(String text) {
		String yeniText="";
		for(int i=text.length()-1;i>=0;i--) {
			yeniText=yeniText+text.charAt(i);
			}
		if(yeniText.equals(text)) {
			System.out.println("palindromik kelime");
		}else {
			System.out.println("palindromik kelime deðil");
		}
		
	}
	public static void main(String[] args) {
		palindromikMi("ata");
		palindromikMi("naber");
	}

}
