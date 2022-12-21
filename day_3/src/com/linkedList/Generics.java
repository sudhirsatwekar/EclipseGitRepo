package com.linkedList;

public class Generics {

	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		
		Emp<Integer> e=new Emp<Integer>(2,3);
		Emp<Float> e1=new Emp<Float>(2f,3f);
		Emp<Double> e2=new Emp<Double>(2.3,3.4);
		int p=e.fun();
		float q=e1.fun();
		double r=e2.fun();
		System.out.println(p+"    "+q+"   "+r);
	}

}


class Emp<T>{
	
	

T a;
T b;

public Emp(T a, T b) {
	super();
	this.a = a;
	this.b = b;
}
public T fun()
{
	return a;
	
}
}