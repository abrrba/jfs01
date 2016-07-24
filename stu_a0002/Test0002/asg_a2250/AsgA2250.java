public class AsgA2250

{
   public static void main(String[] args)
 {
      System.out.println(diagonal_Sum(1001));
   }

  
   private static int diagonal_Sum(int dimension) {
      int currentNumber = 1;
      int diagonalSum = 1;
      for (int i = 1; i < dimension; i += 2) {
         for (int k = 0; k < 4; k++) {
            currentNumber += i + 1;
            diagonalSum += currentNumber;
         }
      }
      return diagonalSum;
}}
