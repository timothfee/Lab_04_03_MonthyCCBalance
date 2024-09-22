public class Main {
   public static void main(String[] args) {

    double initialBalance = 11438.22;
    double interestRate = 0.17;
    double firstMonth = initialBalance * interestRate;
    double secondMonth = (initialBalance + firstMonth) * interestRate;

    System.out.println("Balance after 1 month: " + (initialBalance + firstMonth));
    System.out.println("Balance after 2 months: " + (initialBalance + firstMonth + secondMonth));
    
  }
}
