class occ1
{
public static void main(String args[])
{
int i,j,k;
int temp=1;
int nem=1;
int[] array={1,2,2,3,4,5,5,5};
for(i=0;i<array.length;i++)
{
for(j=i+1;j<array.length;j++)
{
if(array[i]==array[j])
{
temp++;
//array[i]=nem+1;
//System.out.println(array[i]+" ");
//System.out.println(array[j]+" ");
System.out.println(temp);
}
else 
{
nem=array[j];
}
}
//System.out.println(temp);
}
//System.out.println(temp);
}
}
