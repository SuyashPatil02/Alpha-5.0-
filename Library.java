//import java.lang.reflect.Method;

public class Library {

    public static void main(String[] args) {
//   Method	    Use
// Math.min()	Smallest value
// Math.max()	Largest value
// Math.sqrt()	Square root
// Math.pow()	Power
// Math.avg()	❌ Not available
// Math.abs()	Absolute value(-ve -> +ve)
        // System.out.println(Math.min(5, 9));      // 5
        // System.out.println(Math.max(5, 9));      // 9
        // System.out.println(Math.sqrt(16));       // 4.0
        // System.out.println(Math.pow(3, 2));      // 9.0
        // System.out.println((10 + 20) / 2.0);     // 15.0 (average)
        // System.out.println(Math.abs(-7));        // 7


        //------------------------------------------------------------//
        // Returns the smaller of two numbers
        System.out.println("Min: " + Math.min(5, 9));

        // Returns the larger of two numbers
        System.out.println("Max: " + Math.max(5, 9));

        // Returns the square root of a number
        System.out.println("Sqrt: " + Math.sqrt(25));

        // Returns base raised to the power exponent
        System.out.println("Power: " + Math.pow(2, 3));

        // Returns absolute (positive) value
        System.out.println("Abs: " + Math.abs(-10));

        // Rounds to the nearest integer
        System.out.println("Round: " + Math.round(4.6));

        // Returns smallest integer greater than or equal to value
        System.out.println("Ceil: " + Math.ceil(4.2));

        // Returns largest integer less than or equal to value
        System.out.println("Floor: " + Math.floor(4.9));

        // Generates a random number between 0.0 and 1.0
        System.out.println("Random: " + Math.random());

        // Returns logarithm base 10
        System.out.println("Log10: " + Math.log10(100));

        // Returns sine of angle (in radians)
        System.out.println("Sin(90): " + Math.sin(Math.PI / 2));
    }
}




