package Array;
import java.util.*;
public class evenOddSubArray {
    public static void main(String[] args) {
        int arr[]={1,2,4,4,5,6,7,8,2};
        System.out.println(longestEvenOddSubArray(arr));

    }
    static int longestEvenOddSubArray(int arr[])
    {
        //alternate numbers are evens or odds
        int n=arr.length;
        int count=1;
        int res=1;
        for(int i=1;i<n;i++)
        {
            if((arr[i-1]%2==0 && arr[i]%2!=0)||(arr[i-1]%2!=0 && arr[i]%2==0))
            {
                count++;
                res=Math.max(res,count);
            }
            else
                count=1;

        }
        return res;
    }
}
