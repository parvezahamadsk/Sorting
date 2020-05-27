
### Markdown
```markdown
 public static int[] insertionSort(int[] arr) 
     {
          for (int i = 1; i < arr.length; i++) 
          {
               int key = arr[i]; // element to be sorted exactly in its position
               int j = i - 1; // lastly sorted element position

               while (j >= 0 && key < arr[j]) {
                    arr[j + 1] = arr[j--];
               }
               arr[j + 1] = key;
          }
          return arr;
     }
     
---
### Markdown
Insertion Sort

Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.

It is called Insertion sort because we are picking an element from unsorted array and 
inserting it in appropriate location in the sorted array.

* If we have one element,its exactly in its position and it is sorted by default.
* Take first element from unsorted array (key) and compare it with the last element of sorted array.
* 'Key' holds first element of unsorted array, 'J' holds position of lastly sorted element.
* Compare key with each element in sorted array (from Position J to 0)
* At each iteration one element in unsorted array will be exactly in its position.
* At the end of Iteration, all elements are sorted

