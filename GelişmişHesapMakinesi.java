import java.util.Scanner;

public class GelişmişHesapMakinesi {
	
				//TOPLAMA İŞLEMİ 
	static int sum(int a,int b) {
		int result=a+b;
		System.out.println("Toplam : " + result );
		return result;
	}
					//ÇIKARTMA İŞLEMİ
	static int minus(int a ,int b) {
		int result=a-b;
		System.out.println("Çıkarma : " + result);
		return result;	
		}
					//çarpma işlemi 
	static int çarp(int a,int b) {
		int result=a*b;
		System.out.println("çarpma : " + result);
		return result;
	}
					//Bölme işlemi 
	static double böl(double a,double b) {
		if(b==0) {
			System.out.println("0'a bölünme hatası...");
		}
		double result=a/b;
		System.out.println("Bölme : " + result);
		return result;
	}
					//Üs Alma
	static int üsAlma(int a,int b) {
		int result=1;
		for(int i=1 ; i<=b ; i++) {
			result*=a;
		}
		System.out.println(a+"üssü"+b +" ="+ result);
		return result;
	}
					//Faktöriyel
	static int faktöriyel(int a ) {
		int result=1;
		for(int i=1 ; i<=a ; i++) {
			result*=i;			
		}
		System.out.println(a + "!" + "=" + result);
		return result;
	}
					//Mod Alma
	static int modAl(int a,int b) {
		int result = 1 ;
		result=a%b;
		System.out.println("Mod : " + result);
		return result;
	}
				//Dikdörtgen
	static void calc(int a ,int b) {
		System.out.println("Alanı : " + (a*b));
		System.out.println("Çevresi : " + ((a+b)*2) );
	}
	

	
	
	
	
	
	
					//Ana Yer
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
	while(true) {

		  System.out.println(menu);
		  System.out.print("Bir işlem seçiniz : ");
		  select=input.nextInt();
		  if(select==0) {
			  break;
		  }
		  else if(select==6) {
			  System.out.print("Faktöriyel sayısı  : ");
			  int a=input.nextInt();
			  faktöriyel(a);
			  break;
		  }else if(select==7) {
			  System.out.println("bölünen : ");
			  int a=input.nextInt();
			  System.out.println("bölen : ");
			  int b = input.nextInt();
			  modAl(a, b);
			  break;
		  }else if(select==8) {
			  System.out.println("kısa kenar : ");
			  int a = input.nextInt();
			  System.out.println("uzun kenar : " );
			  int b = input.nextInt();
			  calc(a, b);
		  	  break;
			  
		  }
		  System.out.print("birinci sayı : ");
		  int a=input.nextInt();
		  System.out.print("ikinci sayı : ");
		  int b=input.nextInt();
		  	  
		  
		  switch(select) {
		  	case(1):
		  		sum(a,b);
		  		break;
		  	case(2):
		  		minus(a,b);
		  		break;
		  	case(3):
		  		çarp(a,b);
		  		break;
		  	case(4):	
		  		böl(a,b);
		  		break;
		  	case(5):
		  		üsAlma(a,b);
		  		break;
		  	
		  }	  	
		  	
	 }
}
}