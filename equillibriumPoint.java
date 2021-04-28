package Array;
import java.util.*;
public class equillibriumPoint {
    public static void main(String[] args) {
        int arr[]={3,4,8,-9,20,6};
        if(equiPoint(arr))
            System.out.println("Yess");
        else
            System.out.println("No");
    }
    static boolean equillibirium(int arr[])
    {
        //O(n) aux space required. refer below for O(1) aux space solution
        //if sum of prev elements equal to sum of next elements, then it is equillibrium point
        //first we compute a presum array
        int n=arr.length;
        int presum[]=new int[n];
        presum[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            presum[i]=presum[i-1]+arr[i];
        }
        for(int i=1;i<n;i++)
        {
            if(presum[i-1]==presum[n-1]-presum[i])
                return true;
        }
        return false;
    }
    static boolean equiPoint(int arr[])
    {
        //here we dont create a presum array, we compute left and right during each iteration
        //first compute total sum
        int n=arr.length;
        int total_sum=0;
        for(int i=0;i<n;i++)
            total_sum+=arr[i];
        //now we start the loop
        //create a variable for left sum
        int left_sum=0;

        for(int i=0;i<n;i++)
        {
            if(left_sum==total_sum-arr[i])
                return true;
            left_sum+=arr[i];
            total_sum-=arr[i];
        }
        return false;
    }
}
