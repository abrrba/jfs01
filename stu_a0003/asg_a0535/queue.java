class queue

{

    protected ListNode front, rear;

    public int size;

 

   
    public queue()

    {

        front = null;

        rear = null;

        size = 0;

    }    

   

    public boolean isEmpty()

    {

        return front == null;

    }    

   
    public int getSize()

    {

        return size;

    }    

   
    public void insert(int data)

    {

        ListNode nptr = new ListNode(data);

        if (rear == null)

        {

            front = nptr;

            rear = nptr;

        }

        else

        {

            rear.setNext(nptr);

            rear = rear.getNext();

        }

        size++ ;

    }    

   
    public int remove()

    {

   
        ListNode ptr = front;

        front = ptr.getNext();        

        if (front == null)

            rear = null;

        size-- ;        

        return ptr.getData();

    }    

  
    public int peek()

    {
        return front.getData();

    }    

    public void display()

    {

        System.out.print("\nQueue = ");

        if (size == 0)

        {

            System.out.print("Empty\n");

            return ;

        }

        ListNode ptr = front;

        while (ptr != rear.getNext() )

        {

            System.out.print(ptr.getData()+" ");

            ptr = ptr.getNext();

        }

        System.out.println();        

    }

}
