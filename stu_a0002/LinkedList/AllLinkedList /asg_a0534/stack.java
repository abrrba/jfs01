class stack
{
private int size;
private ListNode top;

stack()
{
top=null;
size=0;
}

public boolean isEmpty()
{
return top== null;
}

public int getSize()
{
return size;
}

public void push(int data)
{
ListNode temp=new ListNode(data);
if(top==null)
{
top=temp;
}
else
{
temp.setNext(top);
top=temp;
}
size ++;
}

    public int pop()

    {

        

        ListNode ptr = top;

        top = ptr.getNext();

        size-- ;

        return ptr.getData();

    }    


    public void display()

    {

        System.out.print("\nStack elements = ");

        if (size == 0) 

        {

            System.out.print("Empty\n");

            return ;

        }

        ListNode ptr = top;

        while (ptr != null)

        {

            System.out.print(ptr.getData()+" ");

            ptr = ptr.getNext();

        }

        System.out.println();        

    }

}
