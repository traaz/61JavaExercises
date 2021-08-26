//Tas kagýt makas oyunu
package E29;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) {
		System.out.println("*****Tas Kagýt Makas Oyunu*****");
		System.out.println("Oyunu bitirmek icin lutfen 0'a basiniz.");
		Random rand=new Random();
		Scanner scanner=new Scanner(System.in);
		int yourScore=0;
		int pcScore=0;
		//1-tas
		//2-kagit
		//3-makas
		while(true) {
			System.out.println("Tas mi Kagit mi Makas mi ?");
			System.out.println("1-Tas\n2-Kagit\n3-Makas");
			int pcsecim=rand.nextInt(3);
			pcsecim+=1;
			int secim=scanner.nextInt();
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(secim==1 && pcsecim==1) {
				System.out.println("Pc secimi: Tas\nBerabere.");
				System.out.println("*****");
			}else if(secim==1 && pcsecim==2) {
				System.out.println("Pc secimi: Kagýt\nKaybettiniz.");
				System.out.println("*****");
				pcScore+=1;
			}else if(secim==1 && pcsecim==3) {
				System.out.println("Pc secimi: Makas\nKazandiniz.");
				System.out.println("*****");
				yourScore+=1;
			}else if(secim==2 && pcsecim==1) {
				System.out.println("Pc secimi: Tas\nKazandiniz.");
				System.out.println("*****");
				yourScore+=1;
			}else if(secim==2 && pcsecim==2) {
				System.out.println("Pc secimi: Kagýt\nBerabere.");
				System.out.println("*****");
			}else if(secim==2 && pcsecim==3) {
				System.out.println("Pc secimi: Makas\nKaybettiniz.");
				System.out.println("*****");
				pcScore+=1;
			}else if(secim==3 && pcsecim==1) {
				System.out.println("Pc secimi: Tas\nKaybettiniz.");
				System.out.println("*****");
				pcScore+=1;
			}else if(secim==3 && pcsecim==2) {
				System.out.println("Pc secimi: Kagýt\nKazandiniz.");
				System.out.println("*****");
				yourScore+=1;
			}else if(secim==3 && pcsecim==3) {
				System.out.println("Pc secimi: Makas\nBerabere");
				System.out.println("*****");
			}else if(secim==0) {
				System.out.println("Oyun bitti..\nGenel Skor:\n"+"Pc Skor: "+pcScore+"\nSizin Skor: "+yourScore);
			    break;
			}else {
				   System.out.println("Hatalý giris yaptiniz.");
				}}}}

