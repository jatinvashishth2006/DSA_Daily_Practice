import java.util.*;
public class rain_water_trapping
{
    static int trap(int[] arr)
    {
        int left=0;
        int right=arr.length-1;
        int ans=0;
        int leftmax=0;
        int rightmax=0;
        while(left<right)
        {
            if(arr[left]<arr[right])
            {
                if(arr[left]>=leftmax)
                {
                    leftmax=arr[left];
                }
                else
                {
                    ans+=leftmax-arr[left];
                }
                left++;
            }
            else {
                if(arr[right]>=rightmax)
                {
                    rightmax=arr[right];
                }
                else
                {
                    ans+=rightmax-arr[right];
                }
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans=trap(arr);
        System.out.println(ans);
    }
}
