class Asga0010{
public int reverse_3_digit_int(int num)
{
int x=num%10; //3
int x1=num/10; //12
int x2=x1%10; //2
int x3=x1/10; //1
int x4=x3%10; //1
int x5=x3/10; //0
if(x5==0)
{
int m=((x*100)+(x2*10)+(x4*1));
return(m);
}
else{
return(0);
}
}
}
public class asg_a0010
{
public static void main(String[] args)
{
Asga0010 temp=new Asga0010();
System.out.println(temp.reverse_3_digit_int(123));
}
}

 
