package Array;
import java.util.*;
public class stockBuyAndSell {
    public static void main(String[] args) {
        int arr[]={1,5,3,8,12};
        //we buy at 1,sell at 5. profit=4. then buy at 3 sell at 12. profit=4+9=13
        System.out.println(stockBuySell(arr));
    }
    static int stockBuySell(int arr[])
    {
        /*we buy stock when rate is low. and sell when high
        therefore if value if lower than prev value. we don't consider. we buy at lowest
        and sell at highest. function should return the total profit*/
        int profit=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
                profit+=(arr[i]-arr[i-1]);
        }
        return profit;
    }
}
