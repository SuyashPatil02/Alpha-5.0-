public class Pattern {
  public static void main(String args[]) {
    // Star Patter //

    /*
     * int i, j; // Steps :->
     * // i = Outer Loop (How many lines)
     * // j = Inner Loop (Number of time (i times))
     * // What to print& -> "*"
     * for (i = 1; i <= 4; i++)
     * {
     * // one line
     * for (j = 1; j <= i; j++)
     * {
     * System.out.print(" * ");
     * }
     * 
     * System.out.println();
     * }
     */

    // Inverted-Star Patter //

    /*
     * int n = 4; // 7 // (Star = n-i+1)
     * int i, j; // Steps :->
     * // i = Outer Loop (How many lines)
     * // j = Inner Loop (Number of time (i times))
     * // What to print& -> "*"
     * for(i=1; i <= n; i++)
     * {
     * for(j = 1; j <= n-i+1; j++)
     * {
     * System.out.print(" * ");
     * }
     * 
     * System.out.println();
     * }
     */

    // Number Patter (half pyramid) //

    /*
     * int i, j;
     * 
     * for (i = 1; i <= 4; i++)
     * {
     * // one line
     * for (j = 1; j <= i; j++)
     * {
     * System.out.print(j + " ");
     * }
     * 
     * System.out.println();
     * }
     */

    // Character Patter //
    /*
     * char ch = 'A';
     * int i, j;
     * 
     * for (i = 1; i <= 4; i++)
     * {
     * // one line
     * for (j = 1; j <= i; j++)
     * {
     * System.out.print(ch + "  ");
     * ch++;
     * }
     * 
     * System.out.println( );
     * }
     */

    // hollow_rectangle(4, 5);
    // Rotatedhalf_Pyramid(4);
    // InvertedHalf_PyramidWithNumber(5);
    // Floyds_Triangle(5);
    // ZeroOne_Triangle(5);
    // Butterfly_Pattern(5);
    // Solid_Rhombus(7);
    // Diamond_Pattern(5);
    // Number_Pyramid(7);
     Palindromic_Pattern(5);
  }

  public static void hollow_rectangle(int TotalRows, int TotColums) {
    // Outer Loop
    for (int i = 1; i <= TotalRows; i++) {
      // Inner Loop
      for (int j = 1; j <= TotColums; j++) {
        // Cell -(i, j)
        if (i == 1 || i == TotalRows || j == 1 || j == TotColums) {
          System.out.print(" * ");
        } else {
          System.out.print("   ");
        }
      }
      System.out.println();
    }
  }

  public static void Rotatedhalf_Pyramid(int n) {
    // Outer Loop
    for (int i = 1; i <= n; i++) {
      // Space
      for (int j = 1; j <= n - i; j++) {
        // Star
        System.out.print("   ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print(" * ");
      }
      System.out.println();
    }

  }

  public static void InvertedHalf_PyramidWithNumber(int n) {
    // Outer Loop
    for (int i = 1; i <= n; i++) {
      // Inner Loop
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print(j + " ");
      }

      System.out.println();
    }

  }

  public static void Floyds_Triangle(int n) {

    int Counter = 1;
    // Outer Loop
    for (int i = 1; i <= n; i++) {
      // Inner Loop
      for (int j = 1; j <= i; j++) {
        System.out.print(Counter + "  ");
        Counter++;
      }
      System.out.println();
    }
  }

  public static void ZeroOne_Triangle(int n) {

    // Outer Loop
    for (int i = 1; i <= n; i++) {
      // Inner Loop
      for (int j = 1; j <= i; j++) {

        if ((i + j) % 2 == 0) {
          System.out.print(" 1 ");
        } else {
          System.out.print(" 0 ");
        }
      }
      System.out.println();
    }
  }

  public static void Butterfly_Pattern(int n) {

    // -------- 1st Half --------
    for (int i = 1; i <= n; i++) {

      // Left stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      // Middle spaces
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }

      // Right stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }

    // -------- 2nd Half --------
    for (int i = n; i >= 1; i--) {

      // Left stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      // Middle spaces
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }

      // Right stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }

  public static void Solid_Rhombus(int n) {
    for (int i = 1; i <= n; i++) {
      // Spaces
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      // star
      for (int j = 1; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void Diamond_Pattern(int n) {
    /// 1st Half
    // Outer Loop
    for (int i = 1; i <= n; i++) {
      // Inner Loop
      // Spaces
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      // Star // Odd :-> 2x+1 or 2x-1
      for (int j = 1; j <= (2 * i) - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    // 2nd Half
    // Outer loop
    for (int i = n; i >= 1; i--) {
      // Inner Loop
      // Spaces
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      // Star // Odd :-> 2x+1 or 2x-1
      for (int j = 1; j <= (2 * i) - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

  public static void Number_Pyramid(int n) {
    /// Outer loop
    for (int i = 1; i <= n; i++) {
      // Inner loop
      // Spaces
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      // Star
      for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }

  public static void Palindromic_Pattern(int n) {
    // Outer loop
    for (int i = 1; i <= n; i++) 
   {
      // Inner loop
      // Spaces
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      // Descending
      for (int j = i; j >= 1; j--) {
        System.out.print(j);
      }
      // Ascending
      for (int j = 2; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
