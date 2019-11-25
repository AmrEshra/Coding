package Numbers;


public class GetDublicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int arr[] = {6,4,1,4,3,2,5,2,1};

		getDuplicate(arr, arr.length);
		
		for(int i=0; i<arr.length; i++)
			System.out.println(i+1 + " Frequency = " + arr[i]*-1);


	}

	public static void getDuplicate(int arr[],int size)
	{
	    int pos = 0;
	    int desiredPos = 0;
	    while(pos < size)
	    {
	        if(arr[pos] <= 0)
	        {
	            pos++;
	            continue;
	        }
	        desiredPos = arr[pos] -1;
	        if(arr[desiredPos] > 0)
	        {
	            arr[pos] = arr[desiredPos];
	            arr[desiredPos] = -1;
	        }
	        else
	        {
	            arr[desiredPos]--;
	            arr[pos] = 0;
	            pos++;
	        }
	    }
	}
}
