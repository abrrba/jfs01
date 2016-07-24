class AsgA0044
{
public int is_palindrome_number(int num)
{
int x=num%10;//1
int x1=num/10;//1232
int x2=x1%10;//2
int x3=x1/10;//123
int x4=x3%10;//3
int x5=x3/10;//12
int x6=x5%10;//2
int x7=x5/10;//1
int x8=x7%10;//1
int x9=x7/10;//0
if(x==x8 && x2==x6)
{
System.out.println("True");
}
else
{
System.out.println("false");
}
return(0);
}
}

