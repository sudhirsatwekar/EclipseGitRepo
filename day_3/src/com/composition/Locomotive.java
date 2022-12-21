package com.composition;

public class Locomotive {

	public static void main(String[] args) {
		

	}

}

class Railway extends Locomotive{//is a
     
	class Engine extends Railway{
	 //prodeces a      //uses a
	     Power run(fuel f,air a,sleeper s) {//'has a' and 'uses a'
		 Power HP=new Power();//power methods and atributes are invoked here
		
		
		 return HP;	
	}
	
	}
	
	
	
}


class fuel{}
class air{}
class sleeper{}

class T{
	
}


class Power extends T{
	
}