package sjb.dsa;

public class Stack{
	private int[] array;
	private int size;
	private int top;
	public Stack(int size) {
		this.size = size;
		array=new int[size];
		top=-1;
	}
	public boolean isFull()
	{
		return (top==size-1);
	}
	public boolean isEmpty()
	{
		return (top==-1);
	}
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("empty");
			return -1;
		}
		else {
			return array[top];
		}
	}
	public void push(int item)
	{
		if(isFull())
		{
			System.out.println("Stack is full");
			return;
		}
		else {
		array[++top]=item;  //pre-incrementing top to push element
		}
	}
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Empty");
			return -1;
		}
		else {
			int item=array[top--];
			return array[top];
		}
	}
	public void display()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.println(array[i]);
		}
	}
}