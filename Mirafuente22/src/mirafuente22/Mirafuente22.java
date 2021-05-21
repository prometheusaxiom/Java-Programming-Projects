package mirafuente22;
/* MIRAFUENTE, Mark Rayden C. DICT 2-4*/
import java.util.Scanner;

public class Mirafuente22 {
    public static void main(String[] args) {
       double midgrade, finalgrade, averagegrade = 0;;
       String studname, remark, decision = " ";
       int studno, totalprocessed = 0, totalfailed = 0, totalpassed = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("\t\tPUP INSTITUTE OF TECHNOLOGY\n\t\tPUREZA ST., STA.MESA, MANILA\n");
        
        do{
            System.out.print("\nSTUDENT NO: ");
            studno = scan.nextInt();
            
            System.out.print("STUDENT NAME: ");
            studname = scan.next();
            scan.nextLine();
            
            System.out.print("MIDTERM GRADE: ");
            midgrade = scan.nextDouble();
            
            System.out.print("FINAL GRADE: ");
            finalgrade = scan.nextDouble();
            
            averagegrade = (midgrade + finalgrade)/2;
            
            System.out.print("AVERAGE GRADE: "+averagegrade);
            
            if (averagegrade <= 3){
                System.out.print("\nREMARK: PASSED\n"); 
                totalpassed = totalpassed+1;
            }
            else if (averagegrade > 3){
                System.out.print("\nREMARK: FAILED\n"); 
                totalfailed = totalfailed+1;
            }
          System.out.print("\nPROCESS ANOTHER? (TYPE Y OR N): ");
            decision = scan.next();    
            
          totalprocessed = totalprocessed+1;   
        }
        while(decision.equalsIgnoreCase("Y"));{
         System.out.print("\nTOTAL NO. OF STUDENTS PASSED: "+totalpassed);
         System.out.print("\nTOTAL NO. OF STUDENTS FAILED: "+totalfailed);
         System.out.print("\nTOTAL NO. OF STUDENTS PROCESSED: \n"+totalprocessed);
        }
    }
    
}
