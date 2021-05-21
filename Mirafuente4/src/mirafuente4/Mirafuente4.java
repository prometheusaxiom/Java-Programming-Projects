package mirafuente4;
import java.util.Scanner;

public class Mirafuente4 {

    public static void main(String[] args) {
        float richter_No;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE RICHTER NUMBER: ");
        richter_No = sc.nextFloat();
        
        if (richter_No < 5){
            System.out.println("CHARACTERIZATION: LITTLE OR NO DAMAGE");
        }
        else if ((richter_No >= 5) && (richter_No <= 5.5)){
            System.out.println("CHARACTERIZATION: SOME DAMAGE");
        }
        else if ((richter_No > 5.5) && (richter_No <= 6.5)){
            System.out.println("CHARACTERIZATION: SERIOUS DAMAGE");
        }
        else if ((richter_No > 6.5) && (richter_No <= 7.5)){
            System.out.println("CHARACTERIZATION: DISASTER");
        }
         else if (richter_No > 7.5){
            System.out.println("CHARACTERIZATION: CATASTROPHE");
        }
         else {
             System.out.println("INPUT ERROR");
         }
    }
    
}
