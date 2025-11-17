public class PolicyHolder
{
   // Fields
   private String firstName;
   private String lastName;
   private int age;
   private String smoke;
   private double height;
   private double weight;
   
   // No-arg Constructor
   public PolicyHolder()
   {
      firstName = "";
      lastName = "";
      age = 0;
      smoke = "";
      height = 0.0;
      weight = 0.0;
   }
   
   /**
      Arg Constructor
      @param fName The user's name, string data type.
      @param lName The user's last name, string data type.
      @param a The user's age, int data type.
      @param s The smoking status, string data type.
      @param h The policy holder's height, double data type.
      @param w The policy holder's weight, double data type.
   */
   public PolicyHolder(String fName, String lName, int a, String s, double h, double w)
   {
      firstName = fName;
      lastName = lName;
      age = a;
      smoke = s;
      height = h;
      weight = w;
   }
   
   public PolicyHolder(PolicyHolder obj2)
   {
      this.firstName = obj2.getFirstName();
      this.lastName = obj2.getLastName();
      this.age = obj2.getAge();
      this.smoke = obj2.getSmoke();
      this.height = obj2.getHeight();
      this.weight = obj2.getWeight();
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
   
   public String toString()
   {
      String str = String.format("Policyholder's First Name: %s\n" +
                                 "Policyholder's Last Name: %s\n" +
                                 "Policyhilder's Age: %d\n" +
                                 "Policyholder's Smoking Status (Y/N): %s\n" +
                                 "Policyholder's Height: %,.1f inches\n" +
                                 "Policyholder's Weight: %,.1f pounds\n" +
                                 "Policyholder's BMI: %,.2f\n"
                                 , firstName, lastName, age, smoke, height, weight, calculateBMI()); 
      return str;
   }
}