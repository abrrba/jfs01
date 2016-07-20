class AsgA0154
{
public static String rotatenum(String str,int shiftby)
{
String t="";
String m="";
String op="";
int count=str.length();
if(shiftby>count)
{
System.out.println("wrong shift");
return t;
}
else
{
//abhijeet
t=t+str.substring(shiftby,count);//hijeet
m=m+str.substring(0,shiftby);//ab
op=t+m;
return(op);
}
}
}
