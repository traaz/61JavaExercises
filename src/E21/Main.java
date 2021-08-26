//x üstel sayisini bulan fonksiyon yaz
//usBul(5,125)=3
package E21;

public class Main {

	public static void usBul(int taban,int sonuc) {
		int counter=1;
		while(sonuc>taban) {
			sonuc=sonuc/taban;
			counter+=1;
		}
		System.out.println("Kayip üs: "+counter);
	
}
	public static void main(String[] args) {
		usBul(5, 125);
     
}
}