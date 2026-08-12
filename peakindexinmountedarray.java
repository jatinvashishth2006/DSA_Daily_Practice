import java.util.*;
public class peakindexinmountedarray
{
    static int index(int[] arr)
    {
        int start =0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2; //find the middle element
            if(arr[mid]>arr[mid+1])
            {
               // you are in decreasing prt of the array so there may be a poosible
                // that the max element is mid or it will be present in the left side
                // of the mid
                end=mid ;
            }
            else {
                // this shows that you are in the ascending part of the array and
                // the max element will be lie in the right side of the mid
                start=mid+1;
            }
        }
        return start;// or end  because both start and end will point to max index
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<10;i++)
            {
            arr[i]=sc.nextInt();
            }
        int ans=index(arr);
        System.out.println(ans);
    }
}
