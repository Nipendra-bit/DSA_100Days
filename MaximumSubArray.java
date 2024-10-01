package mypack1;

public class MaximumSubArray {

	public static void main(String[] args) {
		
		Integer arr[]= {5,-4,-2,6,-1};
		int res=maxSubArray(arr);
		System.out.println(res);
	}
	public static int maxSubArray(Integer arr[])
	{
		int currSum=0;
		int maxSum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			currSum=currSum+arr[i];
			
			if(currSum>maxSum)
			{
				maxSum=currSum;
			}
			if(currSum<0)
			{
				currSum=0;
			}			
		}
		return maxSum;
	}
}

