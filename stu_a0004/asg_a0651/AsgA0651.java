class AsgA0651
{
public static int product_of_array(int[] array)
{

if(array.length==0)
{
return(0);
}
else
{
int s=array.length;
int count=1;
for(int i=0;i<s;i++)
{
count=count*array[i];
}
return(count);
}
}
}

