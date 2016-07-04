
class AsgA2218
{
public static String check_phrase_palindrome(String str)
{
String reverse=new String();
String str1=str.replaceAll("\\s","");
int count=str1.length();
for(int i=count-1;i>=0;i--)
{
 reverse =reverse + str1.charAt(i);
}
if(reverse.equals(str1))
{
System.out.print("1");
return(str);
}
else
{
System.out.print("0");
return(str);
}
}
