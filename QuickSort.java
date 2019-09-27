
public class QuickSort implements SortingAlgorithm
{

	public void sort(int [] a)
	{
		int low = 0;
		int high = a.length - 1;
		//calls recursive method to sort from start to end of array a
		sort(a,low,high);
	}

	int partition(int a[], int low, int high) 
    { 
    	//sets pivot as last element
        int pivot = a[high];

        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than the pivot 
            if (a[j] < pivot) 
            { 
                i++; 
                // swap a[i] and a[j] using temp 
                int temp = a[i]; 
                a[i] = a[j]; 
                a[j] = temp; 
            } 
        } 
  
        // swap a[i+1] and a[high] using temp 
        int temp = a[i+1]; 
        a[i+1] = a[high]; 
        a[high] = temp; 
  
        return i+1; 
    } 
	
	public void sort(int [] a,int low, int high)
	{
		if (low < high) 
        { 
            int p = partition(a, low, high); 
            sort(a, low, p-1); 
            sort(a, p+1, high); 
        } 
	}

}