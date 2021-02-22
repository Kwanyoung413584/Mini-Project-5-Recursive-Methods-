// Imports
import java.util.Scanner;

// Main Class
class Main {

  // Main Method
  public static void main(String[] args) {

    Scanner Scanner = new Scanner(System.in);
    
    System.out.println("What number do you want to start from?");

    int startpoint = Scanner.nextInt();

    System.out.println("What number do you want to multiply by?");

    int multinum = Scanner.nextInt();

    System.out.println("What will be your term? (1 means it will not multiply)");

    int term = Scanner.nextInt();

    int endpoint = geometricSequence(startpoint, multinum, term, 0);

    System.out.println("\nThis will be your number at term number " + term);
    System.out.println(endpoint);

    System.out.println("\nHere is the total sum from " + startpoint + " through " + endpoint);

    int sumendpoint = geometricSequenceSum(startpoint, multinum, term, endpoint);
    System.out.println(sumendpoint);

    System.out.println("\nHere is the sum of the same pattern but at a infinite term");

    double suminfinitepoint = infiniteSum(startpoint, multinum);
    System.out.println(suminfinitepoint);

  }

  // Geometric Sequence (Recursive)
  public static int geometricSequence(int start, int multi, int term, int startterm){
    int calc = start * (int) Math.pow((double) multi,(double) startterm - 1);
    if (startterm < term) {
      return geometricSequence(start, multi, term, startterm + 1);
    }
    else {
      return calc;
    }
  }

}



