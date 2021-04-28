package Array;
import java.util.*;
public class LeadersOfArray {
    public static void main(String[] args) {
        int arr[]={8,6,2,4,9,7,5,6};
        leaders(arr);
    }
    static void leaders(int arr[])
    {
        //number whose right elements are smaller than it
        int max_number=arr[arr.length-1];
        //last number is always a leader. so we print it
        System.out.print(max_number+" ");
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>max_number)
            {
                System.out.print(arr[i]+" ");
                max_number=arr[i];
            }
        }
    }
}
