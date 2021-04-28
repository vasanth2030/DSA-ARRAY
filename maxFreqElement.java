package Array;
import java.util.*;
public class maxFreqElement {
    //Majority element--> element whose occurence>n/2
    //we use moore voting algorithm
    //moore voting algo-->used to find the max occuring element in array
    public static void main(String[] args) {
        int arr[]={1,2,2,4,2,2,2,6};
        System.out.println(maxOccuringMajority(arr));

    }
    static int maxOccuringMajority(int arr[])
    {
        int n=arr.length;
        //moore algorithm-->two phases
        //phase 1-->determine the index of highest occuring value
        //phase 2--> count occurence
        //phase 1:
        int res=0;
        int count=1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]==arr[res])
                count++;
            else
                count--;
            if(count==0) {
                res = i;
                count=1;
            }
        }
        //first phase over-->returns index of max occuring number
        //second phase:
        count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==arr[res])
                count++;
            if(count>n/2)
                return res;
        }
        //second phase-->here checks occurence and returns the index-->we can return count if wanted
        return -1;
    }
}
