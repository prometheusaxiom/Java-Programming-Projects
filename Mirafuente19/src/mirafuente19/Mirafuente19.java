package mirafuente19;
/* MIRAFUENTE, Mark Rayden C. DICT 2-4*/
import java.util.Scanner;

public class Mirafuente19 {
    public static void main(String[] args) {
        
        double sales, salary, totalsal = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("ENTER SALES IN DOLLAR (-1 TO END): ");
        sales = scan.nextInt();
        
        salary = 200 + (sales * 0.09);
        while(sales!=-1){
            System.out.format("SALARY: $%.2f", salary);
            
            System.out.print("\n\nENTER SALES IN DOLLAR (-1 TO END): ");
            sales = scan.nextInt();
            
            totalsal = totalsal + salary;
        }
        
        System.out.format("\nTHE TOTAL SALARY FOR THE WEEK: $%.2f \nGOOD DAY! THANK YOU FOR USING THE SYSTEM!", totalsal);
    }
    
}
