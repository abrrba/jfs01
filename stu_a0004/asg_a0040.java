class Asga0040{
public int find_five_digit_sum(int num)

{
if(num>0)
{
int x=num%10; //5
int x1=num/10; //1234
int x2=x1%10; //4
int x3=x1/10; //123
int x4=x3%10; //3
int x5=x3/10; //12
int x6=x5%10;//2
int x7=x5/10;//1
int x8=x7%10;//1
int x9=x7/10;//0
int number=((x8) + (x6) + (x4) + (x2) + (x));
return(number);
}
else if(num<0)
{
num=((num)*(-1));
int x=num%10; //5
int x1=num/10; //1234
int x2=x1%10; //4
int x3=x1/10; //123
int x4=x3%10; //3
int x5=x3/10; //12
int x6=x5%10;//2
int x7=x5/10;//1
int x8=x7%10;//1
int x9=x7/10;//0
int number=((x8) + (x6) + (x4) + (x2) + (x));
return(number);
}
else
{
return(0);
}

}
}
public class asg_a0040
{
public static void main(String[] args)
{
Asga0040 temp=new Asga0040();
System.out.println(temp.find_five_digit_sum(12));
}
}

