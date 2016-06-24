class AsgA0280{
public static void main (String argv[])
{
int i,j,k,l;
for(i=1;i<7;i++){
	for(j=i;j<7;j++)
	{
	System.out.print("*");
	}
	
	for(k=(i-2);k>(1-i);k--)
	{
	System.out.print(" ");
	}
	for(l=6;l>=i;l--)
	{
	if(l<2)System.out.print("");
	else{System.out.print("*");}
	}
System.out.println("");
}
for(i=0;i<5;i++){
	for(j=i+1;j>=0;j--){
	System.out.print("*");
	}
	for(k=i;k<=(6-i);k++){
	System.out.print(" ");
	}
	for(l=0;l<=i+1;l++)
	{
	if(l>4)
	System.out.print("");
	else{System.out.print("*");}
	}
	
System.out.println(" ");
}
}
}
