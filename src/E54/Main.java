//verilen iki deger arasinda verilen sayi kadar ilerleyen fonsksiyon
//aralik(2,50,5) 2'den 50'ye kadar 5'er 5'er artan sayilar
package E54;

public class Main {

	public static void aralik(int baslangic,int bitis,int artis) {
		for(int i=baslangic;i<=bitis;i+=artis) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		aralik(2, 50, 5);

	}

}
