package com.jumpElement;

import java.util.Arrays;

public class RotatedArrayTest {

	public static void main(String[] args) {
		int k=1;//rotating value for index
		int sourceArray[]= {1,2,3,4,5};
		
		for(int i=0;i<sourceArray.length;i++) {//printing array with for loop
			System.out.print(sourceArray[i]);
			System.out.print("  ");
		}
		
			
		System.out.println("\n"+ Arrays.toString(sourceArray));//printing array with Arrays API
		int ratatedArray[]=RotationTest.solution(sourceArray,k);
		
		System.out.println(Arrays.toString(ratatedArray));
		

	}
}
	
	
	class RotationTest{
		
		public static int[] solution(int sourceArray[],int k) {
			
		int targetArray[]=new int[sourceArray.length];//intializing targeted array
			for(int i=0;i<sourceArray.length;i++) {
			
			int rotatedIndex=(i+k)%sourceArray.length;//(0+1)%5
			targetArray[rotatedIndex]=sourceArray[i];
			
					}
			return targetArray;
		
		}
	}
		
	

