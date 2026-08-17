import java.util.*;
public class binary_search_in_matrix
{
    static int[] search(int[][] arr, int target) // function to search the element
    {
        int first = 0;
        int last = arr[0].length - 1;

        while (first < arr.length && last >= 0)
        {
             // Here we use the concept of minimizing the space of an array
            if (target == arr[first][last])
            {
                return new int[]{first, last};
            }
            else if (target > arr[first][last])
            {
                first++;
            }
            else
            {
                last--;
            }
        }

        return new int[]{-1, -1};
    }
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the target element:");
        int target = sc.nextInt();
        System.out.println(Arrays.toString(search(arr, target)));

    }
}
