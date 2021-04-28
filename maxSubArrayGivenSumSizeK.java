package Array;
import java.util.*;
public class maxSubArrayGivenSumSizeK {
    public static void main(String[] args) {
        int arr[]={-5,8,9,-2,-3,50};
        int sum=40;
        int k=3;
        if(subArrayWithGivenSum(arr,k,sum))
            System.out.println("Yess");
        else
            System.out.println("No");
    }
    static boolean subArrayWithGivenSum(int arr[],int k,int sum)
    {
        //first compute sum of first k elements
        int n=arr.length;
        int curr_sum=0;
        for(int i=0;i<k;i++) {
            curr_sum+=arr[i];
        }
        if(curr_sum==sum)
            return true;
        for(int i=k;i<n;i++)
        {
            curr_sum+=arr[i]-arr[i-k];
            if(curr_sum==sum)
                return true;
        }
        return false;
    }
}
