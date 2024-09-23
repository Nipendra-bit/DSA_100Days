package mypack1;

public class ReverseArray {

	public static void main(String[] args) {

		Integer arr[]= {1,2,3,4,5,6,7,8,9};
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
