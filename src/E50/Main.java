//bir dizideki cift elemanlari baska bir diziye atan program
package E50;

import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
	
		ArrayList<Integer> array=new ArrayList<Integer>();
		ArrayList<Integer> array2=new ArrayList<Integer>();
		array.add(1);
		array.add(4);
		array.add(8);
		array.add(9);
		array.add(7);
		for(int i=0;i<array.size();i++) {
			if(array.get(i)%2==0) {
				array2.add(array.get(i));
			}
		}
		for(int a:array2) {
			System.out.println(a);
		}
		

	}

}
