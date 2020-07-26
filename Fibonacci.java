
/* 
The purpose of this program is to prompt the user for an integer n and then prints
the first n Fibonacci numbers.
*/
// This line of code imports the classes in java under the util name
import java.util.*;

// This line is my class entitled Fibonacci
public class Fibonacci {
  // This is my main method
  public static void main(String[] args) {
    // Asking the user for the amount of Fibonacci number he or she wants
    System.out.print("Please enter the number of Fibonacci numbers you want: ");
    // using the Scanner class to detect input from the keyboard
    Scanner console = new Scanner(System.in);
    // storing input from the keyboard in integer variable called nacci
    int nacci = console.nextInt();
    // for loop that prints out the appropriate number of Fabonicci numbers in the
    // appropriate format
    for (int i = 1; i <= nacci; i++) {
      System.out.printf("%d\n", sequence(i));
    }
  }

  /*
   * static method called sequence uses an integer number as a parameter; does the
   * process of computing the correct Fibonacci sequence and returns that output
   */
  public static int sequence(int number) {
    int one = 1;
    int zero = 0;
    int both;
    for (int i = 2; i <= number; i++) {
      both = one;
      one = zero;
      zero = both + one;
    }
    return zero;
  }
}
