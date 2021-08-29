
package vücutkitle;
import java.util.Scanner;
public class VücutKitle {

    
    public static void main(String[] args) {
        double B,K,V;//boy,kilo,vki
                
        Scanner input = new Scanner(System.in);
        //boy
        System.out.print("boyunuzu (metre cinsinden) giriniz : ");
        B = input.nextDouble();
        //kilo
        System.out.print("kilonuzu giriniz  :  ");
        K = input.nextDouble();
        
        //Vücut Kİtle İndeksi
        V = K/(B*B) ;
        System.out.println("Vücut kitle endeksiniz : " + V );
    }
    
}
