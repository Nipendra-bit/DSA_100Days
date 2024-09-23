package mypack1;
class MinAndMaxElement
{
    public static void main(String[] args)
    {
        Integer arr[]={2,3,1,4,5,66,7,8,9};
        int ans1=maxElement(arr);
        int ans2=minElement(arr);
        System.out.println("max: "+ans1+" "+"min: "+ans2);
    }
    public static int maxElement(Integer arr[])
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static int minElement(Integer arr[])
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        return min;
    }
}