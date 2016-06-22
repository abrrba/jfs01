 class Asg_a0043{
public static int numlen(int num){
int count=0;
while(num>0 || num<0){
num=num/10;
count=count+1;
}
return(count);
}
}
public class asg_a0043{
public static void main (String args[]){
Asg_a0043 temp=new Asg_a0043();
System.out.println(temp.numlen(-12345));
}
}

