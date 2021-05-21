package mirafuente25;
import java.util.*;
/* MIRAFUENTE, Mark Rayden C. DICT 2-4*/

public class Mirafuente25 {
    public static void main(String[] args) {
        int studno, processed = 0;
        String studname, subject, decision = " ";
        double midgrade, finalgrade, genave = 0;
        double[] equivgrade = new double[]{1.00, 1.25, 1.50, 1.75, 2.00, 2.25, 2.50, 2.75, 3.00, 5.00};
        String[] remarks = new String[]{"Excellent", "Very Good", "Good", "Satisfactory", "Fair", "Passed", "Failed"};
        
        Scanner scan = new Scanner(System.in);
        do{
            System.out.print("\n\t\tSTUDENT GRADE CALCULATOR\n");
        
            System.out.print("\nSTUDENT NO.: ");
            studno = scan.nextInt();
            
            System.out.print("STUDENT NAME: ");
            studname = scan.next();
            scan.nextLine();
            
            System.out.print("SUBJECT: ");
            subject = scan.next();
            scan.nextLine();
            
            System.out.print("MIDTERM GRADE: ");
            midgrade = scan.nextDouble();
            
            System.out.print("FINAL GRADE: ");
            finalgrade = scan.nextDouble();
            
            genave = (midgrade + finalgrade)/2;
            
            if ((genave <= 100)&&(genave >= 97)){
                System.out.print("\nTHE GENERAL AVERAGE IS: "+genave);
                System.out.print("\nEQUIVALENT: "+equivgrade[0]);
                System.out.print("\nREMARK: "+remarks[0]);
            }
            else if ((genave <= 96)&&(genave >= 94)){
                System.out.print("\nTHE GENERAL AVERAGE IS: "+genave);
                System.out.print("\nEQUIVALENT: "+equivgrade[1]);
                System.out.print("\nREMARK: "+remarks[0]);
            }
            else if ((genave <= 93)&&(genave >= 91)){
                System.out.print("\nTHE GENERAL AVERAGE IS: "+genave);
                System.out.print("\nEQUIVALENT: "+equivgrade[2]);
                System.out.print("\nREMARK: "+remarks[1]);
            }
            else if ((genave <= 90)&&(genave >= 88)){
                System.out.print("\nTHE GENERAL AVERAGE IS: "+genave);
                System.out.print("\nEQUIVALENT: "+equivgrade[3]);
                System.out.print("\nREMARK: "+remarks[1]);
            }
            else if ((genave <= 87)&&(genave >= 85)){
                System.out.print("\nTHE GENERAL AVERAGE IS: "+genave);
                System.out.print("\nEQUIVALENT: "+equivgrade[4]);
                System.out.print("\nREMARK: "+remarks[2]);
            }
            else if((genave <= 84)&&(genave >= 82)){
                System.out.print("\nTHE GENERAL AVERAGE IS: "+genave);
                System.out.print("\nEQUIVALENT: "+equivgrade[5]);
                System.out.print("\nREMARK: "+remarks[2]);
            }
            else if((genave <= 81)&&(genave >= 79)){
                System.out.print("\nTHE GENERAL AVERAGE IS: "+genave);
                System.out.print("\nEQUIVALENT: "+equivgrade[6]);
                System.out.print("\nREMARK: "+remarks[3]);
            }
            else if((genave <= 78)&&(genave >= 76)){
                System.out.print("\nTHE GENERAL AVERAGE IS: "+genave);
                System.out.print("\nEQUIVALENT: "+equivgrade[7]);
                System.out.print("\nREMARK: "+remarks[4]);
            }
            else if(genave == 75){
                System.out.print("\nTHE GENERAL AVERAGE IS: "+genave);
                System.out.print("\nEQUIVALENT: "+equivgrade[8]);
                System.out.print("\nREMARK: "+remarks[5]);
            }
            else if(genave <= 74.9){
                 System.out.print("\nTHE GENERAL AVERAGE IS: "+genave);
                System.out.print("\nEQUIVALENT: "+equivgrade[9]);
                System.out.print("\nREMARK: "+remarks[6]);
            }
            else {
                System.out.println("\nInvalid Input");
            }
            
            System.out.print("\n\nDO YOU WANT TO CONTINUE?(Y/N) ");
            decision = scan.next();
            
            processed++;
            
        }   
        while(decision.equalsIgnoreCase("Y"));{
            System.out.print("\nTOTAL NUMBER OF STUDENTS PROCESSED: "+processed+"\n");
        }
    }
}
    
