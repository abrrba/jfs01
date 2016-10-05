class fibo1{

public static long fibo(long number)
{
if(number==0 || number==1)
{
return(number);
}
else
{
long  x=fibo(number-1)+fibo(number-2);
return(x);
}
}
public static void main(String args[])
{
for(int counter=0;counter<=10;counter++)
{
System.out.println(fibo(counter));
}
}
}
