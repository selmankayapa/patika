
package pkgcase;
import java.util.Scanner;
public class Case {

    public static void main(String[] args) {
        int a,b,select;
        Scanner input = new Scanner(System.in);
    
    
        System.out.print("ilk sayıyı giriniz : ");
        a = input.nextInt();
        System.out.print("ikinci saıyı giriniz : ");
        b = input.nextInt();
        
        
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("yapma istediğiniz işlemin numarası   : ");
        select = input.nextInt();    
        
        
        switch(select){
            case 1:
                System.out.println("toplam : " + (a+b));
                break;
            case 2:
                System.out.println("çıkarma  : " + (a-b) );
                break;
            case 3: 
                System.out.println("çarpma : " + (a*b));
                break;
            case 4: 
                System.out.println("Bölme : " + (a/b));
                break;
            default;
                System.out.println("yanlış seçim.");
            
               
        }
    }
        
   
    
        
    
}
