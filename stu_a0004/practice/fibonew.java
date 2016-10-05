class fibonew
{
public static void main(String args[])
{
int n1=0;
int n2=1;
System.out.println(n1+ "\n"+n2);
int n3=0;
for(int i=0;i<20;i++)
{
n3=n1+n2;//1
System.out.println(n3+ " ");
n1=n2;
n2=n3;
//System.out.println(n3);
}
}
}

