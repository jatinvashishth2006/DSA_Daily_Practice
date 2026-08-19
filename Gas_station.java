import java.util.*;
public class Gas_station
{
    static int canCompleteCircuit(int[] gas, int[] cost)
    {
        int tank = 0;//amount of gas available
        int total = 0;// total amount of gas required
        int start = 0;// index at which we have to start

        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            total += diff;
            tank += diff;
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        if (total >= 0) {
            return start;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] gas = new int[n];
        int[] cost = new int[n];
        System.out.println("enter the gas");
        for (int i = 0; i < n; i++) {
            gas[i] = sc.nextInt();
        }
        System.out.println("enter the cost");
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }
        int ans = canCompleteCircuit(gas, cost);
        System.out.println(ans);
    }
}






