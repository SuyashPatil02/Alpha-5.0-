public class BinaryToDeciaml {

    public static void BinToDec(int BinaryNumber) {
        int MyNumber = BinaryNumber;
        int pow = 0;
        int DecNumber = 0;

        while (BinaryNumber > 0) {
            int LastDigit = BinaryNumber % 10;
            DecNumber = DecNumber + (LastDigit * (int) Math.pow(2, pow));
            pow++;
            BinaryNumber = BinaryNumber / 10;
        }

        System.out.println("Decimal of " + MyNumber + " = " + DecNumber);
    }

    public static void DecToBinary(int DecimalNumber){
       int MyNumber = DecimalNumber;
       int pow = 0;
       int BinaryNumber = 0; 
        
       while (DecimalNumber > 0) {
        int Remender = DecimalNumber % 2;
        BinaryNumber = BinaryNumber + (Remender * (int)Math.pow(10, pow));
        pow++;
        DecimalNumber = DecimalNumber / 2;
       }
       System.out.println("Binary of " + MyNumber + " = " + BinaryNumber);
        
    }

    public static void main(String[] args) {
      BinToDec(1111);

       DecToBinary(15);
    }

}
