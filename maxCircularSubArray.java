package Array;
import java.util.*;
public class maxCircularSubArray {
    public static void main(String[] args) {
        int arr[]={8,-4,3,-5,4};
        System.out.println(maxCircular(arr));

    }
    static int maxCircular(int arr[])
    {
        //below is solved in single stretch. Also refer the next method
        int n=arr.length;
        int max=0,min=0,totalsum=0;
        int res,resmax=arr[0],resmin=arr[0];;
        for(int i=0;i<n;i++)
        {
            //first compute max of array
            max=Math.max(max+arr[i],arr[i]);
            resmax=Math.max(max,resmax);
        }
        //a condition that if res max is less than zero
        //then circular max will also be less than resmax
        if(resmax<0)
            return resmax;

        //computing total sum
        for(int i=0;i<n;i++) {
            totalsum+=arr[i];
        }

        for(int i=0;i<n;i++)
        {
            //to compute min of array, we multiply them by -1 and then compute max
            min=Math.min(min+arr[i],arr[i]);
            resmin=Math.min(min,resmin);
        }

        res=Math.max(resmax,totalsum-resmin);
        return res;

    }
}
