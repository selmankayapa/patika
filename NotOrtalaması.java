import java.util.Scanner;

public class NotOrtalaması {

   
    
        
    public static void main(String[]) {
       int mat,fizik,kimya,türkçe,tarih,müzik;
       
       //SCANNER sınıfını tanımladık.
       Scanner inp = new Scanner(System.in);
       
       //kullanıcıdan değer almak.
        System.out.print("matematik notunuz :");
        mat = inp.nextInt();
        
        System.out.println("fizik notunuz :");
        fizik = inp.nextInt();
        
        System.out.println("kimya notunuz :");
        kimya = inp.nextInt();
        
        System.out.println("türkçe notunuz :"); 
        türkçe = inp.nextInt();
        
        System.out.println("tarih notunuz :");
        tarih = inp.nextInt();
        
        System.out.println("müzik notunuz :");
        müzik = inp.nextInt();
       
        int toplam = ((mat*6)+(fizik*3)+(kimya*3)+(türkçe*4)+(tarih*2)+(müzik*1));
        double sonuç = toplam/19 ;
        System.out.println("not ortalanız ;" + sonuç );
        
        boolean kosul =sonuç >=60;
        System.out.println((kosul==true ? "sınıfı geçtiniz.":"sınıfta kaldınız."));
        
        
                
                
                }     
    
    
}
