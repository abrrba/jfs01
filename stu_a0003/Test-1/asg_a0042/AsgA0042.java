public class AsgA0042{
	public static int rotate_n(int b){
		int post,pre,k,l;
		int num=12345;
		int c=5-b;
		double d =Math.pow(10,c);
		double e =Math.pow(10,b);
		int f = (int)e;
		int p =(int)d;
		post=num/p;
		pre=num%p;
		l=pre*f;	
		return(post+l);
	}
}
