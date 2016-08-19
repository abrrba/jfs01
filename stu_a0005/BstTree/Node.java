class Node{
	 Node left;
	 Node right;
	 int key;

	public Node(){
		key = 0;
		left = null;
		right = null;
	}

	public Node(int n){
		left = null;
		right = null;
		key = n;

	}

	public void setLeft(Node l){
		left = l;
	}

	public void setRight(Node r){
		right = r;
	}

	public void setKey(int k){
		key = k;
	}

	public Node getLeft(){
		return left;
	}

	public Node getRight(){
		return right;
	}

	public int getKey(){
		return key;
	}

}
