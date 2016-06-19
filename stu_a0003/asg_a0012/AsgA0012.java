public class AsgA0012{
public static int product_of_digits(int no)
{
int i=1;
int j=1;
if(no<0)
{
no=-(no);
}
while(no>1)
{
i=no%10;
j=j*i;
no=no/10;
}
return(j);
}
} 
