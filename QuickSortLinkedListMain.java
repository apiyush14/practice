package com.nexeas.sorting;

class Node
{
	Node next;
	int data;
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
}

class LinkedList
{
	Node head;
	Node tail;
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
	public Node getTail() {
		return tail;
	}
	public void setTail(Node tail) {
		this.tail = tail;
	}
	
	public void add(int data)
	{
		if(head==null)
		{
			Node node=new Node();
			node.setData(data);
			this.setHead(node);
			this.setTail(node);
		}
		else
		{
			Node node=this.getHead();
			while(node.getNext()!=null)
			{
				node=node.getNext();
			}
			Node newNode=new Node();
			newNode.setData(data);
			node.setNext(newNode);
			this.setTail(newNode);
		}
	}
	
	@Override
	public String toString() {
		String out="";
		Node node=this.getHead();
		while(node!=null)
		{
			out=out+node.getData()+":";
			node=node.getNext();
		}
		return out;
	}
}

public class QuickSortLinkedListMain {

	public static void main(String[] args) {
	  LinkedList list=new LinkedList();
	  list.add(40);
	  list.add(20);
	  list.add(60);
	  list.add(10);
	  list.add(50);
	  list.add(30);
      System.out.println("List is : "+list);
      list=quickSortList(list);
      System.out.println("Sorted list is : "+list);
	}

	private static LinkedList quickSortList(LinkedList list) {
		list=quickSortRec(list,list.getHead(),list.getTail());
		return list;
	}

	private static LinkedList quickSortRec(LinkedList list, Node head, Node tail) {
		if (head != null && tail != null && head != tail) {
			Node pivot = tail;
			Node current = head;
			Node prev = null;
			Node last = tail;
			Node start = head;
			while (current != pivot) {
				if (current.getData() > pivot.getData()) {
					if (current == list.getHead()) {
						list.setHead(current.getNext());
					}
					if (current == head) {
						start = current.getNext();
					}
					if(prev!=null)
					{
					prev.setNext(current.getNext());
					}
					Node newNode = new Node();
					newNode.setData(current.getData());

					if (last.getNext() == null) {
						list.setTail(newNode);
					}
					if (last.getNext() != null) {
						newNode.setNext(last.getNext());
					}
					last.setNext(newNode);
					last = newNode;
				} else {
					prev = current;
				}
				current = current.getNext();
			}
			quickSortRec(list, start, prev);
			quickSortRec(list, pivot.getNext(), last);
		}
		return list;
	}
}
