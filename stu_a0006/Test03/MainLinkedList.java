class MainLinkedList
{
public static void main(String agr[])
{
LinkedList c=new LinkedList();
LinkedList x=new LinkedList();
LinkedList a=new LinkedList();
LinkedList b=new LinkedList();
x.addAtSortedAcc(18);
x.addAtSortedAcc(9);
x.addAtSortedAcc(72);
x.addAtSortedAcc(50);
a.addAtSortedAcc(78);
a.addAtSortedAcc(40);
a.addAtSortedAcc(34);
a.addAtSortedAcc(12);
c.addAtmiddel(1,0);
c.addAtmiddel(2,0);
c.addAtmiddel(3,1);
c.addAtmiddel(4,1);
c.addAtmiddel(5,2);
c.addAtmiddel(6,2);
x.printAll();
c.printAll();

for(int i=0;i<4;i++)
{
b.addAthead(a.delFromhead());
}
b.printAll();

}
}
