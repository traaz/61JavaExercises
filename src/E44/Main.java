// yuksekligi genisligi verilen dikdortgen olustur(yildizlarla)
package E44;

public class Main {

	public static void dikdortgenOlustur(int yükseklik,int geniþlik) {
		for(int i=0;i<yükseklik;i++) {
			for(int j=0;j<geniþlik;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		dikdortgenOlustur(4, 10);

	}

}
