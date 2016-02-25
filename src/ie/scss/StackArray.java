package ie.scss;

package part1.StacknQueuesGenerics;
import java.util.Iterator;

/*
 * 
 * implementation of the stack functionality with the generics framework
 * as well with the able to parse through the items using an iterator
 */
public class StackArray<Item> implements Iterable<Item>{

	private int N;
	private Item[] s;
	
	public StackArray(int capacity)
	{
		s = (Item[]) (new Object[capacity]);
	}
	
	public boolean isEmpty()
	{
		return N==0;
	}
	
	public void push(Item val)
	{
		s[N++]=val;
	}
	
	public Item pop()
	{
		Item del = s[--N];
		s[N] = null;
		return del;
	}
	
	//methods for the Iterable interface
	
	public Iterator<Item> iterator()
	{
		return new ArrayIterator();
	}
	
	
	private class ArrayIterator implements Iterator<Item>
	{
		private int i = N;
		
		public boolean hasNext()
		{
			return i > 0 ;
		}
		
		public Item next()
		{
			return s[--i];
		}
	}

}
