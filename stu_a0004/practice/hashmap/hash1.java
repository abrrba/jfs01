import java.util.*;
class hash1
{
public static void main(String args[])
{
HashMap<String,Double> hm=new HashMap<String,Double>();
hm.put("abhijeet Gite", new Double(34.34));
hm.put("Jadhav D",new Double(45.67));
hm.put("datta c",new Double(98.9001));
hm.put("gade anand",new Double(345.56));

//Get a set of Entries
Set<Map.Entry<String, Double>> set=hm.entrySet();

//Display the set
for(Map.Entry<String,Double> me:set)
{
System.out.println(me.getKey() + ":");
System.out.println(me.getValue());
}

System.out.println();

//deposit 1200 int abhijeet account
//double balance=hm.get("abhijeet Gite");
//hm.put("abhijeet gite",balance + 1000);

//System.out.println("abhijeet new bal:"+hm.get("abhijeet gite"));
}
}
