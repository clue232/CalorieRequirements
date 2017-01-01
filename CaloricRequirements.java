/* 
 * @(#)CaloricRequirements
 * @author Matt Boyd
 * Version 1.00 2017/01/01 9:30am
 * 
 * PROGRAM PURPOSE: Create a program that uses the Harris--Benedict formula to determine 
 * your daily caloric requirements AND then breaks it down into your macro needs
 */

import java.util.Scanner; // import scanner class for data imput 

public class CaloricRequirements
  
{
  public static void main(String[]args)
  {
    String name = ""; // user name
    char gender = 'm'; // if you're a male
    double height = 0.0; // how tall you are 
    double weight = 0.0; // how much you weigh 
    double exerciseLvl = 0.0; // how active you are
    double age = 0.0; //what is your age
    double bmr = 0.0; // MALE Basal Metabolic Rate (resting calorie burn rate) 
    double dailyCals = 0.0; // daily calories 
    
    
    Scanner input = new Scanner(System.in); //Read input from keyboard
    
    // greeting, get name
    System.out.printf("%n%nWelcome! Lets figure out your daily caloric requirements!%n%nWhat is your name? "); 
    name = input.nextLine();
    name = name.trim();
    
    
    //get gender -----defaulting to male until I can figure this out 
    
    //System.out.printf("Thank you %s, what is your gender? %n%nPlease enter 'M' for Male or 'F' for Female", name); 
    //if (gender = input.next().charAt(0));
    
    
    System.out.printf("%n%s, You've selected Male!", name);  
    
    System.out.printf("%n%nWhat is your age? ");
    age = input.nextInt(); 
    
    System.out.printf("How much do you weigh in pounds? ");
    weight = input.nextInt();
    
    System.out.printf("How tall are you in inches? ");
    height = input.nextInt();
    
    System.out.printf("%s%n%s", "How many days a week will you be working out?" ,
                        "Enter 8 if more workouts than days in week (2x's a day/5 days a week ect) "); 
    exerciseLvl = input.nextInt(); 
    
    //MALE Formula for calculating Basal Metabolic Rate
    bmr=  66 + (6.23* weight) + (12.7 * height) - (6.8 * age);
    
    //FEMALE Formula for calculating Basal Metabolic Rate
    //fbmr = 655 + (4.35 * weight) + (4.7 * height ) - (4.7 * age);
    
    if (exerciseLvl <= 1 ) 
    { 
      dailyCals= bmr * 1.2; 
      
    } // end if =< 1) 
    
    else if (exerciseLvl <=3)
    {
      dailyCals= bmr * 1.375; 
    }// end if <=3
    
    else if (exerciseLvl <=5)
    {
      dailyCals = bmr * 1.55;
      
    } // end if <=5
    
    else if (exerciseLvl <=6)
    {
      dailyCals = bmr * 1.725;
    } // end if <=6
    
    else if (exerciseLvl <=8)
    {
       dailyCals = bmr * 1.9;
    } // end if <=8 
    
    System.out.printf("%s's daily caloric intake should be %s. %n%s's bmr is %s", name, dailyCals, name, bmr); 
    
    
    
  } // End main 
} // End application class 
