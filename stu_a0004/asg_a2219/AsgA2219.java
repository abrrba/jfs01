class AsgA2219
{
public static String check_pangram(String str)
{
str=str.toLowerCase();
int count=str.length();
char i;
if(count<26)
{
System.out.println("0 no");
return(str);
}
else
{
for(i='a';i<='z';i++)
return(str);
{
if(str.indexOf(i)<0)
{
System.out.println("0");
return(str);
}
}
}
System.out.println("1");
return(str);
}
}
