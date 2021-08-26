//Girilen kelimenin stringte kac kez gectigini veren fonksiyon
//kacKez("tek tek sayýlara baktim ve tek olanlari yazdim","tek")=3
package E60;


public class Main {

	public static void kacKez(String text,String kelime) {
		int kelimeSayisi=0;
	    String[] kelimeler=text.split(" ");
	    for(String a:kelimeler) {
	    	if(a.equals(kelime)) {
	    		kelimeSayisi+=1;
	    	}
	    }System.out.println("Girilen kelime cumlede "+kelimeSayisi+" kez var.");
	}
	public static void main(String[] args) {
		kacKez("tek tek sayýlara baktim ve tek olanlari yazdim","tek");
	}

}
