package Array;
import java.util.*;
public class maxCircularSubArrayEasy {
    //concept is: we find max subarray
    //we find max of circular sub array-->total sum of array-min sub array array
    //then finally return max(normal,circular)
    public static void main(String[] args) {
        int arr[]={8,-4,3,-5,4};
        System.out.println(circularArrayMax(arr));

    }
    static int circularArrayMax(int arr[])
    {
        //we take max of normal array
        int n=arr.length;
        int tot_sum=0;
        int max_normal=maxSubArray(arr);
        if(max_normal<0)
            return max_normal;
        for(int i=0;i<n;i++)
        {
            //compute total sum
            tot_sum+=arr[i];
            //negate the array and then we find max
            arr[i]=-arr[i];
        }
        int min=maxSubArray(arr);
        int res=Math.max(max_normal,tot_sum+min);
        return res;
    }
    static int maxSubArray(int arr[])
    {
        //first we create a method to compute max sub array-->kadane's algorithm
        int n=arr.length;
        int max=0;
        int res=arr[0];
        for(int i=0;i<n;i++)
        {
            max=Math.max(max+arr[i],arr[i]);
            res=Math.max(max,res);
        }
        return res;
    }

}
