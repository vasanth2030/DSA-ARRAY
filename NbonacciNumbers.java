package Array;
import java.util.*;
public class NbonacciNumbers {
    public static void main(String[] args) {
        int n=3;
        int m=8;
        NbonacciNumbers(n,m);

    }
    static void NbonacciNumbers(int n,int m)
    {
        //print m(size) n-bonacci numbers
        //fibonacci-->sum of 2 numbers
        //tribonacci-->sum of 3 nums
        //n-bonacci-->sum of n numbers
        int arr[]=new int[m];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(i==n-1)
                arr[i]=1;
            else
                arr[i]=0;
            sum+=arr[i];
        }
        for(int i=n;i<m;i++)
        {
            arr[i]=sum;
            sum+=arr[i]-arr[i-n];
        }
        for(int j:arr)
            System.out.print(j+" ");
    }
}
