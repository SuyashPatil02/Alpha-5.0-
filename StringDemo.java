import java.util.Scanner;

public class StringDemo {

    // Strings are immutable (cannot be changed once created)
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // ------------------------INPUT--------------------//
        // Declare a String variable
        /*
         * String name;
         * 
         * // Read full line input
         * name = sc.nextLine();
         * 
         * // Print the input
         * System.out.print(name);
         */

        // // ___________________________________LENGTH_____________//
        // String MyName = "Suyash Patil";
        // System.out.println(MyName.length());

        // // -----------------------------------Concatenation------------------------//

        // String firstName = "Orchid";
        // String LastName = "@123";

        // String fullName = firstName + LastName;
        // System.out.println(fullName);

        // // -------------------
        // // System.out.println(fullName.charAt(0));
        // // PrintLetters(fullName);

        // // ------------------------------------------------------------------------------//

        String str = "racecar";
        System.out.println(isPalindrome(str));
        sc.close();

    }

    public static void PrintLetters(String str) {

        for (int i = 0; i < str.length(); i++) {

            System.out.print(str.charAt(i) + " ");

        }

        System.out.println();
    }


    public static boolean isPalindrome(String str) {

        int n = str.length(); // length of string

        for (int i = 0; i < n / 2; i++) {

            // Compare characters from start and end
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }

        return true;

    }

}
