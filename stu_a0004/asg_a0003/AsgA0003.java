class AsgA0003
{
public static String alter_case_2(String str)
{
char f=str.charAt(0);
String t="";
//System.out.print(Character.toLowerCase(f));
int count=str.length();
for(int i=0;i<count;i++)
{
char n=str.charAt(i);
if(i==0)
{
if(Character.isUpperCase(n))
{
t=t+Character.toLowerCase(n);
}
else
{
t=t+str.charAt(0);
}
}
else
{
if(Character.isUpperCase(n))
{
t=t+Character.toLowerCase(n);
}
else
{
t=t+Character.toUpperCase(n);
}
}
}
return(t);
}
}
