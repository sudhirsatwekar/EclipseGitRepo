package com.singlyPractice;

public class SinglyPractice {

	public static void main(String[] args) {
		Date d1=new Date(10,2005);
		Date d2=new Date(11,2007);
		Date d3=new Date(12,2008);
		Date d4=new Date(13,2009);
		Date d5=new Date(14,2010);
		
		Mydate slll=new Mydate();
		slll.show();
		
		slll.Add(d1);
		slll.Add(d2);
		slll.Add(d3);
		slll.Add(d4);
		
		
		slll.show();
		System.out.println("=====================================");
		slll.AddAtFirst(d5);
		slll.show();
		System.out.println("======================================");
		
		slll.searchDateByDay(12);
		slll.show();
		System.out.println("========================================");
		slll.ModifyYear(2008);
		slll.show();
        System.out.println("========================================");
        
        slll.deleteDate(d3);
        slll.show();
        System.out.println("========================================");
        
	}

}



class Mydate{
	
	Date start;
	Date ptr,prev;
	
	
	void show() {
		if(start==null) {
			
			System.out.println("List is empty");
		}
		else {
			ptr=start;
			while(ptr!=null) {
				System.out.println("DATA:"+ptr);
				ptr=ptr.next;
				
				
			}
			
		}
		
	}
	
	void Add(Date newDate) {
		
		if(start==null) {
		System.out.println("Adding First node........");
		start=newDate;
	}
		else {
			ptr=start;
			System.out.println("Internal node added.....");
			while(ptr!=null) {
				prev=ptr;
				ptr=ptr.next;
					
			}
			prev.next=newDate;	
			
		}	
	
}
	
	void AddAtFirst(Date newDate) {
		if(start!=null) {
			System.out.println("This Date added at biginning");
			newDate.next=start;
			start=newDate;
		}
		else {
			
			start=newDate;
		}	
	}
	
	
	void searchDateByDay(int DaytoSearch) {
		boolean found=false;
		if(start==null) {
			System.out.println("List is empty..Nothing to search");
			
		}
		else {
			System.out.println("List is not empty..searching....");
			ptr=start;
			while(ptr!=null) {
				if(ptr.day==DaytoSearch) {
					System.out.println("Day found"+ptr);
					found=true;
					break;
				}
				ptr=ptr.next;
			}
			if(found!=true) {
				
				System.out.println("Day of date"+DaytoSearch+" not found");
			}
		}	
	}
	

	
	void ModifyYear(int yearToModified) {
		
		if(start==null) {
			System.out.println("List is empty..Nothing to search");
			
		}
		else {
			System.out.println("List is not empty..searching....");
			ptr=start;
			while(ptr!=null) {
				if(ptr.year==yearToModified) {
					ptr.year=2015;
					System.out.println("modified year is"+ptr);
					
					break;
				}
				ptr=ptr.next;
			}
}


	}
	
	
	
	void deleteDate(Date dateToDelete) {
		
		boolean found=false;
		if(start==null) {
			
			System.out.println("list is Empty");
		}
		else if(start==dateToDelete) {
			prev=start;
			start=start.next;
			prev.next=null;
			System.out.println("Deleted date from first"+ptr);
			
		}
		else {
			ptr=start;
			while(ptr!=null) {
				if(ptr==dateToDelete) {
					
					found=true;
					break;
				}
				
			}
			prev=ptr;
			ptr=ptr.next;
			
		}
		if(found==true) {
			
			prev.next=ptr.next;
			System.out.println("Internal Object deleted...by Date reference.");
		    ptr.next=null;
		    ptr=null;
		}
		else {
			System.out.println("Day not found");
		}
		
	}
	


}










class Date{
	int day;
	int year;
	Date next;//self referential DS
	
	
	public Date(int day, int year) {
		super();
		this.day = day;
		this.year = year;
	}
	
	
	@Override
	public String toString() {
		return "Date [day=" + day + ", year=" + year + ", next=" + next + "]";
	}
	
	
	
	
}
