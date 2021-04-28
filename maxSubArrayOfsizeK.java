package Array;
import java.util.*;
public class maxSubArrayOfsizeK {
    public static void main(String[] args) {
        int arr[]={1,8,30,-5,20,7};
        int k=3;
        System.out.println(maxSumOfKintegers(arr,k));
    }
    static int maxSumOfKintegers(int arr[],int k)
    {
        //window sliding technique
        int n=arr.length;
        int sum=0;
        int max;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        max=sum;
        for(int i=k;i<n;i++)
        {
            sum-=arr[i-k];
            sum+=arr[i];
            max=Math.max(sum,max);
        }
        return max;
    }
}
