import java.util.*;
public class firstandlastoccurence
{

    static int[] find_elements(int[] arr, int target)
    {
        int[] ans={-1,-1};

        int start = search(arr,target,true);
        int end = search(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int search(int[] arr,int target,boolean findStartindex)
    {
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                ans=mid;
                if(findStartindex)
                {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("Input the elements in an array");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target");
        int target=sc.nextInt();
        int[] final_ans=find_elements(arr,target);
        System.out.println(Arrays.toString(final_ans));
    }
}
