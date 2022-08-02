
public class Palindrom {
	static boolean İsPalindrom(int number) {
		int temp=number,reversenumber=0,lastnumber;
		
		while(temp!=0) {			
			lastnumber=temp%10;	
			reversenumber=(reversenumber*10)+lastnumber;			
			temp /= 10;
		}
		if(number==reversenumber) {
			System.out.println("palindrom sayı");
		}else {
			System.out.println("palindrom sayı değil.");
		}
		
		return true;
		
	}
	
	
	
	
	public static void main(String[] args) {
		 İsPalindrom(5587855);
		 
		 
	 }
}
