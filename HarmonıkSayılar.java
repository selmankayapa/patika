
package harmonıksayılar;
import java.util.Scanner;
public class HarmonıkSayılar {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("n sayısını giriniz : ");
        double result = 0.0 ;
        int n=input.nextInt();
        
        for (double i=1 ; i<=n ; i++){
            result += (1/i);
            
        }
        System.out.println(result);
    }
}