/**
Date Created: 05/26/2020:
Author: Parvez Ahamad Shaik
Time Complexity: O(n*logn)
Space Complexity: O(n*logn)
**/

import java.util.*;

class MergeSort {
  public static int[] mergeSort(int[] array) {
    if(array.length<=1){
				return array;
		}
		int midIndex = array.length / 2;
		int leftArray[] = Arrays.copyOfRange(array,0,midIndex);
		int rightArray[] = Arrays.copyOfRange(array,midIndex,array.length);
    return merge( mergeSort(leftArray), mergeSort(rightArray) ) ;
  }
	
	private static int[] merge(int leftArray[], int rightArray[])
	{
			int sortedArray[] = new int[leftArray.length + rightArray.length];
		  int lPosition = 0; // tracks last sorted left Array position
			int rPosition = 0; // tracks last sorted left Array position
		  int sPosition = 0; // tracks no of elements sorted
		  
			while( lPosition<leftArray.length && rPosition <rightArray.length )
			{
					if(leftArray[lPosition]<rightArray[rPosition]){
							sortedArray[sPosition++] = leftArray[lPosition++];
					}
					else{
						  sortedArray[sPosition++] = rightArray[rPosition++];
					}
			}
		  
			if(lPosition<leftArray.length)
			{
					while(lPosition<leftArray.length)
					{
							sortedArray[sPosition++] = leftArray[lPosition++];
					}	
			}
		  else	
		  {
				while(rPosition<rightArray.length)
					{
							sortedArray[sPosition++] = rightArray[rPosition++];
					}	
		  }
		  return sortedArray;
	}
	
	
}
