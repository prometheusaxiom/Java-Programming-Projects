package mirafuente12;
import java.util.Scanner;
public class Mirafuente12 {
    
    //Mark Rayden C. Mirafuente DICT 2-4//
    public static void main(String[] args) {
      String name;
      int age, life_style;
      char gender;
      double weight, height, new_bmr, bmr = 0;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("ENTER YOUR NAME : ");
      name = scan.next();
      
      System.out.print("ENTER YOUR AGE : ");
      age = scan.nextInt();
      
      System.out.print("ENTER YOUR WEIGHT(in pounds) : ");
      weight = scan.nextDouble();
      
      System.out.print("ENTER YOUR HEIGHT(in inches) : ");
      height = scan.nextDouble();
      
      System.out.print("ENTER YOUR GENDER(M/F) : ");
      gender = scan.next().charAt(0);
      
      if ((gender == 'm')||(gender == 'M')){
      bmr = 660 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
      System.out.print("YOUR BMR IS : "+bmr+"\n");
      
      }
      else if((gender == 'f')||(gender == 'F')){
      bmr = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
      System.out.print("YOUR BMR IS : "+bmr+"\n");
      }
      
      else {
          System.out.print("Incorrect input!");
      }
      System.out.println("\nENTER YOUR LIFESTYLE :\n" +
              "1. SEDENTARY (SOMEWHAT INACTIVE)\n" +
              "2. SOMEWHAT ACTIVE (EXERCISE OCCASIONALLY)\n" +
              "3. ACTIVE (EXERCISE 3-4 DAYS A  WEEK)\n" +
              "4. HIGHLY ACTIVE (EXERCISE EVERYDAY)\n");
      
      
      System.out.print("\nENTER YOUR LIFESTYLE : ");
      life_style = scan.nextInt();
      
      if (life_style == 1){
      new_bmr = (bmr * 0.20) + bmr;
      System.out.print("YOUR NEW BMR IS : "+new_bmr);
      }
      
      else if (life_style == 2){
      new_bmr = (bmr * 0.30) + bmr;
      System.out.print("YOUR NEW BMR IS : "+new_bmr);   
      }
      
      else if (life_style == 3){
      new_bmr = (bmr * 0.40) + bmr;
      System.out.print("YOUR NEW BMR IS : "+new_bmr);
      }
      
      else if (life_style == 4){
      new_bmr = (bmr * 0.50) + bmr;
      System.out.print("YOUR NEW BMR IS : "+new_bmr);
      }
      
      else {
          System.out.print("Incorrect input!");
      }
   }  
}
