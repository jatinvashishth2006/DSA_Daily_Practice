import java.util.*;
public class floornumber
{
    static int binary(int[] arr , int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(target==arr[mid])
            {
                return arr[mid];
            }
            else if (target<arr[mid])
            {
                end=mid-1;

            }
            else
            {
                start=mid+1;

            }
        }
        return arr[end];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter the elemnents in an array");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();
        int ans = binary(a,target);
        System.out.print(ans);
    }


}
