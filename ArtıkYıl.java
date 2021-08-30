
package artıkyıl;
import java.util.Scanner;
public class ArtıkYıl {

    public static void main(String[] args) {
    int yıl,Ayıl,kalanYuz;
    Scanner input = new Scanner(System.in);
    
        System.out.println("Yıl Giriniz : ");
        yıl = input.nextInt();
        
        Ayıl = yıl%4;
        kalanYuz = yıl % 400;
        
       if(Ayıl==0){
           if(kalanYuz==0 || Ayıl==0){
               System.out.println("artık yıl.");
           }else{
               System.out.println("artık yıl değil..");
           }
           
       }else{
           System.out.println("artık yıl değil..");
       }
    }  
    }

