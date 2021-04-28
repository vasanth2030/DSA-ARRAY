package Array;
import java.util.*;
public class maxSubArray {

    public static void main(String[] args) {
        int arr[]={2,3,-8,7,-1,2,3};
        System.out.println(maxArray(arr));

    }
    static int maxSubarray(int arr[])
    {
        //kadanes algorithm--> O(n)
        int n=arr.length;
        int res=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            count+=arr[i];
            if(count<=0)
                count=0;
            res=Math.max(res,count);
        }
        return res;
    }
    static int maxArray(int arr[])
    {
        //another O(n) approach
        int n=arr.length;
        int max=0;
        int res=0;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max+arr[i],arr[i]);
            res=Math.max(res,max);
        }
        return res;
    }

}
