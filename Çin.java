
package çin;
import java.util.Scanner;
public class Çin {

    public static void main(String[] args) {
       int doğumYılı,kalan;
       Scanner input = new Scanner(System.in);
       
        System.out.print("doğum yılınız : ");
        doğumYılı = input.nextInt();
        
        kalan = doğumYılı%12;
            
        if (kalan==0){
            System.out.print("Çin Zodyağı Burcunuz : Maymun");
        } else if (kalan==1){
            System.out.print("Çin Zodyağı Burcunuz : Horoz");
        }else if (kalan==2){
            System.out.print("Çin Zodyağı Burcunuz : Köpek");
        }else if (kalan==3){
            System.out.print("Çin Zodyağı Burcunuz : Domuz");
        }else if (kalan==4){
            System.out.print("Çin Zodyağı Burcunuz : Fare");
        }else if (kalan==5){
            System.out.print("Çin Zodyağı Burcunuz : Öküz");
        }else if (kalan==6){
            System.out.print("Çin Zodyağı Burcunuz : Kaplan");
        }else if (kalan==7){
            System.out.print("Çin Zodyağı Burcunuz : Tavşan");
        }else if (kalan==8){
            System.out.print("Çin Zodyağı Burcunuz : Ejderha");
        }else if (kalan==9){
            System.out.print("Çin Zodyağı Burcunuz : Yılan");
        }else if (kalan==10){
            System.out.print("Çin Zodyağı Burcunuz : At");
        }else if (kalan==11){
            System.out.print("Çin Zodyağı Burcunuz : Koyun");                
    }
    }
}
