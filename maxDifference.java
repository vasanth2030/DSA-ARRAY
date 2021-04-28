package Array;
import java.util.*;
public class maxDifference {
    public static void main(String[] args) {
        int arr[]={7,9,5,6,-10,3,90};
        System.out.println(maxDiff(arr));

    }
    static int maxDiff(int arr[])
    {
        //compute max difference--> right element minus left
        //need not be continuous
        //compute min val from left to right
        //delete from arr[i] and return the maximum value from that
        int min_val=arr[0];
        int res=arr[1]-arr[0];
        for(int i=1;i<arr.length;i++)
        {
            min_val=Math.min(min_val,arr[i]);
            res=Math.max(res,arr[i]-min_val);
        }
        return res;
    }
}
