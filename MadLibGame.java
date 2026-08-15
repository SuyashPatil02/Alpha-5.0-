import java.util.*;
public class MadLibGame {
public static void main(String[] args) {
    // Mad Libs Game
    Scanner sc = new Scanner(System.in);
    
    String adjective1;
    String noun1;
    String adjective2;
    String verb1;
    String adjective3;


   System.out.println("Enter an adjective (description):");
   adjective1 = sc.nextLine();
   System.out.println("Enter an nonu (animal or person):");
   noun1 = sc.nextLine();
   System.out.println("Enter an adjective (description):");
   adjective2 = sc.nextLine();
   System.out.println("Enter an verb end with -ing (action):");
   verb1 = sc.nextLine();
   System.out.println("Enter an adjective (description):");
   adjective3 = sc.nextLine();

   
    System.out.println("Today i went to a" + adjective1 + " Zoo.");
    System.out.println("In an exhibt, I saw a" + noun1 + ".");
    System.out.println( noun1 + "was" + adjective2 + " and " + verb1 + "!");    
    System.out.println("I was" + adjective3 + "!");


    sc.close();

  }
}