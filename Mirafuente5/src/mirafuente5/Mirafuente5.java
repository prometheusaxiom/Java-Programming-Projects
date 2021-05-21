package mirafuente5;
import java.util.Scanner;

public class Mirafuente5 {

    public static void main(String[] args) {
       char class_ID;
       
       Scanner sc = new Scanner(System.in);
       System.out.print("CLASS ID: ");
       class_ID = sc.next().charAt(0);
       
       if ((class_ID == 'B')||(class_ID == 'b')){
            System.out.println("BATTLESHIP");
         }
       else if ((class_ID == 'C')||(class_ID == 'c')){
            System.out.println("CRUISER");
         }
       else if ((class_ID == 'D')||(class_ID == 'd')){
            System.out.println("DESTROYER");
         }
       else if ((class_ID == 'F')||(class_ID == 'f')){
            System.out.println("FRIGATE");
         }
       else {
            System.out.println("INPUT ERROR");
        }
       
    }
    
}
