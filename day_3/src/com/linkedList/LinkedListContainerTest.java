package com.linkedList;

public class LinkedListContainerTest {
	public static void main(String[] args) {
		Kite k1 = new Kite("Red","Jack",50,true);
		Kite k2 = new Kite("Green","Jane",60,true);
		Kite k3 = new Kite("Blue","John",80,true);
		Kite k4 = new Kite("Yellow","Julie",90,true);
		Kite k5 = new Kite("Black","Jim",75,true);
		
		MyLinkedList myList = new MyLinkedList();
		myList.showList();
		
		myList.add(k1);
		myList.add(k2);
		myList.add(k3);
		myList.add(k4);
		myList.add(k5);
		
		myList.showList();
		
		System.out.println("==================");
		
		Kite k6 = new Kite("White","Julie",175,true);
		
		myList.addAtBegining(k6);
		
		System.out.println("==================");
		myList.showList();

		myList.searchKiteByLength(180);
	}
}
class MyLinkedList
{
	Kite start,ptr,prev;

	void showList() {
		if(start==null) {
			System.out.println("List is empty");
		}
		else {
			System.out.println("List is not empty");
			ptr = start;
			while(ptr!=null) {
				System.out.println("DATA :"+ptr);
				ptr=ptr.next;
			}
		}
	}
	
	
	void searchKiteByLength(int lengthToSearch) {
		
		boolean found=false;
		
		if(start==null) {
			System.out.println("List is empty..nothing to search");
		}
		else {
			System.out.println("List is not empty...searching...");
			ptr = start;
			while(ptr!=null) {
				if(ptr.length == lengthToSearch) {
					System.out.println("Kite Found :"+ptr);
					found=true;
					break;
				}
				ptr=ptr.next;
			}
			if(found!=true) {
				System.out.println("Kite not found... of this length : "+lengthToSearch);
			}
		}
	}
	
	void addAtBegining(Kite newKite) {
		if(start!=null) {
			System.out.println("This kite is added at the beginning of the existing list of kites...");
			        newKite.next = start; 
					start = newKite;
		}
		else {
			System.out.println("You are the first kite..");
			start = newKite;
		}
	}
	
	void add(Kite newKite) { //200
		if(start==null) {
			System.out.println("Adding first node...");
			start = newKite;
			//start.next = null;
		}
		else {		
			System.out.println("Adding internal node...");
			ptr=start;
			while(ptr!=null) {
				System.out.println("Searching....");
				prev = ptr;
				ptr=ptr.next;
			}
			prev.next = newKite;
			newKite.next = null;
		}
	}
	
}


/*LinkedList myList1 = new LinkedList();

myList1.add(k1);
myList1.add(k2);
myList1.add(k3);
myList1.add(k4);
myList1.add(k5);

Iterator iter = myList1.iterator();
while(iter.hasNext()) {
	Kite k = (Kite) iter.next();
	System.out.println("k "+k);
}*/
