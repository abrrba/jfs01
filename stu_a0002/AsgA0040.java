import java.util.Scanner;

class AsgA0040 {
public static void main(String[] args) {
Scanner Input = new Scanner(System.in);
int sum;
int i;
int a;
int Digit;

a = Input.nextInt();
sum = 0;
for(i=1;i<=10;i++)
{
Digit = a%10;
a = a/10;
sum=sum + Digit;
}
System.out.println("The sum of the digits is "+sum);
}} 
