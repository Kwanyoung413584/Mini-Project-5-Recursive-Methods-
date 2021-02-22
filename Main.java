// Imports
import java.util.Scanner;

// Main Class
class Main {

  // Main Method
  public static void main(String[] args) {

    String[] Storage;

    Scanner Scanner = new Scanner(System.in);
    
    System.out.println("How many folders can your storage hold?");

    int storageSize = Scanner.nextInt();

    Storage = new String[storageSize];

    System.out.println("\nThis is your storage commands, input a specific number to perform an action. Commands are displayed below.\n");

    System.out.println(000 == 0);
    showCommands();


  }

  // Item Lister Method (Recursive)
  public static int showDescendants(int arg1){

    showDescendants(1);
    return 1;
  }

  // "View" Method
  public static void viewAction(){
      System.out.println("Here are your folders, input an number to look inside your folder, otherwise, input 000 to head back to the command list.");



  }

  // Commands Method
  public static void showCommands(){

    Scanner Scanner = new Scanner(System.in);

    System.out.println("Storage Commands");
    System.out.println("----------------");
    System.out.println("0 View");
    System.out.println("1 New Folder");
    System.out.println("2 New File");
    System.out.println("3 Delete Folder");
    System.out.println("4 Delete File");
    System.out.println("5 Edit Folder");
    System.out.println("6 Edit File");

    int inputCommand = Scanner.nextInt();

    if (inputCommand == 0) {

    }
    else if (inputCommand == 1) {

    }

  }


}



// Idea, folder managing thing