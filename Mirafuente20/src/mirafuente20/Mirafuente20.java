package mirafuente20;
/* MIRAFUENTE, Mark Rayden C. DICT 2-4*/
import java.util.Scanner;

public class Mirafuente20 {
    public static void main(String[] args) {
        
        int hourswork, excesshours;
        double rate, salary = 0, totalsal = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("ENTER HOURS WORKED (-1 TO END): ");
        hourswork = scan.nextInt();

        while (hourswork != -1){
            
        System.out.print("ENTER HOURLY RATE OF THE WORKER ($00.00): ");
        rate = scan.nextDouble();
        
        excesshours = hourswork - 40;
            
            if(excesshours > 0){
                salary = (hourswork * rate) + excesshours * (rate/2);
            }
            else if(excesshours <= 0){
                salary = hourswork * rate;     
            } 
       
        System.out.format("THE SALARY IS: $%.2f",  salary);
        
        totalsal = totalsal + salary;
        
        System.out.print("\n\nENTER HOURS WORKED (-1 TO END): ");
        hourswork = scan.nextInt();
        }
         
       System.out.format("\nTHE TOTAL SALARY OF ALL EMPLOYEES: $%.2f \nTHANK YOU FOR USING THE SYSTEM.", totalsal);
          
    }
    
}
