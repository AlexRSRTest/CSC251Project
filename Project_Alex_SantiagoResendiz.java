/**
   This Demo class will demonstrate the Policy class by asking the user
   the necessary information to complete the BMI and to calculate the
   insurance price.
*/

import java.util.Scanner;

public class Project_Alex_SantiagoResendiz
{
   public static void main(String[] args)
   {  
      // Create an instance of the Scanner class.
      Scanner keyboard = new Scanner(System.in);
      
      // Create an instance of the Policy class.
      Policy userPolicy = new Policy();
      
      // Call the setInfo method, to input the information.
      setInfo(keyboard, userPolicy);
      
      // Call the getInfo method, to display the information.
      getInfo(userPolicy);
   }
   
   /**
      setInfo will store all the infomation provide from the user into the
      policy's class reference variable for future use.
      @param input The reference variable to the Scanner class.
      @param policy The reference variable to the Policy class.
   */
   public static void setInfo(Scanner input, Policy policy)
   {
      // Temp Variables to hold the values
      int tempNum = 0, tempAge = 0;
      String provider = "", fName = "", lName = "", smokeStatus = "";
      double tempHeight = 0.0, tempWeight = 0.0;
      
      // Since, the information was passed during the Policy class instantiation
      // The program will call the policy class mutator methods to store the values from the variables.
      System.out.print("Please enter the Policy Number: ");
      tempNum = input.nextInt();
      policy.setPolicyNum(tempNum);
      
      input.nextLine();
      
      System.out.print("Please enter the Provider Name: ");
      provider = input.nextLine();
      policy.setProvider(provider);
      System.out.print("Please enter the Policyholder's First Name: ");
      fName = input.nextLine();
      policy.setFirstName(fName);
      System.out.print("Please enter the Policyholder's Last Name: ");
      lName = input.nextLine();
      policy.setLastName(lName);
      
      
      System.out.print("Please enter the Policyholder's Age: ");
      tempAge = input.nextInt();
      policy.setAge(tempAge);
      
      input.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokeStatus = input.nextLine();
      policy.setSmoke(smokeStatus);
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      tempHeight = input.nextDouble();
      policy.setHeight(tempHeight);
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      tempWeight = input.nextDouble();
      policy.setWeight(tempWeight);
   }
   
   /**
      The getInfo method will display the user's their own inputs,
      as well as the calculations to thier BMI and Policy price.
   */
   public static void getInfo(Policy user)
   {
      // Display the user's input.
      System.out.println("\n\nPolicy Number: " + user.getPolicyNum());
      System.out.println("Provider Name: " + user.getProvider());
      System.out.println("Policyholder's First Name: " + user.getFirstName());
      System.out.println("Policyholder's Last Name: " + user.getLastName());
      System.out.println("Policyholder's Age: " + user.getAge());
      System.out.println("Policyholder's Smoking Status: " + user.getSmoke());
      System.out.printf("Policyholder's Height: %,.1f inches\n", user.getHeight());
      System.out.printf("Policyholder's Weight: %,.1f pounds\n", user.getWeight());
      System.out.printf("Policyholder's BMI: %,.2f\n", user.calculateBMI());
      System.out.printf("Policy Price: $%,.2f\n", user.insurancePrice());
   }
}