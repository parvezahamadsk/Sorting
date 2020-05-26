/**
Date Created:     05/26/2020:
Author:           Parvez Ahamad Shaik
Time Complexity:  O(n^2)
Space Complexity: O(1)
Approach:         Iterative
Used:             When array is substantially sorted
Stable:           Yes
Inplace:          Yes
Online:           Yes
**/

import java.util.*;

class Program {
  public static int[] insertionSort(int[] arr) 
	{
   		for(int i=1;i<arr.length;i++)
			{
						int key = arr[i]; // element to be sorted exactly in its position
						int j = i-1;  // lastly sorted element position
						while(j>=0 && key<arr[j])
						{
							arr[j+1] = arr[j--];
						}
						arr[j+1] = key;
						
			}
    return arr;
  }
}
