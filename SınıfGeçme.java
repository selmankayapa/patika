
package sınıf.geçme;
import java.util.Scanner;
public class SınıfGeçme {

    public static void main(String[] args) {
     int Mat,Fizik,Türkçe,Kimya,Müzik;
     int dersSayısı=5;
     Scanner input = new Scanner(System.in);
        //matematik
        System.out.print("matematik ortalamanızı giriniz. ");
        Mat = input.nextInt();
        if(0>Mat || Mat>100){
            dersSayısı--;
            Mat=0;
            System.out.println("0 ile 100 arasında yazılmadığı için ortalamaya dahil edilmedi.");
        }else{
            System.out.println("ortalamaya dahil edildi.");
        }
        //fizik
        System.out.print("Fizik ortalamanızı giriniz : ");
        Fizik = input.nextInt();
        if(0>Fizik || Fizik>100){
            dersSayısı--;
            Fizik=0;
            System.out.println("0 ile 100 arasında bir değer yazılmadığı için ortalamaya dahil edilmedi.");
        }else{
            System.out.println("ortalamaya dahil edildi.");
        }
        //türkçe
        System.out.print("Türkçe ortalamanızı giriniz : ");
        Türkçe = input.nextInt();
        if(0>Türkçe || Türkçe>100){
            dersSayısı--;
            Türkçe=0;
            System.out.println("0 ile 100 arasında bir değer yazılmadığı için ortalamaya dahil edilmedi.");
        }else{
            System.out.println("ortalamaya dahil edildi.");
        }
        //kimya
        System.out.print("Kimya ortalamanızı giriniz : ");
        Kimya = input.nextInt();
        if(0>Kimya || Kimya>100){
            dersSayısı--;
            Kimya=0;
            System.out.println("0 ile 100 arasında bir değer yazılmadığı için ortalamaya dahil edilmedi.");                    
        }else{
            System.out.println("ortalamaya dahil edildi.");
        }
        //müzik
        System.out.print("Müzik ortalamanızı giriniz : ");
        Müzik = input.nextInt();
        if( 0>Müzik  || 100<Müzik){
            dersSayısı--;
            Müzik=0;
            System.out.println("0 ile 100 arasında bir değer yazılmadığı için ortalamaya dahil edilmedi.");
        }else{
            System.out.println("ortalamaya dahil edildi.");
        }
        //ortalama
        double Ortalama = (Mat+Fizik+Türkçe+Kimya+Müzik)/(dersSayısı);
        System.out.println(Ortalama);
        
        if(Ortalama>=85){
            System.out.println("Harf notu : AA ,Geçtiniz.");
        }else if(60<=Ortalama){
            System.out.println("Harf Notu : BB ,Geçtiniz.");
        }else if(50<=Ortalama){
            System.out.println("Harf notu : CC ,Geçtiniz.");
        }else{
            System.out.println("Harf notu : FF ,Kaldınız.");
        }    
            
            
        
            
        
        
    }
    
}
