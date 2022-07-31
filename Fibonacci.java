
public class Fibonacci {
	 public static void main(String[] args) {
		 int sayı1=0, sayı2=1 ,toplam=0;
		 
		 for(int i=0;i<=9;i++) {
			 toplam =sayı1+sayı2;
			 
			 System.out.println(""+toplam);
			 
			 sayı1=sayı2;
			 sayı2=toplam;
		 }
		 
	 }
	 
}
