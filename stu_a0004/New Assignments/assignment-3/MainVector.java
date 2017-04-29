import java.util.Scanner;
class MainVector
{
public static void main(String... arg)
    {
        int size;
        int num;
        int value;
 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  size of the vector");
        size = scanner.nextInt();
 
        Vector<Integer> vector = new Vector<>(size);
        System.out.println("Enter the number of elements ");
        num = scanner.nextInt();
 
        System.out.println("Enter the values");
        for (int index = 0; index < num; index++)
        {
            value = scanner.nextInt();
            vector.store(index, value);
        }
 
        System.out.println("The Entered Values are");
        for (int index = 0; index < vector.getSize(); index++)
        {
            System.out.print(vector.get(index) + "\t");
        }
 
        System.out.println("\nThe Size Of The Vector " + vector.getSize());
        System.out.println("The Capacity of Vector " + vector.getCapacity());
        scanner.close();
    }
}

