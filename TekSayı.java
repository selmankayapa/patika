
package teksayı;
import java.util.Scanner;
public class TekSayı {

    public static void main(String[] args) {
     int sayı;
     int total=0;
     Scanner input = new Scanner(System.in);
     
     do{
         System.out.print("sayı giriniz : ");
         sayı = input.nextInt();
         if(sayı%2==0){
             total += sayı;
        }                 
     }while(sayı%2==0);
         
        System.out.println(total);
}
}