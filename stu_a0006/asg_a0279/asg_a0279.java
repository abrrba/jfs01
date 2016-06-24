class asg_a0279
{
public static void main(String[] arg)
{
int row,col1,col2,norow,nocol;
norow=5;
nocol=norow-1;
for(row=0;row<norow;row++)
{
for(col1=0;col1<=nocol;col1++)
{
System.out.print(" ");
}
nocol--;
for(col2=0;col2<=row;col2++)
{
System.out.print("*");
}
System.out.println(" ");
}
}
}

