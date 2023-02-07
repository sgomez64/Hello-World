import java.util.Scanner;
public class Project_Maryain_Gomez {
   
   
   public static void main (String[] args) {
   Scanner input = new Scanner(System.in);
   
      System.out.println("Please enter the Policy Number): ");
      int policyNumber = input.nextInt();
      System.out.println("Please enter the provider name: ");
      String providerName = input.nextLine();
      
      
      
      System.out.println("Please enter the Policyholder's Last Name: ");
      String lastName = input.nextLine();
      System.out.println("Please enter the Policyholder's age ");
      int age = input.nextInt();
      System.out.println("Please enter the Policyholder's Smoking Status(Smoker/Non-Smoker): ");
      String smokingStatus = input.nextLine();
      System.out.println("Please enter the Policyholder's Height(in inches: ");
      double height = input.nextDouble();
      System.out.println("Please enter the Policyholder's weight(in pounds): ");
      double weight = input.nextDouble();
      
      
      double holderBMI = getBMI(height, weight);
      double policyPrice = getPolicyPrice(holderBMI, age, smokingStatus);
      displayPolicyInfo(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight, holderBMI, policyPrice);
      
      
      
   }
   
   public static double getBMI(double height, double weight) {
      
      double holderBMI = (weight * 703) / (height * height);
      
      return holderBMI;
   
      
   
   }
   
   public static double getPolicyPrice(double holderBMI, int age, String smokingStatus) {
      
      double policyPrice = 600.00;
      
      if (age > 50) {
      
         policyPrice = policyPrice + 75;
      }
      if (smokingStatus == "Smoker") {
      
         policyPrice = policyPrice + 100;
      }
      
      if (holderBMI > 35) {
      
         policyPrice = 20 * (holderBMI - 35) + policyPrice;
      }
      
      return policyPrice;
   
      
   
   }

   public static void displayPolicyInfo(int policyNumber, String providerName, String firstName, String lastName, int age, String smokingStatus, double height, double weight, double holderBMI, double policyPrice) {
      
      //Formatting and converting the balance and fee into an easily readable monetary string
      String formattedAccountBalance = String.format("%,.2f", holderBMI);
      String formattedMonthlyFee = String.format("%,.2f", policyPrice);
      System.out.println("Policy Number: " + policyNumber);
      System.out.println("Provider Name: " + providerName);
      System.out.println("Policyholder's First Name: " + firstName);
      System.out.println("Policyholder's Last Name: $" + lastName);
      System.out.println("Policyholder's Age: $" + age);
      System.out.println("Policyholder's smoking status: " +smokingStatus);
      System.out.println("Policyholder's height: " + height);
      System.out.println("Policyholder's weight: " + weight);
      System.out.println("Policyholder's BMI: " + holderBMI);
      System.out.println("Policy Price: $" + policyPrice);

   }   
}
