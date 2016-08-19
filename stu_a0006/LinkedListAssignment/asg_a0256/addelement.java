import java.util.*;
class addelement
{
public static void main(String args[])
{
LinkedList x=new LinkedList();
x.add("abhijeet"); //adding the element to linked list named with x 
x.add("gite");
x.add(1,"ram");

//-------------------------------------------------------------------
//x.addFirst("hello");//adding the element to the first position in linked list
//x.addLast("hello"); //adding the element to the last position in linked list

//-------------------------------------------------------------------
//System.out.println(x.contains("ram"));
//this function return true if particular element is present in linked listi

//-------------------------------------------------------------------
//creating the collections for merging operation
Collection coll=new ArrayList();
coll.add("hey");
coll.add("there");


//-------------------------------------------------------------------
x.addAll(coll);//merging the element at last 
//x.addAll(1,coll); // Merging the two collections at specifies positions


//---------------------------------------------------------------------
/* THIS CODE IS FOR REVERSING THE LINKED LIST
Iterator et=x.descendingIterator();
while(et.hasNext())
{
System.out.println(et.next());
}
*/

//-------------------------------------------------------------------- 

//System.out.println(x.element());//this code is use for printing head
//System.out.println(x.get(2));//to get the element at paticular index
System.out.println(x.getFirst());
System.out.println(x.getLast());
System.out.println(x.indexOf("hey"));//returnsindex of element from 1st occuran
System.out.println(x.lastIndexOf("hey"));//from last occuring
x.offer(4);//adding the element at last
x.offerFirst(0);//adding the element at first
x.offerLast(0);//adding the element at lastt
System.out.println(x);
//--------------------------------------------------------------------

//System.out.println(x.peek());//retrieving head element
//System.out.println(x.peekFirst());//retreiving the first element
//System.out.println(x.peekLast());//retrieving the last element

//----------------------------------------------------------------------
//System.out.println(x.poll());//removes the head element
//System.out.println(x.pollFirst());//removes the first element
//System.out.println(x.pollLast());//removes the last element
//System.out.println(x.pop());//popping out first element
x.push("shruti");//pushing elementin stack
//---------------------------------------------------------------

//x.remove(2);//removes the  element from linkedlist by specified index
//x.remove("shruti");//removes the spscified element by name
//x.removeLast();//removes the last element from list

//-------------------------------------------------------------------

x.set(1,"bhau");//replacing the element of position
System.out.println(x.size());//returns the size of linked list
System.out.println(x);

//------------------------------------------------------------------
//converting the linked list into array
Object[] array=x.toArray();
for(int i=0;i<x.size();i++)
{
System.out.println(array[i]);
}

//------------------------------------------------------------------



}
}
