package mirafuente9;
import java.util.Scanner;

public class Mirafuente9 {

    public static void main(String[] args) {
        int p_Num, doc_Fee, misc_Fee, r_Code, total_Bill;
        String p_Name;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("PATIENT NO.: ");
        p_Num = scan.nextInt();
        
        System.out.print("PATIENT NAME: ");
        p_Name = scan.next();
        scan.nextLine();
        
        System.out.print("DOCTOR'S FEE: ");
        doc_Fee = scan.nextInt();
        
        System.out.print("MISCELLANEOUS FEE: ");
        misc_Fee = scan.nextInt();
        
        System.out.print("ROOM CODE: ");
        r_Code = scan.nextInt();
        
        if (r_Code == 1){
            System.out.println("ROOM: WARD"); 
        }
        else if (r_Code == 2){
            System.out.println("ROOM: SEMI-WARD");
        }
        else if (r_Code == 3){
            System.out.println("ROOM: PRIVATE");
        }
        else if (r_Code == 4){
            System.out.println("ROOM: OUT-PATIENT");
        }
        else {
            System.out.println("ROOM: INVALID INPUT");
        }
        
        total_Bill = doc_Fee + misc_Fee;
        
        System.out.println("TOTAL BILL: "+total_Bill);
        
    }
    
}
