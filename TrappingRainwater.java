package Array;
import java.util.*;
public class TrappingRainwater {
    public static void main(String[] args) {
        //rain water trapping. first and last can't trap any water.
        //ascending/descending can't trap water. so we use leftmax,rightmax concept.
        //check left and right max for each element. sub arr[i] from the min of left and right maxes.
        int arr[]={3,0,1,2,5};
        System.out.println(rainwaterTrap(arr));
        //2 solutions
    }
    static int trapRainWater(int arr[])
    {
        //O(n) time complexity and O(n) space complexity
        int n=arr.length;
        int left_max[]=new int[n];
        int right_max[]=new int[n];
        left_max[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            left_max[i]=Math.max(arr[i],left_max[i-1]);
        }
        right_max[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right_max[i]=Math.max(arr[i],right_max[i+1]);
        }
        int res=0;
        for(int i=1;i<n-1;i++)
        {
            //we avoid first and last because it can't trap any water
            res=res+Math.min(left_max[i],right_max[i])-arr[i];
        }
        return res;
    }
    static int rainwaterTrap(int arr[])
    {
        //O(n^2) time comp O(1) space
        int n=arr.length;
        int left_max;
        int right_max;
        int res=0;
        for(int i=1;i<n-1;i++)
        {
            //first and last can't trap any water
            left_max=arr[i];
            for(int j=0;j<i;j++)
                left_max=Math.max(arr[j],left_max);
            right_max=arr[i];
            for(int j=i+1;j<n;j++)
                right_max=Math.max(right_max,arr[j]);
            res=res+Math.min(left_max,right_max)-arr[i];
        }
        return res;
    }
}
