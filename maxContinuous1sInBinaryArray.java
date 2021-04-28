package Array;
import java.util.*;
public class maxContinuous1sInBinaryArray {
    public static void main(String[] args) {
        int arr[]={0,1,1,0,0,1,1,1,0,1,1,1,1,0};
        System.out.println(maxCount(arr));
    }
    static int maxCount(int arr[])
    {
        int n=arr.length;
        int res=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
                count=0;
            else {
                count++;
                res=Math.max(res,count);
            }
        }
        return res;
    }
}
