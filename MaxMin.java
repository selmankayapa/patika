
package maxmin;
import java.util.Scanner;
public class MaxMin {

    public static void main(String[] args) {
       
        int adet,sayı ,ksayı=0,bsayı=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç tane sayı girilecek : ");
        adet=input.nextInt();
        
        for(int i = 1 ;i <= adet;i++){
            System.out.println(i + ". sayıyı giriniz :  ");
            sayı=input.nextInt();
            
            if(sayı>bsayı){
                sayı=bsayı;
            }
            ksayı=sayı;
            if(sayı<ksayı){
                sayı=ksayı;
            }
            bsayı=sayı;
        }
        
        System.out.println("büyük sayı : " + bsayı);
        System.out.println("küçük sayı : " + ksayı);
    }                
    
}
