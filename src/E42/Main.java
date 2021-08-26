//yildizlarla baklava dilimi yapma
//      *
//     ***
//    *****
//   *******
//    *****
//     ***
//      *
package E42;

public class Main {
public static void main(String[] args) {
		for(int i=1;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print(" ");
			}
			for(int m=0;m<2*i-1;m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=3;i>0;i--) {
			for(int j=0;j<5-i;j++) {
				System.out.print(" ");
			}
			for(int m=0;m<2*i-1;m++) {
				System.out.print("*");
			}
			System.out.println();
		}}}
