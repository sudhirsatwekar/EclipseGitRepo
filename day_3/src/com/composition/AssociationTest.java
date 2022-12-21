package com.composition;

public class AssociationTest {
	public static void main(String[] args) {
		
	}
}




class Machine
{
	
}


class WashingMachine extends Machine //isA
{
	WashingTub theWashTub = new WashingTub(); //hasA
	
	
	
//producesA			//usesA    usesA    usesA       usesA
	Laundry wash(Cloth c, Water w, WashingPowder wp, Electricity e) {
		//code to refer c, w, wp , e
		Laundry theLaundry = new Laundry();
		//theLaundry methods invoked here...
		rinse();//rinse method called
		return theLaundry;
	}
	
	
	
	void rinse() {
		//login of rinse here...
		spin();//spin method called
	}
	void spin() {
		
	}
}



class Laundry { }
class Cloth { }
class Water { }
class WashingPowder { }
class Electricity { }

class Tub
{
	
}
class WashingTub extends Tub
{
	
}