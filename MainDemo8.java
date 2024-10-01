class MainDemo8
{
	public static void main(String[] args)
	{
		Integer arr[][]={
			{1,4,4},
				{2,3,7},
					{0,5,1}
		};
		func(arr);
	}
	public static void func(Integer arr[][])
	{
		int trace=0;
		int normal=0;
		int pro=0;
		int sum=0;
		double res=0.0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i==j)
				{
					trace=trace+arr[i][j];
				}
			}
		}
		System.out.println("Trace: "+trace);
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				normal=arr[i][j];
			    pro=normal*normal;
				sum=sum+pro;
			}
		}
		res=Math.sqrt(sum);
		System.out.println("Normal: "+res);
	}
}