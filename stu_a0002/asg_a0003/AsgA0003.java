
class AsgA0003
{
public static String alter_case_2(String str)
{
char f=str.charAt(0);
System.out.print(Character.toLowerCase(f));
int count=str.length();
for(int i=1;i<count;i++)
{
char n=str.charAt(i);

if(Character.isUpperCase(n))
{
System.out.print(Character.toLowerCase(n));
}
else
{
System.out.print(Character.toUpperCase(n));
}
}
return(str);
}
}
