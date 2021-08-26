// istenilen satir kadar baklava dilimi hazirlayan fonksiyon.
package E43;

public class Main {
	public static void baklavaOlustur(int satır) {
		for(int i=1;i<=satır;i++) {
			for(int j=0;j<satır-i;j++) {
				System.out.print(" ");
			}for(int k=0;k<2*i-1;k++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int i=satır-1;i>0;i--) {
			for(int j=0;j<satır-i;j++) {
				System.out.print(" ");
			}for(int k=0;k<2*i-1;k++) {
				System.out.print("*");
			}System.out.println();
		}}
   public static void main(String[] args) {
		baklavaOlustur(10);

	}

}
