//verilen diziyi ters ceviren fonskiyon
package E49;

public class Main {
     public static void tersDizi(int[] array) {
    	 int[] tersDizi=new int[array.length];
    	 for(int i=0;i<array.length;i++) {
    		 tersDizi[array.length-i-1]=array[i];
    	 }
    	 for(int a:tersDizi) {
    		 System.out.println(a);
    	 }
     }
	public static void main(String[] args) {
		int[] dizi= {10,50,60,70};
		tersDizi(dizi);
	}
}
