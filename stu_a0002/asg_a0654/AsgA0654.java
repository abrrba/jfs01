class AsgA0654
{
public static double find_median(double[] array)
{
if(array.length!=0)
{
int x=(array.length)/2;
if(array.length%2 != 0)
{
int med=(((array.length-1)/2)+1)-1;
//int i=int med
System.out.println(array[med]);
}
else
{
double med=(array[x]+array[x-1])/2;
System.out.println(med);
}
}
else
{
System.out.println("0");
}
return(0);
}
}
