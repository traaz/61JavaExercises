//yildizlarla once ileri sonra geri
//*
//**
//***
//****
//**
//**
//*
package E39;

public class Main {

	public static void main(String[] args) {
		for(int i=1;i<5;i++) {  //i satýr j kolon. 4 tane i var 
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=3;i>0;i--) {    //3 tane satýr olacak. (4-1)
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}}

}
