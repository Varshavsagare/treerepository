package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_Set_eg 
{
public static void main(String[] args) 
{
TreeSet<Integer> tr=new TreeSet<Integer>();
int i[]= {1,2,3,4,5,6,7,8,9,10};
for(Integer in:i)
{
	tr.add(in);
}
Iterator<Integer> it=tr.iterator();
System.out.println("Ascending data==");
while(it.hasNext())
{
		System.out.print(it.next()+ "  ");
}
System.out.println("\nDscending data== ");

Iterator it2=tr.descendingIterator();

while(it2.hasNext())
{
	
	System.out.print(it2.next()+ " ");
}









}
}
