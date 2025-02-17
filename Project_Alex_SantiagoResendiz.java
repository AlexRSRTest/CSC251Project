import java.util.Scanner;
import java.lang.*;

public static void main(String[] args)
{
   Scanner scanner = new Scanner(System.in);
   
   System.out.print("Please enter the Policy Number: ");
   String policyNumber = scanner.nextLine();
   scanner.nextLine();
   
   System.out.print("Please enter the Provider Name: ");
   String providerName = scanner.nextLine();
   
   System.out.print("Please enter the Policyholder's First Name: ");
   String firstName = scanner.nextLine();
   
   System.out.print("Please enter the Policyholder's Last Name: ");
   String lastName = scanner.nextLine();
   
   System.out.print("Please enter the Policyholder's Age: ");
   int age = scanner.nextInt();
   scanner.nextLine();
   
   System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
   String smokingStatus = scanner.nextLine();
   
   System.out.print("Please enter the Policyholder's Height(in inches): ");
   double height = scanner.nextDouble();
   scanner.nextLine();
   
   System.out.print("Please enter the Policyholder's Weight (in pounds): ");
   double weight = scanner.nextDouble();
   
   Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
   
   System.out.println("Policy Number: " + policy.getPolicyNumber());
   System.out.println("Provider Name: " + policy.getProviderName());
   System.out.println("Provider's First Name: " + policy.getFirstName());
   System.out.println("Provider's Last Name: " + policy.getLastName());
}