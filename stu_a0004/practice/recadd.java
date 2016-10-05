class recadd{

public static long add(long number)
{

long  x=add(number+1);
return(x);
}
public static void main(String args[])
{
for(int counter=0;counter<=10;counter++)
{
System.out.println(add(counter));
}
}
}
