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

    System.out.println("What will be your term? (0 means it will not multiply)");

    int term = Scanner.nextInt();

    int endpoint = geometricSequence(startpoint, multinum, term, 0);

    System.out.println("This will be your number at term number " + term);
    System.out.println(endpoint);


  }

  // Item Lister Method (Recursive)
  public static int geometricSequence(int start, int multi, int term, int startterm){
    if (startterm <= term) {
      int calc = start * multi;
      geometricSequence(calc, multi, term, startterm + 1);
    }
    else {
      return start;
    }
    return start;
  }
}



