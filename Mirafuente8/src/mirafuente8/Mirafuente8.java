package mirafuente8;
import java.util.Scanner;

public class Mirafuente8 {

    public static void main(String[] args) {
        int marital_Code, emp_Num;
        String emp_Name;
        double b_Pay, all, ot_Pay, sss, pg_Ibig, with_Tax, g_Pay, t_Ded, n_Pay;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("EMPLOYEE NUMBER: ");
        emp_Num = scan.nextInt();
        
        scan.nextLine();
        System.out.print("EMPLOYEE NAME: ");
        emp_Name = scan.next();
        
        scan.nextLine();
        System.out.print("MARITAL STATUS CODE: ");
        marital_Code = scan.nextInt();
        
        if (marital_Code == 1){
        System.out.println("MARITAL STATUS: SINGLE");
                }
        else if (marital_Code == 2){
        System.out.println("MARITAL STATUS: MARRIED");
        }
        
        else if (marital_Code == 3){
        System.out.println("MARITAL STATUS: WIDOW");
        }
        
        else {
            System.out.println("INVALID INPUT");
        }
        
        System.out.print("BASIC PAY: ");
        b_Pay = scan.nextDouble();
        
        System.out.print("ALLOWANCE: ");
        all = scan.nextDouble();
        
        System.out.print("OVERTIME PAY: ");
        ot_Pay = scan.nextDouble();
        
        sss = b_Pay * 0.03;
        pg_Ibig = b_Pay * 0.02;
        with_Tax = b_Pay * 0.10;
        
        System.out.println("SSS: "+sss);
        System.out.println("PAG-IBIG: "+pg_Ibig);
        System.out.println("WITHHOLDING TAX: "+with_Tax);
        
        g_Pay = b_Pay + ot_Pay + all;
        t_Ded = sss + pg_Ibig + with_Tax;
        n_Pay = g_Pay - t_Ded;
        
        System.out.println("GROSS PAY: "+g_Pay);
        System.out.println("TOTAL DEDUCTION: "+t_Ded);
        System.out.println("NET PAY: "+n_Pay);
    }
    
}
