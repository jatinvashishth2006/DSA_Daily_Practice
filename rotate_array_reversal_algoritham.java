import java.util.*;
public class rotate_array_reversal_algoritham
{
     public  void rotate(int[] nums, int k)
     {
        int n = nums.length;
        k = k % n; // Handle cases where k is greater than array length

        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);
        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Step 3: Reverse the remaining n - k elements
        reverse(nums, k, n - 1);
    }

    static  void reverse(int[] nums, int start, int end)
    {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k");
        int k = sc.nextInt();

        rotate_array_reversal_algoritham obj = new rotate_array_reversal_algoritham();
        obj.rotate(arr, k);
        System.out.println("Rotated array:");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

}
