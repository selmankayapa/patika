import java.util.Scanner;

public class MukemmelSayı {
	  public static void main(String[] args) {
		  int sayı,sonuc=0;
		  Scanner input =new Scanner(System.in);
		  System.out.println("bir sayı giriniz.");
		  sayı=input.nextInt();
		  
		  for(int i =1 ; i<sayı;i++) {
			  if(sayı % i==0) {
				  sonuc+=i;
			  }
		  }
		  
		  if(sonuc==sayı) {
			  System.out.println("Bu bir Mükemmel sayıdır.");
		  }
		  if(sonuc!=sayı) {
			  System.out.println("Bu bir Mükemmel sayı değildir.");
		  }
	  }
	
}
