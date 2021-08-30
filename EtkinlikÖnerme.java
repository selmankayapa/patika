
package etkinlik.önerme;
import java.util.Scanner;
public class EtkinlikÖnerme {

    public static void main(String[] args) {
       double Heat;
       Scanner input = new Scanner(System.in);
       
        //kullanıcıdan sıcaklık değerini alma.
        System.out.println("Lütfen sıcaklık değerini giriniz : ");
        Heat = input.nextDouble();
        
        //önerme
        if(Heat<5){
            System.out.println("Kayak yapmanı öneririm.");
        }else if(5<=Heat && Heat<=15){
            System.out.println("Sinemaya gitmeni öneririm.");
        }else if(15<Heat && Heat<=25){
            System.out.println("Piknik yapmanı öneririm.");
        }else if(Heat>25){
            System.out.println("Yüzmeye gitmeni öneririm.");
        }
    }
    
}
