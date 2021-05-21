package mirafuente24;
import java.util.*;
/* MIRAFUENTE, Mark Rayden C. DICT 2-4*/

public class Mirafuente24 {
    public static void main(String[] args) {
        
        String cusname, answer = " ";
        int cusno, days = 0, code;
        double grandtotal = 0, totalbill = 0, bill = 0;
        String[] roomclass = new String[]{"SINGLE SUITE", "SERVICE DE LUXE", "SERVICE PREMIERE"};
        double[] recrefee = new double[]{1000.00, 1500.00, 2000.00};
        double[] rate = new double[]{2000.00, 2500.00, 3000.00};
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.print("\t\t\tVILLA ASTER HOTEL AND RESTAURANT\n"); 
            System.out.print("\nCUSTOMER NO.: ");
            cusno = scan.nextInt();
            System.out.print("CUSTOMER NAME: ");
            cusname = scan.next();
            scan.nextLine();
            
            System.out.print("\nCLASS CODE");
            System.out.print("\tCLASSIFICATION");
            System.out.print("\t\tRECREATIONAL FEE");
            System.out.print("\tRATE PER DAY");
            System.out.print("\n    1\t\tSINGLE SUITE\t\t    1000.00\t\t  2000.00");
            System.out.print("\n    2\t\tSERVICE DE LUXE\t\t    1500.00\t\t  2500.00");
            System.out.print("\n    3\t\tSERVICE PREMIERE\t    2000.00\t\t  3000.00");
         
            System.out.print("\n\nCLASS CODE: ");
            code = scan.nextInt();
            
        
            if (code == 1){
                System.out.print("CLASSIFICATION: "+roomclass[0]);               
                System.out.print("\nRECREATIONAL FEE: "+recrefee[0]);               
                System.out.print("\nNO. OF DAYS RENTED: ");
                days = scan.nextInt();               
                bill = days * rate[0];
                totalbill = bill + recrefee[0];
            }
            else if (code == 2){
                System.out.print("CLASSIFICATION: "+roomclass[1]);               
                System.out.print("\nRECREATIONAL FEE: "+recrefee[1]);               
                System.out.print("\nNO. OF DAYS RENTED: ");
                days = scan.nextInt();            
                bill = days * rate[1];
                totalbill = bill + recrefee[1];
            }
            else if (code == 3){
                System.out.print("CLASSIFICATION: "+roomclass[2]);
                System.out.print("\nRECREATIONAL FEE: "+recrefee[2]);
                System.out.print("\nNO. OF DAYS RENTED: ");
                days = scan.nextInt();
                bill = days * rate[2];
                totalbill = bill + recrefee[2];               
            }
            else {
                System.out.print("\nInvalid Input!\n");
            }
                      
            System.out.print("TOTAL BILL: "+totalbill);
            grandtotal = grandtotal + totalbill;
        
            System.out.print("\n\nPROCESS ANOTHER? (Y/N): ");
            answer = scan.next();
            
            System.out.print("\n");
        
        }
        while (answer.equalsIgnoreCase("Y"));{
        System.out.print("GRAND TOTAL BILL: "+grandtotal+"\n");
        
        }
        
    }
    
}
