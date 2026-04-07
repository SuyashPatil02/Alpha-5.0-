//import java.util.*;

public class ArrayCC {

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);

        // // CREATE: declare and create array of size 5
        // int[] arr = new int[5];
        // //int number[] = {1,2,3,4}

        // // INPUT: read elements into array
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print("Enter element " + i + ": ");
        // arr[i] = sc.nextInt(); // store value at index i
        // }

        // // OUTPUT: display array elements
        // System.out.println("Array elements:");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // // UPDATE: change value at index 2
        // arr[2] = 100;

        // // OUTPUT after update
        // System.out.println("\nAfter updating index 2:");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // -----------------------------------------------------------------------------------------------------------------
        // //
        /*
         * int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
         * int key = 10;
         * 
         * int result = linearSearch(arr, key);
         * 
         * if (result != -1) {
         * System.out.println("Element found at index: " + result);
         * } else {
         * System.out.println("Element not found");
         * }
         */

        // ------------------------------------------------------------------------------------------------------------------------//
        // -----------------------------------------------------------------------------------------------------------------
        // //
        // int[] number = { 2, 4, 6, 8, 10, 12, 14, 16 };
        // int key = 10;
        // Reverse(number);
        // for (int i = 0; i < number.length; i++) {
        // System.out.print(number[i] + " ");
        // }
        // System.out.println();

        // System.out.println("Largest number is :" + getLargest(number));
        // System.out.println("index for Key is : " + BinarySearch(number, key));
        // PrintPairs(number);
        // PrintSubarrays(number);
        // MaxSubarraysSum(number);

        // int heigt[] = { 4, 2, 0, 6, 3, 2, 5 };
        // System.out.println(trappedRainwater(heigt));

        // int prices[] = { 7, 1, 5, 3, 6, 4 };
        // System.out.println("Maximum Profit = " + BuyAndSellStocks(prices));

        int nums[] = { 1, 2, 3, 1 };
        System.out.println(Duplicate(nums));
        // sc.close();

    }

    // Method to perform linear search
    public static int linearSearch(int arr[], int key) {

        // traverse array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // return index if found
            }
        }

        return -1; // return -1 if not found
    }

    public static int getLargest(int number[]) {
        int largest = Integer.MIN_VALUE; // -Infinity
        int smallest = Integer.MAX_VALUE; // +Infinity

        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }

        System.out.println("Smallest number is :" + smallest);
        return largest;
    }

    public static int BinarySearch(int number[], int key) {
        int start = 0, end = number.length - 1;

        while (start <= end) {
            // Mid calculate
            int mid = (start + end) / 2;

            // Comparison
            if (number[mid] == key) { // found
                return mid;
            }
            if (number[mid] < key) { // Right
                start = mid + 1;
            } else { // Left
                end = mid - 1;
            }
        }
        return -1;
        // start = 0, end = 7
        // mid = (0 + 7) / 2 = 3
        // number[3] = 8
        // 8 < 10 → key is on the right side
        // start = mid + 1 → start = 4

        // start = 4, end= = 7
        // mid = (4 + 7) / 2 = 5
        // number[5] = 12
        // 12 > 10 → key is on the left side
        // end = mid - 1 → end = 4

        // start = 4, end = 4
        // mid = (4 + 4) / 2 = 4
        // number[4] = 10
        // key found at index 4

    }

    public static void Reverse(int number[]) {

        int first = 0, last = number.length - 1;

        while (first < last) {
            // swap
            int temp;
            temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            first++;
            last--;
        }

        // Initial array:
        // Index : 0 1 2 3 4 5 6 7
        // Value : 2 4 6 8 10 12 14 16

        // first = 0, last = 7 → swap number[0] & number[7] → swap 2 & 16
        // Array becomes: 16 4 6 8 10 12 14 2

        // first = 1, last = 6 → swap number[1] & number[6] → swap 4 & 14
        // Array becomes: 16 14 6 8 10 12 4 2

        // first = 2, last = 5 → swap number[2] & number[5] → swap 6 & 12
        // Array becomes: 16 14 12 8 10 6 4 2

        // first = 3, last = 4 → swap number[3] & number[4] → swap 8 & 10
        // Array becomes: 16 14 12 10 8 6 4 2

        // first = 4, last = 3 → first >= last → stop loop

    }

    public static void PrintPairs(int number[]) {

        for (int i = 0; i < number.length; i++) {
            int curr = number[i]; // 2,4,6,8,10,12..

            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + curr + "," + number[j] + ")");
            }
            System.out.println();
        }

        // Input array:
        // Index : 0 1 2 3 4
        // Value : 2 4 6 8 10

        // ---------- i = 0 ----------
        // curr = number[0] = 2

        // j = 1 → pair (2,4)
        // j = 2 → pair (2,6)
        // j = 3 → pair (2,8)
        // j = 4 → pair (2,10)
        // j = 5 → stop inner loop
        // Output line: (2,4)(2,6)(2,8)(2,10)

        // ---------- i = 1 ----------
        // curr = number[1] = 4

        // j = 2 → pair (4,6)
        // j = 3 → pair (4,8)
        // j = 4 → pair (4,10)
        // j = 5 → stop inner loop
        // Output line: (4,6)(4,8)(4,10)

        // ---------- i = 2 ----------
        // curr = number[2] = 6

        // j = 3 → pair (6,8)
        // j = 4 → pair (6,10)
        // j = 5 → stop inner loop
        // Output line: (6,8)(6,10)

        // ---------- i = 3 ----------
        // curr = number[3] = 8

        // j = 4 → pair (8,10)
        // j = 5 → stop inner loop
        // Output line: (8,10)

        // ---------- i = 4 ----------
        // curr = number[4] = 10

        // j = 5 → condition false → no pairs
        // Loop ends

    }

    public static void PrintSubarrays(int number[]) {

        // Input array:
        // Index : 0 1 2
        // Value : 2 4 6

        // ================= i = 0 =================
        // start = 0

        // ---- j = 0 ----
        // end = 0
        // k = 0 → print number[0] → 2
        // Subarray: 2

        // ---- j = 1 ----
        // end = 1
        // k = 0 → print number[0] → 2
        // k = 1 → print number[1] → 4
        // Subarray: 2 4

        // ---- j = 2 ----
        // end = 2
        // k = 0 → print number[0] → 2
        // k = 1 → print number[1] → 4
        // k = 2 → print number[2] → 6
        // Subarray: 2 4 6

        // Blank line printed

        // ================= i = 1 =================
        // start = 1

        // ---- j = 1 ----
        // end = 1
        // k = 1 → print number[1] → 4
        // Subarray: 4

        // ---- j = 2 ----
        // end = 2
        // k = 1 → print number[1] → 4
        // k = 2 → print number[2] → 6
        // Subarray: 4 6

        // Blank line printed

        // ================= i = 2 =================
        // start = 2

        // ---- j = 2 ----
        // end = 2
        // k = 2 → print number[2] → 6
        // Subarray: 6

        // Blank line printed

        // Outer loop: starting index of subarray
        for (int i = 0; i < number.length; i++) {
            int start = i;

            // Middle loop: ending index of subarray
            for (int j = i; j < number.length; j++) {
                int end = j;

                // Inner loop: print elements from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");// SubArray
                }

                // New line after each subarray
                System.out.println();
            }

            // Extra line after each starting index (optional)
            System.out.println();
        }
    }

    public static void MaxSubarraysSum(int number[]) {

        int currSum = 0; // Stores sum of current subarray
        int maxSum = Integer.MIN_VALUE; // Stores maximum subarray sum

        // Outer loop → starting index of subarray
        for (int i = 0; i < number.length; i++) {
            int start = i; // Start index

            // Middle loop → ending index of subarray
            for (int j = i; j < number.length; j++) {
                int end = j; // End index
                currSum = 0; // Reset sum for new subarray

                // Inner loop → calculate sum from start to end
                for (int k = start; k <= end; k++) {
                    currSum += number[k]; // Add element to current sum
                    System.out.print(number[k] + " "); // Print subarray element
                }

                // Move to next line after printing one subarray
                System.out.println(" -> Sum = " + currSum);

                // Update maxSum if current subarray sum is greater
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }

            // Blank line for better readability
            System.out.println();
        }

        // Print final maximum subarray sum
        System.out.println("Maximum Subarray Sum = " + maxSum);

        // Initial values
        // currSum = 0
        // MaxSum = -∞ (Integer.MIN_VALUE)

        // ================= i = 0 =================
        // start = 0

        // ---- j = 0 ----
        // end = 0
        // currSum = 0

        // k = 0 → currSum = 0 + 2 = 2
        // Subarray: 2
        // MaxSum < currSum → MaxSum = 2

        // ---- j = 1 ----
        // end = 1
        // currSum = 0

        // k = 0 → currSum = 0 + 2 = 2
        // k = 1 → currSum = 2 + 4 = 6
        // Subarray: 2 4
        // MaxSum < currSum → MaxSum = 6

        // ---- j = 2 ----
        // end = 2
        // currSum = 0

        // k = 0 → currSum = 0 + 2 = 2
        // k = 1 → currSum = 2 + 4 = 6
        // k = 2 → currSum = 6 + 6 = 12
        // Subarray: 2 4 6
        // MaxSum < currSum → MaxSum = 12

        // Blank line printed

        // ================= i = 1 =================
        // start = 1

        // ---- j = 1 ----
        // end = 1
        // currSum = 0

        // k = 1 → currSum = 0 + 4 = 4
        // Subarray: 4
        // MaxSum remains 12

        // ---- j = 2 ----
        // end = 2
        // currSum = 0

        // k = 1 → currSum = 0 + 4 = 4
        // k = 2 → currSum = 4 + 6 = 10
        // Subarray: 4 6
        // MaxSum remains 12

        // Blank line printed

        // ================= i = 2 =================
        // start = 2

        // ---- j = 2 ----
        // end = 2
        // currSum = 0

        // k = 2 → currSum = 0 + 6 = 6
        // Subarray: 6
        // MaxSum remains 12

        // Blank line printed

    }

    public static int trappedRainwater(int height[]) {

        int n = height.length;

        // 1️⃣ Left max boundary array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // 2️⃣ Right max boundary array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // 3️⃣ Calculate trapped water
        int totalWater = 0; // Stores total trapped rain water

        // Loop through each bar
        for (int i = 0; i < n; i++) {

            // Find the maximum water height possible at index i
            int WaterLevel = Math.min(leftMax[i], rightMax[i]);

            // Calculate water trapped on top of current bar
            int waterAtCurrentBar = WaterLevel - height[i];

            // Add current trapped water to total
            totalWater = totalWater + waterAtCurrentBar;
        }

        // Return total trapped rain water
        return totalWater;

        // =====================================================
        // TRAPPING RAIN WATER — FULL DRY RUN (ALL-IN-ONE COMMENTS)
        // =====================================================

        // Given height array:
        // index : 0 1 2 3 4 5 6
        // height : 4 2 0 6 3 2 5

        // -----------------------------------------------------
        // STEP 1: CREATE LEFT MAX ARRAY
        // leftMax[i] = maximum height from index 0 to i
        // -----------------------------------------------------

        // leftMax[0] = height[0] = 4

        // i = 1 → max(2, 4) = 4
        // i = 2 → max(0, 4) = 4
        // i = 3 → max(6, 4) = 6
        // i = 4 → max(3, 6) = 6
        // i = 5 → max(2, 6) = 6
        // i = 6 → max(5, 6) = 6

        // leftMax = {4, 4, 4, 6, 6, 6, 6}

        // -----------------------------------------------------
        // STEP 2: CREATE RIGHT MAX ARRAY
        // rightMax[i] = maximum height from index i to n-1
        // -----------------------------------------------------

        // rightMax[6] = height[6] = 5

        // i = 5 → max(2, 5) = 5
        // i = 4 → max(3, 5) = 5
        // i = 3 → max(6, 5) = 6
        // i = 2 → max(0, 6) = 6
        // i = 1 → max(2, 6) = 6
        // i = 0 → max(4, 6) = 6

        // rightMax = {6, 6, 6, 6, 5, 5, 5}

        // -----------------------------------------------------
        // STEP 3: CALCULATE TRAPPED WATER
        // waterLevel = min(leftMax[i], rightMax[i])
        // trappedWater += waterLevel - height[i]
        // -----------------------------------------------------

        // trappedWater = 0

        // i = 0 → min(4,6) - 4 = 0 → trappedWater = 0
        // i = 1 → min(4,6) - 2 = 2 → trappedWater = 2
        // i = 2 → min(4,6) - 0 = 4 → trappedWater = 6
        // i = 3 → min(6,6) - 6 = 0 → trappedWater = 6
        // i = 4 → min(6,5) - 3 = 2 → trappedWater = 8
        // i = 5 → min(6,5) - 2 = 3 → trappedWater = 11
        // i = 6 → min(6,5) - 5 = 0 → trappedWater = 11

        // -----------------------------------------------------
        // FINAL ANSWER
        // -----------------------------------------------------

        // Total Trapped Rain Water = 11 units

        // -----------------------------------------------------
        // IMPORTANT NOTES (EXAM READY)
        // -----------------------------------------------------

        // Water can be trapped only if there is a taller bar on both sides
        // Time Complexity = O(n)
        // Space Complexity = O(n)
        // Formula used = min(leftMax, rightMax) - height

    }

    public static int BuyAndSellStocks(int prices[]) {

        int buyPrice = Integer.MAX_VALUE; // Best buying price
        int MaxProfit = 0; // Maximum profit

        for (int i = 0; i < prices.length; i++) {
            // Update minimum price (buy)
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            }
            // Calculate profit if sold today
            int Profit = prices[i] - buyPrice;

            // Update maximum profit
            if (Profit > MaxProfit) {
                MaxProfit = Profit;

            }

        }
        return MaxProfit;
    }

    public static boolean Duplicate(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
