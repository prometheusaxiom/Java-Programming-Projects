package mirafuente21;
/* MIRAFUENTE, Mark Rayden C. DICT 2-4*/
import java.util.Scanner;

public class Mirafuente21 {
    public static void main(String[] args) {
        String name, status = null, decision = " ";
        int stat;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("CIVIL STATUS CHECKER\n");
        
        do{  
            System.out.print("\nENTER YOUR NAME: ");
            name = scan.next();
            scan.nextLine();
            System.out.print("SELECT YOUR CIVIL STATUS \n 1-SINGLE, 2-MARRIED, 3-ANNULED, 4-SEPARATED, 5-WIDOW: ");
            stat = scan.nextInt();
            
            switch (stat) {
                case 1:
                    status = "SINGLE";
                    break;
                case 2:
                    status = "MARRIED";
                    break;
                case 3:
                    status = "ANNULED";
                    break;
                case 4:
                    status = "SEPARATED";
                    break;
                case 5:
                    status = "WIDOW";
                    break;
                default:
                    System.out.print("Invalid Input!");
                    break;
            }   
            System.out.print("\nHI, "+name+" YOU ARE "+status+".\n");
            
            System.out.print("\nDO YOU WANT TO CONTINUE(TYPE Y OR N): ");
            decision = scan.next();  
        } 
    while (decision.equalsIgnoreCase("Y"));{
        System.out.print("\nTHANK YOU FOR USING THIS PROGRAM\n");
        }
    }
    
}
