package com.jumpElement;

import java.util.Arrays;

public class JumpByN {

	public static void main(String[] args) {
		int k=1;
		int sourceArray[]= {1,2,3,4,5};
		System.out.println(Arrays.toString(sourceArray));//printed source array
		int targetArray[]=new int[sourceArray.length];//declaring targeted array with length of source array
		
		for(int i=0;i<sourceArray.length;i++)
		{
			int rotatedIndex=(i+k)%sourceArray.length;//
			
			
			 targetArray[rotatedIndex]=sourceArray[i];
			
		}
		System.out.println(Arrays.toString(targetArray));

	}

}
