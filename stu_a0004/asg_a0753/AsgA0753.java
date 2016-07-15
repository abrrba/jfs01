class AsgA0753
{
public static String insert_hello(String str)
{
//String str=new String("how are you");
String newstr=str.replaceAll("\\s"," hello ");
return newstr;
}
}
