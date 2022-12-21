package example.array;

import java.util.ArrayList;

public class BinaryGap {

	public static void main(String[] args) {
//	 String s=Integer.toBinaryString(8);
//	 System.out.println(s);
//	 ArrayList as=new ArrayList();
//	 as.add(s);
//	 System.out.println(as);
		
		
		
	int a = Solution.solveThis(1041);
	System.out.println(a);
	 
	}
	
	class Solution{
		
		public static int solveThis(int N)
		{
			String binaryRepresentation=Integer.toBinaryString(N);
			System.out.println(N+":Binary:"+binaryRepresentation);
			
			
			
			ArrayList<Integer> onceList =new ArrayList<Integer>();
			for(int i=0;i<binaryRepresentation.length();i++)
			{
				if(binaryRepresentation.charAt(i)=='0')
					continue;
		   
			onceList.add(i);//added in arrayList
			}
			//0 6 10-->index in arraylist with value 1
			int gap = 0;
			for(int i=0;i<onceList.size() - 1;i++)
			{
				int indexdiff=onceList.get(i+1)-onceList.get(i)-1;//at first-->{(6)-0-1}=5
				                                                  //at second-->{(10)-6-1}=3
				
			    gap =Math.max(gap, indexdiff);//at first-->max of o and 5
			                                  //at second-->max of 5 and 3
		
			}
			
			return gap;//returns 5
	
		}

	}
}
