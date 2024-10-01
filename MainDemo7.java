class MainDemo7
{
	public static void main(String[] args)
	{
		Integer mat1[][]={
			{1,2,3},
				{4,5,6},
					{7,8,9}
		};
		Integer mat2[][]={
			{1,2,3},
				{4,5,6},
					{7,8,9}
		};
		check(mat1,mat2);
	}
	public static void check(Integer mat1[][],Integer mat2[][])
	{
		int a1=mat1.length;
		int b1=mat2.length;
		
		boolean res=true;
		
		if(a1==b1)
		{
			for(int i=0;i<mat1.length;i++)
			{
				for(int j=0;j<mat1.length;j++)
				{
					if(mat1[i][j]!=mat2[i][j])
					{
						res=false;
						break;
					}
				}
			}
		}
		else
		{
			res=false;
		}
		
		if(res==true)
		{
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}