class AsgA2210
{
public static String is_member(String number,String str)
{

int count =str.length();
for(int i=0;i<count;i++)
{
//char s=str.charAt(i);
//System.out.println(s);
if(str.charAt(i)==number.charAt(0))
{
System.out.println("1");
}
}
return(str);
}

}
