class Node{
	int roll,mark;
	String name;
	String clas;
	Node left,right;
	Node(){
		roll = 0;
		mark = 0;
		clas = null;
		name = null;
		left = null;
		right = null;
	}
	Node(int r,int m, String n, String c){
		roll = r;
		mark = m;
		clas = c;
		name = n;
		left = null;
		right = null; 
	}
}
