
package üçgenhesabı;
import java.util.Scanner;
public class ÜçgenHesabı {

    
    public static void main(String[] args) {
        double A,B,C;//C hipotenüs.
        Scanner input = new Scanner(System.in);
        System.out.print("1. kenarı giriniz.");
        A = input.nextDouble();
        System.out.print("2.kenarı giriniz.");
        B = input.nextDouble();
        
        C = Math.sqrt((A*A)+(B*B));
        System.out.println("hipotenüs : " + C);
    }
    
}
