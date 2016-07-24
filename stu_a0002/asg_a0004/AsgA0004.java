class AsgA0004
{
public static String find_lowercase(String str)
{
int count=str.length();
for(int i=1;i<count;i++)
{
char s=str.charAt(i);
if(Character.isLowerCase(s))
{
System.out.print(s);
}
}
return(str);
}
}
