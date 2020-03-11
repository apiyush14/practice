package com.nexeas.sort;

class Node
{
	int data;
	Node next;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}

class LinkedList
{
	Node head;
    Node last;
    int size;
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}
	
	public void add(int data)
	{
		if(head==null)
		{
			head=new Node();
			head.setData(data);
			last=head;
			size++;
		}
		else
		{
			Node next=head;
			while(next.getNext()!=null)
			{
				next=next.getNext();
			}
			Node node=new Node();
			node.setData(data);
			next.setNext(node);
			last=node;
			size++;
		}
	}
	
	@Override
	public String toString() {
		String out="";
		Node node=head;
		while(node!=null)
		{
			out=out+node.getData()+":";
			node=node.getNext();
		}
		return out;
	}
}

public class QuickSortLinkedList {
 public static void main(String[] args)
 {
	 LinkedList list=new LinkedList();
	 list.add(45);
	 list.add(23);
	 list.add(4);
	 list.add(67);
	 list.add(22);
	 list.add(10);
	 list.add(2);
	 list.add(11);
	 System.out.println("List is : "+list);
	 list=quickSort(list);
	 System.out.println("Sorted list is : "+list);
 }

private static LinkedList quickSort(LinkedList list) {
	list=quickSortRec(list,list.getHead(),list.getLast());
	return list;
}

private static LinkedList quickSortRec(LinkedList list, Node start, Node end) {
	if(end!=start)
	{
		Node node=start;
		Node pivot=end;
		Node last=end;
		while(node.next!=end)
		{
			if(node.getData()>pivot.getData())
			{
				node.setNext(null);
				last.setNext(node);
			}
		}
	}
	return list;
}


}
