//x,y,z sayilari verildiginde dik ucgen olup olmadigini veren fonskiyon
package E30;
import java.lang.Math;

public class Main {
	public static boolean dikUcgenMi(int x,int y, int z) {
		int a=(x*x)+(y*y);
		if(Math.sqrt(a)==z) {
			return true;
		}return false;
	}

	public static void main(String[] args) {
		System.out.println(dikUcgenMi(6, 8, 10));

	}}
