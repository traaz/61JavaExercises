//girilen stringte harf ve rakam sayýsýný gösteren kod
package E36;

public class Main {
	public static void say(String text) {
		char[] rakamlar={'0','1','2','3','4','5','6','7','8','9'};
		char[] harfler= {'q','w','e','r','t','y','u','ý','o','p','ð','ü'
				,'a','s','d','f','g','h','j','k','l','þ','i','z','x','c','v','b'
				,'n','m','ö','ç'};
		int harfsayýsý=0;
	    int rakamsayýsý=0;			
	    text.toLowerCase();
		for(int i=0;i<=text.length()-1;i++) {
			for(char j:rakamlar) {
				if(text.charAt(i)==j) {
					rakamsayýsý+=1;
				}
			}
			for(char j:harfler) {
					if(text.charAt(i)==j) {
						harfsayýsý+=1;
	}}}System.out.println("Harf sayýsý: "+harfsayýsý+"\nRakam sayýsý: "+rakamsayýsý);
			}
		
	public static void main(String[] args) {
		say("bugün 13 derece hava");
}
}