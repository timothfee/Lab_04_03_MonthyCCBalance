import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
    //Ask user for age, if user is 21 or older then display they get a wristband.
    Scanner in = new Scanner(System.in);
    int age = 0;

    System.out.print("Enter your age: ");
    age = in.nextInt();
    
    if (age >= 21) {
      System.out.println("You get a wrist band!");
    }
    
  }
}
