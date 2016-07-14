class AsgA0004
{
public static String find_lowercase(String str)
{
String t="";
int count=str.length();
for(int i=0;i<count;i++)
{
char s=str.charAt(i);
if(Character.isLowerCase(s))
{
t=t+s;
}
}
return(t);
}
}
