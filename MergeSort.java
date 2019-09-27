
public class MergeSort implements SortingAlgorithm
{

	public void sort(int [] a)
	{
		//helper method to call the recursive method
		int l = 0;
		int r = a.length - 1;
		//calls sort function to sort from 0 to a.length-1
		sort(a,new int[a.length],l,r);

	}

	public void mergeHalves(int a[], int[] temp,int ls, int re) 
    { 

    	int le = (re + ls) / 2;//left End
    	int rs = le + 1;//right Start
    	int size = re - ls + 1;// Size of array

    	int left = ls;
    	int right = rs;
    	int index = ls;


    	while(left <= le && right <= re)
    	{
    		//if element is of leftstart is less than or equal to rightstart,
    		//then set temp[index] to value of leftstart
    		if(a[left] <= a[right])
    		{
    			temp[index] = a[left];
    			left++;
    		}
    		//else set temp[index] to value of rightstart
    		else
    		{
    			temp[index] = a[right];
    			right++;
    		}
    		//increment index to add values to temp
    		index++;
    	}
    	//copies all the left elements into temp
    	//copies all the right elements into temp
    	//copies everything from temp back into array a
    	System.arraycopy(a,left,temp,index,le-left+1);
    	System.arraycopy(a,right,temp,index,re-right+1);
    	System.arraycopy(temp,ls,a,ls,size);
        
    } 

	public void sort(int [] a, int [] temp, int ls, int re) 
    { 
        if (ls >= re)
        {
        	return;
        } 

        int mid = (ls + re) / 2;
        //sorts from first to middle element
        sort(a,temp,ls,mid);
        //sorts from element after middle to last element
        sort(a,temp,mid+1,re);
        //merges both the left and right half into temp array
        mergeHalves(a,temp,ls,re);
        
      
    } 
	
}