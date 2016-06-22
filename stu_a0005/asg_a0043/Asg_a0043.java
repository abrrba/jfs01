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
