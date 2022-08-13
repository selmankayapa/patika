import java.util.Scanner;

public class Burç {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Doğduğunuz ayı yazınız : ");
		String moon=input.next();
		System.out.println("doğduğunuz günü yazın : ");
		int day = input.nextInt();
		
		String burc = "";
		
		
		if(moon.equalsIgnoreCase("Ocak")) {
			if(day>22) {
				burc="kova";
						
			}else{
				burc="oğlak";
			}
		}
		if(moon.equalsIgnoreCase("Şubat")) {
			if(day>20) {
				burc="balık";
						
			}else{
				burc="Kova";
			}
	}
		if(moon.equalsIgnoreCase("Mart")) {
			if(day>21) {
				burc="Koc";
						
			}else{
				burc="Balık";
			}

}
		if(moon.equalsIgnoreCase("Nisan")) {
			if(day>21) {
				burc="Boğa";
						
			}else{
				burc="Koç";
			}
		}
		if(moon.equalsIgnoreCase("Mayıs")) {
			if(day>22) {
				burc="İkizler";
						
			}else{
				burc="Boğa";
			}
	
}
		if(moon.equalsIgnoreCase("Haziran")) {
			if(day>23) {
				burc="Yengeç";
						
			}else{
				burc="İkizler";
			}
	
}
		if(moon.equalsIgnoreCase("Temmuz")) {
			if(day>23) {
				burc="Aslan";
						
			}else{
				burc="Yengeç";
			}
	
}
		if(moon.equalsIgnoreCase("Ağustos")) {
			if(day>23) {
				burc="Başak";
						
			}else{
				burc="Aslan";
			}
	
}
		if(moon.equalsIgnoreCase("Eylül")) {
			if(day>23) {
				burc="Terazi";
						
			}else{
				burc="Başak";
			}
	
}
		if(moon.equalsIgnoreCase("Ekim")) {
			if(day>23) {
				burc="Akrep";
						
			}else{
				burc="Terazi";
			}
	
}
		if(moon.equalsIgnoreCase("Kasım")) {
			if(day>22) {
				burc="Yay";
						
			}else{
				burc="Akrep";
			}
	
}
		if(moon.equalsIgnoreCase("Aralık")) {
			if(day>22) {
				burc="Oğlak";
						
			}else{
				burc="Yay";
			}
	
}
		
		System.out.println(day + "Gününde"+  moon + "Ayındaki burcunuz :  " + burc );
	}
}