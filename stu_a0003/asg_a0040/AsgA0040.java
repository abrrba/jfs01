public class AsgA0040{
public static int find_five_digit_sum(int no)
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
