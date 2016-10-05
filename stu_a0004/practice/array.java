class array{
public static void  main(String args[])
{
double[] myList={1.2,2.3,4.5,6.7};
for(int i=0;i<myList.length;i++)
{
System.out.println(myList[i] + " ");
}
double total =0;
for (int i=0;i<myList.length;i++)
{
total=total +myList[i];
}
System.out.println("totals="+total);
double prod =1;
for (int i=0;i<myList.length;i++)
{
prod =prod * myList[i];
}
System.out.println("product="+prod);
double avg =0;
for (int i=0;i<myList.length;i++)
{
avg=avg +myList[i];
}
System.out.println("average="+avg/(myList.length));





double max=myList[0];
for(int i=1;i<myList.length;i++)
{
if(myList[i]>max)
{
max=myList[i];
}
}
System.out.println("maximum number is="+ max);
}
}
