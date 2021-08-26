//stringte verilen harfin kac kez gectigini bulma
package E37;

public class Main {
	
	public static void kacKez(String text,char a) {
		int harf=0;
		text.toLowerCase();
		for(int i=0;i<text.length()-1;i++) {
			if(text.charAt(i)==a) {
				harf+=1;
			}
		}System.out.println("Girilen stringteki aranan kelime sayisinin adedi: "+harf);
	}

	public static void main(String[] args) {
		kacKez("mustafa kemal ataturk", 'a');
	}

}
