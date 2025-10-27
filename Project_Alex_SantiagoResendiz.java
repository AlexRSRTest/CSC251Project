/**
   This Demo class will demonstrate the Policy class by asking the user
   the necessary information to complete the BMI and to calculate the
   insurance price.
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class Project_Alex_SantiagoResendiz
{
   public static void main(String[] args) throws IOException
   {  
      // Create an instance of the Scanner class.
      Scanner keyboard = new Scanner(System.in);
      
      // Create an ArrayList to hold Policy objects.
      ArrayList<Policy> list = new ArrayList<Policy>();
      
      // Call the setInfo method, to input the information from the txt file to ArrayList.
      setInfo(list);
      
      // The ArrayList will be passed to display every instance of the policy object's user info.
      getInfo(list);
   }
   
   /**
      setInfo will store all the infomation provide from the Text file into the
      policy's ArrayList by adding it as a new instance in memory.
      @param list The reference variable to the ArrayList that can store Policy objects.
   */
   public static void setInfo(ArrayList<Policy> list) throws IOException
   {
      // Temp Variables to hold the values
      int tempNum = 0, tempAge = 0;
      String provider = "", fName = "", lName = "", smokeStatus = "";
      double tempHeight = 0.0, tempWeight = 0.0;
      
      // Create a try-with-resources statement to automatically close the file object.
      try (Scanner inputFile = new Scanner(new File("PolicyInformation.txt")))
      {
         // This while statement will continue until there isn't any text in the Text file.
         while (inputFile.hasNext()) {
            tempNum = inputFile.nextInt();
            // Clear the buffer
            inputFile.nextLine();
            provider = inputFile.nextLine();
            fName = inputFile.nextLine();
            lName = inputFile.nextLine();
            tempAge = inputFile.nextInt();
            // Create the buffer
            inputFile.nextLine();
            smokeStatus = inputFile.nextLine();
            tempHeight = inputFile.nextDouble();
            tempWeight = inputFile.nextDouble();
            
            // Knowing that theres already a two line seperation between each user's
            // information, allow inputFile reference variable to skip over lines to the next user.
            if (inputFile.hasNext()) {
               inputFile.nextLine();
            }
            if (inputFile.hasNext()) {
               inputFile.nextLine();
            }
            
            // Finally for each individual user, they'll be added separately into the list ArrayList
            // That will stored in memory as a Policy object. Additionally, every information gathered
            // will be included into the instance.
            list.add(new Policy(tempNum, provider, fName, lName, tempAge, smokeStatus, tempHeight, tempWeight));
         }
      }
   }
   
   /**
      The getInfo method will display the user's their own inputs,
      as well as the calculations to thier BMI and Policy price.
   */
   public static void getInfo(ArrayList<Policy> list)
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