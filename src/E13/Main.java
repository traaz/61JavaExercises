//tavuk, inek, koyun,kopek *Sýrasýyla 
//Tum hayvanlarin toplam bacak sayisini donduren bir fonksiyon yaziniz.




package E13; 

public class Main {
	
	public static int toplamAyak(int t,int i,int k,int p) {
		return (t*2)+(i*4)+(k*4)+(p*4);
	}

	public static void main(String[] args) {
		System.out.println(toplamAyak(2, 3, 5, 2));

	}

}
