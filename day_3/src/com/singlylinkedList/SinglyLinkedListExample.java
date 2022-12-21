package com.singlylinkedList;

public class SinglyLinkedListExample {

	public static void main(String[] args) {
		Kite k1=new Kite("red","jack",50,true);
		Kite k2=new Kite("green","jane",60,true);
		Kite k3=new Kite("blue","john",80,true);
		Kite k4=new Kite("yellow","wick",45,true);
		Kite k5=new Kite("black","legend",50,true);
		Kite k6=new Kite("cion","camle",11,true);
		
        k1.next=k2;
        k2.next=k3;//k1.next.next=k3
        k3.next=k4;
        k4.next=k5;
        k5.next=k6;
		
//		System.out.println("k1:"+k1);
//		System.out.println("k2:"+k1.next);
//		System.out.println("k3:"+k2.next);
//		System.out.println("k4:"+k3.next);
//		System.out.println("k5:"+k4.next);
//		System.out.println("k6:"+k5.next);
		System.out.println("--------------------");
		System.out.println("k1 :"+k1.hashCode());//100
		System.out.println("k2 :"+k2.hashCode()); //200
		System.out.println("k3 :"+k3.hashCode());//300
		System.out.println("k4 :"+k4.hashCode());//400
		System.out.println("k5 :"+k5.hashCode());//500
		System.out.println("k6 :"+k6.hashCode());//600
		
		System.out.println("--------------------");
		
		System.out.println("k1.next (k2's address):"+k1.next.hashCode());//200
		System.out.println("k2.next :"+k2.next.hashCode()); //300
		System.out.println("k3.next :"+k3.next.hashCode()); //400
		System.out.println("k4.next :"+k4.next.hashCode()); //500
		System.out.println("k5.next :"+k5.next.hashCode()); //600
		//System.out.println("k6.next :"+k6.next.hashCode()); //null
		
		
	
		
	}

}

class Kite{
	String color;
	String owner;
	int length;
	boolean flying;
	Kite next;//self referential DS
	
	
	
	public Kite(String color, String owner, int length, boolean flying) {
		super();
		this.color = color;
		this.owner = owner;
		this.length = length;
		this.flying = flying;
	}

	@Override
	public String toString() {
		return "Kite [color=" + color + ", owner=" + owner + ", length=" + length + ", flying=" + flying + "\n \t next"+next+"]";
	}
	
	
	
	
	
}
