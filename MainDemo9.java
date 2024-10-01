class MainDemo9
{
	public static void main(String[] args)
	{
		Integer arr[]={1,2,3,4,5,6,7};
		int d=2;
		rotate(arr,d);
	}
	public static void rotate(Integer arr[],int d)
	{
		int n=arr.length;
		
		Integer temp[]=new Integer[n];
		
		int k=0;
		
		for(int i=d;i<n;i++)
		{
			temp[k]=arr[i];
			k++;
		}
		for(int i=0;i<d;i++)
		{
			temp[k]=arr[i];
			k++;
		}
		for(int i=0;i<n;i++)
		{
			arr[i]=temp[i];
		}
		System.out.println("Rotated array: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}