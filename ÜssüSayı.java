
package üssüsayı;
import java.util.Scanner;
public class ÜssüSayı {

    public static void main(String[] args) {
     int sayi,kuvvet,üssü=1;
     Scanner input = new Scanner(System.in);
     
        System.out.print("sayı giriniz : ");
        sayi=input.nextInt();
        
        System.out.print("kuvvet giriniz : ");
        kuvvet = input.nextInt();
        
        for(int i=1;i < kuvvet;i++){
            üssü *= sayi;
            System.out.println(sayi + "^" + kuvvet + " : " + üssü);    
            
        }
        
    }
    
}
