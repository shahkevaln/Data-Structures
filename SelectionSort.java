
 class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort ss=new SelectionSort();
int array[]= {3,6,2,9,1,5};
ss.selectionSort(array);

ss.printArray(array);
	}

void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }
	
void selectionSort(int arr[])
{
    int n = arr.length;

    // One by one move boundary of unsorted subarray
    for (int i =0; i<n-1; i++)
    {
        // Find the minimum element in unsorted array
        int min = i;
        for (int j = i+1; j < n; j++) {
            if (arr[j] < arr[min])
                min = j;
        }
        // Swap the found minimum element with the first
        // element
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }
}

}



