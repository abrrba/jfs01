public class AsgA0011{
public static int sum_of_digits(int no)
{
int i=0;
int j=0;
if(no<0)
{
no=-(no);
}
while(no>0)
{
i=no%10;
j=j+i;
no=no/10;
}
return(j);
}
} 
