class AsgA0651
{
public static int product_of_array(int[] array)
{

if(array.length==0)
{
System.out.println("0");
}
else
{
int s=array.length;
double count=1;
for(int i=0;i<s;i++)
{
count=count*array[i];
}
System.out.println(count);
}
return(0);
}
}
	
