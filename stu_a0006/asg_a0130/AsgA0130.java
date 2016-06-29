class AsgA0130
{
public static int gr(int num)
{
while(num>0)
{
if(num>100)
{
System.out.println("invalid -1");
}
if(num>80&&num<=100)
{
System.out.println("Grade 1");
}
if(num>60&&num<=80)
{
System.out.println("Grade 2");
}
if(num>40&&num<=60)
{
System.out.println("Grade 3");
}
if(num>20&&num<=40)
{
System.out.println("Grade 4");
}
if(num>0&&num<=20)
{
System.out.println("Grade 5");
}
break;
}

return(0);
}

}
