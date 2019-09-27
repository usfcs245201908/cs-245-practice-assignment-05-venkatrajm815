
public class InsertionSort implements SortingAlgorithm
{

	public void sort(int [] a)
	{
		int n = a.length; 
        for (int i = 1; i < n; ++i) 
        { 
            int key = a[i]; 
            int j = i - 1; 
  
            /* This moves all the elements that are greater than key to one position ahead 
               of their current position */
            while (j >= 0 && a[j] > key) 
            { 
                a[j + 1] = a[j]; 
                j = j - 1; 
            } 
            a[j + 1] = key; 
        } 
	}
	
}