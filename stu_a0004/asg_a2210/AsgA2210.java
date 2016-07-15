class AsgA2210
{
public static int is_member(String number,String str)
{
int j=0;
int count =str.length();
for(int i=0;i<count;i++)
{
if(str.charAt(i)==number.charAt(0))
{
j=1;
}
}
if(j==1)
{
return(1);
}
else
{
return(0);
}
}
}
