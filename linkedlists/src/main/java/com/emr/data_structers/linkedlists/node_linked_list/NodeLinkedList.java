package com.emr.data_structers.linkedlists.node_linked_list;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class NodeLinkedList <E>{

	NodeClass<E> first;
	NodeClass<E> last;
	
	
	void addLast(E e){
		NodeClass<E> node=new NodeClass<E>();
		node.setItem(e);
		
		addToLast(node);
	}
	
	
	void addFirst(E e){
		NodeClass<E> node=new NodeClass<E>();
		node.setItem(e);
		
		addToFirst(node);
	}
	
	
	void removeFirst() {
		first=first.next;
	}
	
	
	private void addToLast(NodeClass<E> toBeAdded){
		if(first==null) {
			first=toBeAdded;
			last=toBeAdded;
		}else {
			last.next=toBeAdded;
			last=toBeAdded;
		}
	}
	
	
	private void addToFirst(NodeClass<E> toBeAdded){
		if(first==null) {
			first=toBeAdded;
			last=toBeAdded;
		}else {
			toBeAdded.next=first;
			first=toBeAdded;
		}
	}
	

	public E getFirst(){
		return first.getItem();
	}
	
	
	public int count() {
		NodeClass<E> firstItem=first;
		int counter=1;
		
		if (first!=null) {
			while (firstItem.hasNext()) {
				counter++;
				firstItem=firstItem.getNext();
			}
			return counter;
		}else
			return 0;
	}
	
	
	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	class NodeClass<Node>{
		Node item;
		NodeClass <Node> prev;
		NodeClass <Node> next;
		
		boolean hasNext() {
			return (next!=null);
		}
		
		boolean hasPrev() {
			return (prev!=null);
		}
	}
}
