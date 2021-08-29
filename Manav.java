package manav;
import java.util.Scanner;
public class Manav {

    public static void main(String[] args) {
        double A,E,D,M,P;//armut,elma,domates,muz,patlıcan
        double Tutar;
        Scanner input = new Scanner(System.in);
        
        System.out.print("kaç kilo armut : ");
        A = input.nextDouble();
        
        System.out.print("kaç kilo elma : ");
        E = input.nextDouble();
        
        System.out.print("kaç kilo domates : ");
        D = input.nextDouble();
        
        System.out.print("kaç kilo muz : ");
        M = input.nextDouble();
        
        System.out.print("kaç kilo patlıcan : ");
        P = input.nextDouble();
        
        Tutar = (A*2.14)+(E*3.67)+(D*1.11)+(M*0.95)+(P*5.0);
        System.out.println("Toplam Tutar : " + Tutar);
        
       
        
    }
    
}
