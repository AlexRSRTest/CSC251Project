/**
   Step 1: Already completed with the implementations of adding
   documentation comments using @param & @return.
*/
/**
   Branch Project-3, moved all the fields and methods into the PolicyHolder Class
*/
public class Policy
{
   private String policyNumber;
   private String providerName;
   private PolicyHolder policyH;
   
   private static int numPolicies = 0;
   
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      policyH = new PolicyHolder();
      numPolicies++;
   }
   
   public Policy(String policyNumber, String providerName, PolicyHolder policyH)
   {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.policyH = new PolicyHolder(policyH);
      numPolicies++;
   }
   
   public void setPolicyNum(String policyNumber)
   {
      this.policyNumber = policyNumber;
   }
   
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }
   
   public void setPolicyHolder(PolicyHolder policyH)
   {
      this.policyH = new PolicyHolder(policyH);
   }
   
   
   public String getPolicyNum()
   {
      return policyNumber;
   }
   
   public String getProviderName()
   {
      return providerName;
   }
   
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(policyH);
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
      
      if (policyH.getAge() > MIN_AGE)
      {
         additionalFee += ageFee;
      }
      
      if (policyH.getSmoke().equals("smoker"))
      {
         additionalFee += smokeFee;
      }
      
      if (policyH.calculateBMI() > MIN_BMI)
      {
         additionalFee += (policyH.calculateBMI() - 35) * 20;
      }
      
      return additionalFee;
   }
   
   public String toString()
   {
      String str = String.format("Policy Number: " + policyNumber +
                                 "Provider Name: " + providerName +
                                 "\n" + policyH + "\nPolicy Price: $%,.2f", insurancePrice());
      
      return str;
   }
}