package com.stackArray;

import java.util.Arrays;

public class StackTest {//in Array we cannot preserve element physically

	public static void main(String[] args) {
		
     MyStack theStack=new MyStack(5);
     theStack.push(10);
     theStack.push(20);
     theStack.push(20);
     theStack.push(20);
     theStack.push(20);
     
     theStack.pop();
     theStack.pop();
     theStack.pop();
     theStack.pop();
     theStack.pop();
     theStack.pop();
     theStack.pop();
     
	}

}


class MyStack{
	int size;
	//int top;
	int index=-1;
	int array[];//reference to int array
	
	MyStack(int size){//ctor to initialize the array
		this.size=size;
		array=new int[size];//allocating the size to array
			
	}
	
	void push(int item) {//add item to array
		System.out.println("Adding" +item+"to stack");
		if(index>size-2)//(-1>5-2)<<-1,0,1,2,3==5>>
			throw new MyStackOverflowException("Stack is overflown");
		//top=index;
		array[++index]=item;//0->10,1->20......1->30
	
	}
	
	
	int pop() {//remove item from stack
		//return array[top];
		System.out.println("Removing element");
		
		if(index<0)
			throw new MyStackEmptyException("stack is empty");
		
		return array[index--];//1 to 0->10,(20 deleted)
	}
	
	int peek() {
		
		return array[index];//1->30
		
	}	
		
	}

class MyStackOverflowException extends RuntimeException{

	public MyStackOverflowException(String string) {//ctor 
		super(string);
	}
	
}
class MyStackEmptyException extends RuntimeException{

	public MyStackEmptyException(String string) {
		super(string);
	}
	
	
}







