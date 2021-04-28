package Array;
import java.util.*;
public class PreSum {
    public static void main(String[] args) {
        int arr[]={2,8,3,9,6,5,4};
        System.out.println(sumOfSubArrayRange(arr,0,2));
        System.out.println(sumOfSubArrayRange(arr,1,3));
        System.out.println(sumOfSubArrayRange(arr,2,6));

    }
    static int sumOfSubArrayRange(int arr[],int l,int r)
    {
        //the objective is to return the sum of values from l to r;
        //we pre process the given array
        //we compute presum-->prefix sum array
        int n=arr.length;
        int sum=0;
        int ans;
        int temp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            temp[i]=sum;
        }
        if(l==0)
            return temp[r];
        else {
            ans = temp[r] - temp[l - 1];
            return ans;
        }
    }
}
