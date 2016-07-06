class AsgA0007
{
public static String find_uppercase(String str)
{
int count=str.length();
for(int i=0;i<count;i++)
{
char s=str.charAt(i);
if(Character.isUpperCase(s))
{
System.out.print(s);
}
}
return(str);
}
}
