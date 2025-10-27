/**
   Step 1: Already completed with the implementations of adding
   documentation comments using @param & @return.
*/
public class Policy
{
   // Fields
   private int policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smoke;
   private double height;
   private double weight;
   
   // No-arg Constructor
   public Policy()
   {
      policyNumber = 0;
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smoke = "";
      height = 0.0;
      weight = 0.0;
   }
   
   /**
      Arg Constructor
      @param num The policyNumber as an int.
      @param provider The providerName as a string.
      @param fName The user's name, string data type.
      @param lName The user's last name, string data type.
      @param a The user's age, int data type.
      @param s The smoking status, string data type.
      @param h The policy holder's height, double data type.
      @param w The policy holder's weight, double data type.
   */
   public Policy(int num, String provider, String fName, String lName, int a, String s, double h, double w)
   {
      policyNumber = num;
      providerName = provider;
      firstName = fName;
      lastName = lName;
      age = a;
      smoke = s;
      height = h;
      weight = w;
   }
   
   /**
      setPolicyNum A mutator/setter method to store the policy number.
      @param num THe policy number.
   */
   public void setPolicyNum(int num)
   {
      policyNumber = num;
   }
   
   /**
      setProvider A mutator/setter method to store the provider name.
      @param provider The providerName.
   */
   public void setProvider(String provider)
   {
      providerName = provider;
   }
   
   /**
      setFirstName A mutator/setter method to store the user's first name.
      @param fName The user's name.
   */
   public void setFirstName(String fName)
   {
      firstName = fName;
   }
   
   /**
      setLastName A mutator/setter method to store the user's last name.
      @param lName The user's last name.
   */
   public void setLastName(String lName)
   {
      lastName = lName;
   }
   
   /**
      setAge A mutator/setter method to store the age.
      @param a The user's age.
   */
   public void setAge(int a)
   {
      age = a;
   }
   
   /**
      setSmoke A mutator/setter method to store the smoking status.
      @param s The smoking status.
   */
   public void setSmoke(String s)
   {
      smoke = s;
   }
   
   /**
      setHeight A mutator/setter method to store the user's height.
      @param h The policy holder's height.
   */
   public void setHeight(double h)
   {
      height = h;
   }
   
   /**
      setWeight A mutator/setter method to store the user's weight.
      @param w The policy holder's weight.
   */
   public void setWeight(double w)
   {
      weight = w;
   }
   
   
   
   /**
      getPolicyNum An accessor/getter method.
      @return The policy number.
   */
   public int getPolicyNum()
   {
      return policyNumber;
   }
   
   /**
      getProvider An accessor/getter method
      @return The Provider's name.
   */
   public String getProvider()
   {
      return providerName;
   }
   
   /**
      getFirstName An accessor/getter method.
      @return The user's name.
   */
   public String getFirstName()
   {
      return firstName;
   }
   
   /**
      getLastName An accessor/getter method.
      @return The user's last name.
   */
   public String getLastName()
   {
      return lastName;
   }
   
   /**
      getAge An accessor/getter method.
      @return The user's age.
   */
   public int getAge()
   {
      return age;
   }
   
   /**
      getSmoke An accessor/getter method.
      @return The user's smoking status
   */
   public String getSmoke()
   {
      return smoke;
   }
   
   /**
      getHeight An accessor/getter method.
      @return The user's height
   */
   public double getHeight()
   {
      return height;
   }
   
   /**
      getWeight An accessor/getter method.
      @return The user's weight
   */
   public double getWeight()
   {
      return weight;
   }
   
   /**
      calculateBMI method will calculate the user's BMI base on weight, height and constant.
      @return the user's BMI. 
   */
   public double calculateBMI()
   {
      return (weight * 703) / (height * height);
   }
   
   /**
      insurancePrice method will calculate the total fees for the insurance policy
      @return The total fees based on the information provided.
   */
   public double insurancePrice()
   {
      double additionalFee = 0;
      final int MIN_AGE = 50;
      final int MIN_BMI = 35;
      
      final double ageFee = 75.0;
      final double smokeFee = 100.0;
      final double BASE_FEE = 600.0;
      
      additionalFee += BASE_FEE;
      
      if (age > MIN_AGE)
      {
         additionalFee += ageFee;
      }
      
      if (smoke.equals("smoker"))
      {
         additionalFee += smokeFee;
      }
      
      if (calculateBMI() > MIN_BMI)
      {
         additionalFee += (calculateBMI() - 35) * 20;
      }
      
      return additionalFee;
   }
}