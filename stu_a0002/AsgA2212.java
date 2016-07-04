class AsgA2212
{
public static String generate_n_chars(int num,String str)
{
for(int i=0;i<num;i++)
{
char s=str.charAt(0);
int ascii=(int) s;
if((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122))
{ 
System.out.print(s);
}
}
return(str);
}
}
