/*
   The following class will become the model for an insurance policy
   for one person. Containing the following: Policy Number, Provider Name, First Name,
   Last Name, Age, Smoking Status, Height, and Weight.
*/
import java.lang.*;
public class Policy
{
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private String smokingStatus;
   
   private int age;
   //Height specified in inches
   private double height;
   //Weght specified in lbs
   private double weight;
   

   //no-arg constructor
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      firstName = "";
      lastName = "";
      smokingStatus = "";
      age = 0;
      height = 0;
      weight = 0;
   }
   
   //Constructor that accepts arguments
   public Policy(String policyNumber1, String providerName1, String firstName1, String lastName1, int age1, String smokingStatus1, double height1, double weight1)
   {
      policyNumber = policyNumber1;
      providerName = providerName1;
      firstName = firstName1;
      lastName = lastName1;
      smokingStatus = smokingStatus1;
      age = age1;
      height = height1;
      weight = weight1;
   }
   
   //The Getters and Setters for all of the fields
   //Getters
   public void setPolicyNumber(String policyNumber1)
   {
      policyNumber = policyNumber1;
   }
   
   public void setproviderName(String providerName1)
   {
      providerName = providerName1;
   }
   
   public void setfirstName(String firstName1)
   {
      firstName = firstName1;
   }
   
   public void setlastName(String lastName1)
   {
      lastName = lastName1;
   }
   
   public void setsmokingStatus(String smokingStatus1)
   {
      smokingStatus = smokingStatus1;
   }
   
   public void setAge(int age1)
   {
      age = age1;
   }
   
   public void setHeight(double height1)
   {
      height = height1;
   }
   
   public void setWeight(double weight1)
   {
      weight = weight1;
   }
   
   
   //Getters
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   public String getproviderName()
   {
      return providerName;
   }
   
   public String getFirstName()
   {
      return firstName;
   }
   
   public String getlastName()
   {
      return lastName;
   }
   
   public String getsmokingStatus()
   {
      return smokingStatus;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public double getHeight()
   {
      return height;
   }
   
   public double getWeight()
   {
      return weight;
   }
   
   //The following method calculates and returns the BMI of the policyHolder.
   public double solveBMI()
   {
      return (double) (weight * 703) / (height * height);
   }
   
   //Insurance price calculation
   public double totalPolicyPrice()
   {
      double policyPrice = 600;
      
      if(age > 50)
      {
         policyPrice += 75;
      }
      
      if(smokingStatus.equalsIgnoreCase("smoker"))
      {
         policyPrice += 100;
      }
      else
      {
         policyPrice += 0;
      }
      
      double bmi = solveBMI();
      
      if(bmi > 35)
      {
         policyPrice += (bmi-35) * 20;
      }
      
      return policyPrice;
   }
}