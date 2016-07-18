class AsgA0130
{
public static int gr(int num)
{
while(num>0)
{
if(num>100)
{
return(-1 );
}
if(num>80&&num<=100)
{
return(1);
}
if(num>60&&num<=80)
{
return(2);
}
if(num>40&&num<=60)
{
return(3);
}
if(num>20&&num<=40)
{
return(4);
}
if(num>0&&num<=20)
{
return(5);
}
break;
}

return(0);
}

}
