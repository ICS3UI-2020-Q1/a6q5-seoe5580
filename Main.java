import java.util.Scanner;
/**
 * This program detects ascending orders of 2 numbers that user input
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates a scanner for user input
    Scanner input = new Scanner(System.in);

     // Asks the user to input 2 integers
    System.out.println("Please enter the 2 values for the array");

    // sets up array
    int[] num = new int[2];

    // gets the two numbers from the user using the for loop
    for(int i = 0; i < num.length; i++){
      num[i] = input.nextInt();
    }

    // sets up a variable for future product
    int num1 = num[0];
    int num2 = num[1];

    // using if else statements tells the user the answer
    if(num[0] < num[1]){
      System.out.println("Your numbers in ascending order are " + num1 + " and " + num2);
    }else{
      System.out.println("Your numbers in ascending order are " + num2 + " and " + num1);
    }
  }
}
