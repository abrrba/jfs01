class AsgA2208
{
public static String myreverse(String str)
{
String t="";
int count=str.length();
for(int i=count-1;i>=0;i--)
{
t=t+str.charAt(i);
}
return(t);
}
}