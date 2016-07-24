class AsgA0013
{
public static String toggle_case(String str)
{
int count=str.length();
for(int i=0;i<count;i++)
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
