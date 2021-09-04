
package kombinasyon;
import java.util.Scanner;
public class Kombinasyon {

    public static void main(String[] args) {
    int sayi, sonuc = 1, n, r, nF = 1, rF = 1, nRF = 1, ks;
    Scanner input = new Scanner(System.in);
    
    
        System.out.println("eleman sayısı (n) : ");
        n=input.nextInt();
        
        System.out.println("seçim sayısı (r) : ");
        r=input.nextInt();
        
        for(int y=1 ; y <= n ; y++){
            nF=nF*y;
        }
        for(int z=1 ; z <= r ; z++){
            rF=rF*z;
        }
        for(int i = 1 ; i <=n-r ; i++){
            nRF=nRF*i;
        }
        ks=nF / (rF * (nRF));
        System.out.println("C(" + n + "," + r + "): " + ks);
    }
    
}
