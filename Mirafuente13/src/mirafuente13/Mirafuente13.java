package mirafuente13;
import java.util.Scanner;

public class Mirafuente13 {
    //Mark Rayden C. Mirafuente DICT 2-4//
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double weight_pound, weight_kg, height_ft, height_inch, height_incft, height_meter, bmi = 0.0;
        
        System.out.print("Enter your weight in pounds: ");
        weight_pound = scan.nextDouble();
        
        System.out.print("Enter your height in feet followed \n" +
"by a space then additional inches: ");
        height_ft = scan.nextDouble();
        height_inch = scan.nextDouble();
        
        height_incft = height_ft * 12;
        height_meter = (height_inch + height_incft) * 0.0254;
        
        weight_kg = weight_pound / 2.2;
        
        bmi = weight_kg / (height_meter * height_meter);
                               
        if (bmi < 18.5){
            System.out.print("Your BMI is "+bmi);
            System.out.print("\nYour risk catergory is Underweight.");
        }
        
        else if (bmi < 25){
            System.out.print("Your BMI is "+bmi);
            System.out.print("\nYour risk category is Normal weight.");
        }
        
        else if(bmi < 30){
            System.out.print("Your BMI is "+bmi);
            System.out.print("\nYour risk category is Overweight.");
        }   
        
        else if (bmi >= 30){
            System.out.print("Your BMI is "+bmi);
            System.out.print("\nYour risk category is Obese.");
        }    
    }  
}

