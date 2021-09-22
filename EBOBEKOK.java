
package ebob.ekok;
import java.util.Scanner;
public class EBOBEKOK {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ebob=1;
        int ekok;
        
        System.out.println("n1 sayısını giriniz  : ");
        int n1 = input.nextInt();
        
        System.out.println("n2 sayısını giriniz  : ");
        int n2 =input.nextInt();
        
        //Alttaki döngü 18 kere dönüyor
        for(int i =1 ; i<=n1 ;i++){
            if(n1%i==0 && n2%i==0){
                ebob=i;
                
               
            }
        }
        //döngü 14 kere dönüyor.
        for(int k=n1;k>=1;k--){            
            if(n1%k==0 && n2%k==0){
                ebob=k;
                System.out.println("Ebob'un değeri : " + ebob);
                break;
            }
        }
        ekok=(n1*n2)/ebob;
        System.out.println("Ekok'un değeri : " + ekok);
    }
    
}
