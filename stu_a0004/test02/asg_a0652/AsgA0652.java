class AsgA0652
{
public int find_min_max(int[] arr)
{
int maximum=arr[0];
int minimum=arr[0];
for(int i=1;i<arr.length;i++)
{
if(arr[i]>maximum)
{
maximum=arr[i];
}
if(arr[i]<minimum)
{
minimum=arr[i];
}
}
System.out.println(minimum);

      return(maximum);

}
}
