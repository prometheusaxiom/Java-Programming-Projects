package mirafuente6;
import java.util.Scanner;

public class Mirafuente6 {

    public static void main(String[] args) {
    char class_ID;
    
    Scanner sc = new Scanner(System.in);
    System.out.print("CLASS ID: ");
    class_ID = sc.next().charAt(0);
    
    switch(class_ID)
            {
            case 'B':
            case 'b':
                    System.out.println("BATTLESHIP");
                    break;
            case 'C':
            case 'c':
                    System.out.println("CRUISER");
                    break;
            case 'D':
            case 'd':
                    System.out.println("DESTROYER");
                    break;
            case 'F':
            case 'f':
                    System.out.println("FRIGATE");
                    break;
            default:
                    System.out.println("INPUT ERROR");
                    break;
        }
    }
    
}
