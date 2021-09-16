
package atm;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
       String UserName,password;
       Scanner input = new Scanner(System.in);
       int Hak=3;
       int money = 1500 ;
       int select;
       while(Hak > 0){
           System.out.print("kullanıcı adını giriniz : ");
           UserName = input.nextLine();
           System.out.print("şifrenizi giriniz : ");
           password = input.nextLine();     
       if(UserName.equals("Selman")&&password.equals("Kayapa")){
           System.out.println("Girişiniz başarılı.");
           do{
               System.out.print   ("1-Para yatırma/n"
                                 + "2-Para çekme/n"
                                 + "3-Bakiye sorgulama/n"
                                 + "4-Çıkış yapma.");
               System.out.println("Lütfen yapmak istediğiniz işi seçiniz.");
               select=input.nextInt();
               if(select==1){
                   System.out.println("para miktarı : " );
                   int price = input.nextInt();
                   money+=price;
                   System.out.println("para miktarı : " + money);
               }else if(select==2){
                   System.out.println("para miktarı :  ");
                   int price = input.nextInt();
                   if(price>money){
                       System.out.println("bakiye yetersiz.");
                   }else{
                       money-=price;
                   } 
                   System.out.println( price +"TL para çektiniz." + "kalan bakiyeniz : " + money );
                   
               }else if(select == 3){
                   System.out.println("kalan paranız : " + money );
               }
           }while(select!=4);
           System.out.println("çıkış başarılı.");
           break;
       }else{
           Hak--;
           System.out.println("kullanıcı adı veya şifreniz yanlış..");
           if(Hak==0){
               System.out.println("hesabınız bloke olmuştur.");
           }else{
               System.out.println("kalan hakkınız :  " + Hak);
           }
       }
       }
    }
    
}
