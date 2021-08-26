
package kdv.tutarı;
import java.util.Scanner;
public class KDVTutarı {


    public static void main(String[] args) {
        double tutar;
        double kdvoranı;
        Scanner input = new Scanner(System.in);
        System.out.print("lütfen tutarı giriniz.");
        tutar = input.nextDouble();
        System.out.print("kdv oranı giriniz.");
        kdvoranı = input.nextDouble();
        
        System.out.println("kdv siz tutar :" + tutar);
        double kdvtutar = tutar*kdvoranı/100;
        System.out.println("KDV ORANI : " + kdvtutar);
        double kdvliTutar =kdvtutar+tutar;
        System.out.println("KDV Lİ TUTAR : " + kdvliTutar);
        
        
    }
    
}
