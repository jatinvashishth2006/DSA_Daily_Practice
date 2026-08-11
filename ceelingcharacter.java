import java.util.*;
public class ceelingcharacter
{
    static char character(char[] letter , char target)
    {
        int n=letter.length;
         int start=0;
         int end=letter.length-1;
         while(start<=end)
         {
             int mid=(start+end)/2;

             if(target<letter[mid])
             {
                 end=mid-1;
             }
             else
             {
                 start=mid+1;
             }
         }
         return letter[start%n];
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char[] a=new char[5];
        System.out.println("Enter the character in array");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.next().charAt(0);
        }
        System.out.println("Enter the target");
        char target=sc.next().charAt(0);
        char ans=character(a,target);
        System.out.println("The final answere is = "+ans);

    }
}

