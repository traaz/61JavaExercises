//Listede 5 varsa "5 VAR" yazdir
package E23;

public class Main {
     
	public static String boom(int [] array) {
		for(int i=0;i<=array.length-1;i++) {
			if(array[i]==5) {
				return "5 VAR";
				
			}
		}return "Listede 5 yok";
		
	}
	public static void main(String[] args) {
		int[] dizi= {1,3,9,5,7};
        System.out.println(boom(dizi));
	}

}
