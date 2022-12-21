package com.queueArray;



public class QuestTest {

	public static void main(String[] args) {
		MyQueue mq=new MyQueue(5);
		mq.add(10);
		mq.add(20);
//		mq.add(30);
//		mq.add(40);
//		mq.add(50);
	   // mq.add(60);

		mq.remove();
//		mq.remove();
//		mq.remove();
//		mq.remove();
//		mq.remove();
//		mq.remove();
		
		
		
	}

}

class MyQueue{
	
	int length;
	int array[];
	int index=-1;
	int front=-1;
	
	MyQueue(int length){
		this.length=length;
		array=new int[length];//declaring an array
	}
	
	
	void add(int item) {
		
		if(index>length-2)//-1>5-2...0>5-2..1>5-2...2>5-2..
			throw new QueueFullException("Queue is full please remove one Element");
		
		
		array[++index]=item;//++ -1    ->0
		                    //++ 0     ->1
		                    //++ 1     ->2
		                    //++ 2     ->3
		      System.out.println("added   "+  item  +"  at index"+index);             
	
	}
	
	
	int remove() {
		
		if(front>index-1)
			throw new QueueEmptyException("Queue is empty please add element");
		 System.out.println("removed index:"+index); 
		return array[++front];             //++ -1->0
		
	}
	
	
}
class QueueFullException extends RuntimeException{
	
	QueueFullException(String string){
		super(string);
	}
	
}
class QueueEmptyException extends RuntimeException{
	
	QueueEmptyException(String string){
		super(string);
	}
	
}
