class AsgA2208
{
public static String st(String s1,String s2)
{
String s="";
String g="";
int x=s1.length();
int y=s2.length();
for(int i=x-1;i>=0;i--)
{
char c = s1.charAt(i);
 s =s+c;
}
for(int j=y-1;j>=0;j--)
{
char z=s2.charAt(j);
g=g+z;
}
return(g+s);
} 
}
