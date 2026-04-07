
// shotcut //

// class MultiplicationTable {
//     public static void printMultiplicationTable(int n) {
//         for(int i = 1; i <= 10; i++) {
//             System.out.println(n + " * " + i + " = " + n*i);
//         }
//     }

//     public static void main(String[] args) {
//         printMultiplicationTable(4);
//     }
// }

// or

import java.util.*;

class MultiplicationTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        printMultiplicationTable(n);
        sc.close();
    }

    public static void printMultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
