public class majorityelement
{
    public int majorityElement(int[] nums)
    {
        int candidate = nums[0];
        int count=0;
        for(int num:nums)
        {
            if (count == 0)
            {
                    candidate = num;
            }

                // Add 1 if it matches the candidate, subtract 1 if it does not
                if (num == candidate)
                {
                    count++;
                }

                else
                {
                    count--;
                }
            }

            // The remaining candidate is the majority element
            return candidate;

        }
    public static void main(String args[])
    {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        majorityelement obj = new majorityelement();

        int result = obj.majorityElement(nums);

        System.out.println("Majority Element = " + result);
    }
}

