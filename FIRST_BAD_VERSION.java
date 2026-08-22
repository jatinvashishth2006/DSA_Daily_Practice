
class VersionControl
{
    // This value stores the actual first bad version for testing purposes
    private static final int MOCK_FIRST_BAD_VERSION = 4;

    // The API provided by LeetCode's parent class
    protected boolean isBadVersion(int version)
    {
        return version >= MOCK_FIRST_BAD_VERSION;
    }
}


public class FIRST_BAD_VERSION extends VersionControl
{
    public int firstBadVersion(int n)
    {
        int left = 1;
        int right = n;

        while (left < right)
        {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid))
            {
                right = mid;
            }
            else
            {
                left = mid + 1;
            }
        }
        return left;
    }

    // MAIN FUNCTION TO EXECUTE THE SOLUTION
    public static void main(String[] args) {
        // Instantiate using the new class name
        FIRST_BAD_VERSION solver = new FIRST_BAD_VERSION();

        // Define total versions to look through
        int totalVersions = 10;

        // Call the binary search function
        int result = solver.firstBadVersion(totalVersions);

        // Display the output
        System.out.println("Total versions tested: " + totalVersions);
        System.out.println("The first bad version identified is: " + result);
    }
}
