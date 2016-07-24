class AsgA0042
{
public static String rotet(String s1,int i)
{
String a="";
String b="";
int x=s1.length();
 a= s1.substring(0,i);
 b=s1.substring(i,x);
return(b+a);
}
}
