package example.array;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListFinal {

	public static void main(String[] args) {
		
		//int score[]= {10,2,030,40,50};
		
//		int score[]=new int[6];
//		score[0]=10;
//		score[1]=20;
//		score[2]=30;
//		score[3]=40;
//		score[4]=50;
//		for(int i=0;i<score.length;i++)
//		{
//			System.out.println(score[i]);
//		}
		
		//ArrayLIst
		
		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add("sudhir");
		ar.add(100);
		ar.add('a');
		ar.remove(0);
		System.out.println(ar);
		
		HashSet hs=new HashSet();
		hs.add(100);
		hs.add("sudhir");
		hs.add(100);//in set repeted not allowed 
		hs.add('a');
		hs.add('b');
		System.out.println(hs);
		
		

		
	}

}
