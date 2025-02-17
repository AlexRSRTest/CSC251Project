/*
   The following class will become the model for an insurance policy
   for one person. Containing the following: Policy Number, Provider Name, First Name,
   Last Name, Age, Smoking Status, Height, and Weight.
*/

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
   public Policy(String policyNumber, String providerName, String firstName, String LastName, int age, String smokingStatus, double height, double weight)
   {
      policyNumber = policyNumber;
      providerName = providerName;
      firstName = firstName;
      lastName = lastName;
      smokingStatus = smokingStatus;
      age = age;
      height = height;
      weight = weight;
   }
   
   //The Getters and Setters for all of the fields
   //Getters
   public void setPolicyNumber(String policyNumber)
   {
      policyNumber = policyNumber;
   }
   
   public void setproviderName(String providerName)
   {
      providerName = providerName;
   }
   
   public void setfirstName(String firstName)
   {
      firstName = firstName;
   }
   
   public void setlastName(String lastName)
   {
      lastName = lastName;
   }
   
   public void setsmokingStatus(String smokingStatus)
   {
      smokingStatus = smokingStatus;
   }
   
   public void setAge(int age)
   {
      age = age;
   }
   
   public void setHeight(double height)
   {
      height = height;
   }
   
   public void setWeight(double weight)
   {
      weight = weight;
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
      
      if(smokingStatus.equals("smoker"))
      {
         policyPrice += 100;
      }
      
      double bmi = solveBMI();
      
      if(bmi > 35)
      {
         policyPrice += (bmi-35) * 20;
      }
      
      return policyPrice;
   }
}