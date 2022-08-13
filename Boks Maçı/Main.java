
public class Main {

	public static void main(String[] args) {
		Fighter f1=new Fighter("A", 10, 120, 100,100,40);
		Fighter f2=new Fighter("B", 15, 100,85,50,60);
		
		
		Match match=new Match(f1, f2, 80, 150);
		match.run();
	}

}
