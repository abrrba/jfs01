class arrayStack
{
	int arr[];
	int top,size,len;

	public arrayStack(int n)
	{
		size=n;
		len=0;
		arr=new int[size];
		top=-1;
	}

	public boolean isEmpty()
	{
		return top==-1;
	}

	public boolean isFull()
	{
		return top==size-1;
	}

	public int getSize()
	{
		return len;
	}

	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("empty");
		}
		return arr[top];
	}


	public void push (int i)
	{
		if(top+1>=size)
		{
			//throw new IndexOutofBoundException("underflow exception");
		}
		if(top+1<size)
		{
			arr[++top]=i;
			len++;
		}
	}

	public int pop()
	{
		if(isEmpty())
		{
			//throw new NoSuchElementException("underflow exception");
		}
		len--;
		return arr[top--];
	}

	public void display()
	{
		if(len==0)
		{
			System.out.println("empty");
			return;
		}
		for(int i=top;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
}


