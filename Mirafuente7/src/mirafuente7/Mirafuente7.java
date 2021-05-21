package mirafuente7;
import java.util.Scanner;

public class Mirafuente7 {
    public static void main(String[] args) {
        int item_Code;
        double old_Price, new_Price;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("ENTER THE ITEM CODE (1 THROUGH 3): ");
        item_Code = scan.nextInt();
        
        System.out.print("OLD PRICE: ");
        old_Price = scan.nextDouble();
        
        if (item_Code == 1){
            new_Price = (old_Price * 0.10) + old_Price;
            System.out.println("ITEM: WOMEN'S WEAR");
            System.out.println("NEW PRICE: " +new_Price);
        }  
        else if (item_Code == 2){
            new_Price = (old_Price * 0.20) + old_Price;
            System.out.println("ITEM: MEN'S WEAR");
            System.out.println("NEW PRICE: " +new_Price);
        }  
        else if (item_Code == 3){
            new_Price = old_Price - (old_Price * 0.10);
            System.out.println("ITEM: CHILDREN'S WEAR");
            System.out.println("NEW PRICE: " +new_Price);
        }
        else {
            System.out.println("ERROR");
        }  
    }   
}
