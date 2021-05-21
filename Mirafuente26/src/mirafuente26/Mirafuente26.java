package mirafuente26;
import java.util.*;
/* MIRAFUENTE, Mark Rayden C. DICT 2-4*/

public class Mirafuente26 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double[] charges = new double[]{17.75, 24.75};
        String decision, accname;
        char acctype;
        int accno, processed = 0;
        double consumption, presentread, prevread, basic = 0, envicharge, vat, total = 0, grandtotal = 0;
        
        do{
            System.out.print("\n\t\t\tMAYNILAD WATER SERVICES INC.\n");
        
            System.out.print("\nACCOUNT NUMBER: ");
            accno = scan.nextInt();

            System.out.print("ACCOUNT NAME: ");
            accname = scan.next();
            scan.nextLine();

            System.out.print("ACCOUNT TYPE (R-RESIDENTIAL, C-COMMERCIAL): ");
            acctype = scan.next().charAt(0);
            
            System.out.print("PRESENT METER READING: ");
            presentread = scan.nextDouble();

            System.out.print("PREVIOUS METER READING: ");
            prevread = scan.nextDouble();

            consumption = presentread - prevread;
            System.out.print("CONSUMPTION (cu. m.): "+consumption);
                
            switch(acctype){
                case 'R':
                case 'r':
                    basic = consumption * charges[0];
                    System.out.print("\nBASIC CHARGE: "+basic);      
                break;
                
                case 'C':
                case 'c':
                    basic = consumption * charges[1];
                    System.out.print("\nBASIC CHARGE: "+basic);
                break;
                
                default:
                    System.out.println("Invalid Input!");
            }
            
            envicharge = basic * .20;
            System.out.print("\nENVIRONMENTAL CHARGES (20% of Basic Charge): "+envicharge);
            
            vat = basic * .12;
            System.out.print("\nVAT (12% of Basic Charge): "+vat);
            
            total = basic + envicharge + vat;
            System.out.print("\nTOTAL AMOUNT DUE: "+total);
            
            System.out.print("\n\nPROCESS ANOTHER? (Y/N): ");
            decision = scan.next();
            
            grandtotal = grandtotal + total;
            processed++;
        }
        while(decision.equalsIgnoreCase("Y"));{
        System.out.print("\nTOTAL NO. OF CUSTOMER PROCESSED: "+processed+"\n");
        System.out.print("GRAND TOTAL AMOUNT DUE: "+grandtotal+"\n");
            
        }
    }
    
}
