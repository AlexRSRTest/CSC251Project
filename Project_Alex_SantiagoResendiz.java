import java.util.Scanner;
import java.lang.*;

public class Project_Alex_SantiagoResendiz
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
   
      System.out.print("Please enter the Policy Number: ");
      String policyNumber1 = scanner.nextLine();
   
      System.out.print("Please enter the Provider Name: ");
      String providerName1 = scanner.nextLine();
   
      System.out.print("Please enter the Policyholder's First Name: ");
      String firstName1 = scanner.nextLine();
   
      System.out.print("Please enter the Policyholder's Last Name: ");
      String lastName1 = scanner.nextLine();
   
      System.out.print("Please enter the Policyholder's Age: ");
      int age1 = scanner.nextInt();
      scanner.nextLine();
   
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      String smokingStatus1 = scanner.nextLine();
   
      System.out.print("Please enter the Policyholder's Height(in inches): ");
      double height1 = scanner.nextDouble();
      scanner.nextLine();
   
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      double weight1 = scanner.nextDouble();
   
      Policy policy = new Policy(policyNumber1, providerName1, firstName1, lastName1, age1, smokingStatus1, height1, weight1);
      
      System.out.println("");
      System.out.println("");
      System.out.println("Policy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: " + policy.getproviderName());
      System.out.println("Policyholder's First Name: " + policy.getFirstName());
      System.out.println("Policyholder's Last Name: " + policy.getlastName());
      System.out.println("Policyholder's Age: " + policy.getAge());
      System.out.println("Policyholder's Smoking Status: " + policy.getsmokingStatus());
      System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
      System.out.println("Policyholder's BMI: " + String.format("%.2f", policy.solveBMI()));
   
      double policyPrice = policy.totalPolicyPrice();
      System.out.println("Policy Price: $" + String.format("%.2f", policyPrice));
   }
}