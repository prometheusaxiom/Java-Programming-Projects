package mirafuente17;
import java.util.Scanner;
/* MIRAFUENTE, Mark Rayden C. DICT 2-4*/

public class Mirafuente17 {
    public static void main(String[] args) {
        
        int num_1, num_2, num_3, num_4, num_5 , sum;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 5 numbers: ");
        num_1 = scan.nextInt();
        num_2 = scan.nextInt();
        num_3 = scan.nextInt();
        num_4 = scan.nextInt();
        num_5 = scan.nextInt();     
        
        sum = num_1 + num_2 + num_3 + num_4 + num_5;
        
        System.out.println("The sum is "+sum);
        
        
    }
    
}
