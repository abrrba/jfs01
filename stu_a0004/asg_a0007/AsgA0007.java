class AsgA0007
{
public static String find_uppercase(String str)
{
String t="";
int count=str.length();
for(int i=0;i<count;i++)
{
char s=str.charAt(i);
if(Character.isUpperCase(s))
{
t=t+s;
}
}
return(t);
}
}
