
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

### Insertion Sort

Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.

It is called Insertion sort because we are picking an element from unsorted array and 
inserting it in appropriate location in the sorted array.

* If we have one element,its exactly in its position and it is sorted by default.
* Take first element from unsorted array (key) and compare it with the last element of sorted array.
* 'Key' holds first element of unsorted array, 'J' holds position of lastly sorted element.
* Compare key with each element in sorted array (from Position J to 0)
* At each iteration one element in unsorted array will be exactly in its position.
* At the end of Iteration, all elements are sorted


#### Stability 
Sort repeated elements in same order as they present in the input




## Welcome to GitHub Pages

You can use the [editor on GitHub](https://github.com/parvezahamadsk/Sorting/edit/master/README.md) to maintain and preview the content for your website in Markdown files.

Whenever you commit to this repository, GitHub Pages will run [Jekyll](https://jekyllrb.com/) to rebuild the pages in your site, from the content in your Markdown files.

### Markdown

Markdown is a lightweight and easy-to-use syntax for styling your writing. It includes conventions for

```markdown
Syntax highlighted code block

# Header 1
## Header 2
### Header 3

- Bulleted
- List

1. Numbered
2. List

**Bold** and _Italic_ and `Code` text

[Link](url) and ![Image](src)
```

For more details see [GitHub Flavored Markdown](https://guides.github.com/features/mastering-markdown/).

### Jekyll Themes

Your Pages site will use the layout and styles from the Jekyll theme you have selected in your [repository settings](https://github.com/parvezahamadsk/Sorting/settings). The name of this theme is saved in the Jekyll `_config.yml` configuration file.

### Support or Contact

Having trouble with Pages? Check out our [documentation](https://help.github.com/categories/github-pages-basics/) or [contact support](https://github.com/contact) and we’ll help you sort it out.
