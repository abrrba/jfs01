class Node{
	 Node left;
	 Node right;
	 int Rno;
	 String name;

	public Node(){
		Rno = 0;
		name = null;
		left = null;
		right = null;
	}

		public Node(int n, String s){
		left = null;
		right = null;
		Rno = n;
		name = s;

	}

	public void setLeft(Node l){
		left = l;
	}

	public void setRight(Node r){
		right = r;
	}

	public void setRno(int k){
		Rno = k;
	}

	public Node getLeft(){
		return left;
	}

	public void setName (String s){
		name = s;
	}
	
	public String getName(){
		return name;
	}

	public Node getRight(){
		return right;
	}

	public int getRno(){
		return Rno;
	}

}
