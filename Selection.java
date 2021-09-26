class Selection{
    public static void main(String args[])
    {
        int arr[]={5,14,23,19,11};
        int temp,i,min,j;
        for(i=0;i<arr.length-1;i++)
        {
            min=i;
            for(j=i+1;j<=arr.length-1;j++)
            {
                if(arr[i]>arr[j])
                    min=j;
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
        for(i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}