package workout;

import java.util.Scanner;

public class twosum {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the array: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the values of the array: ");
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        System.out.println("The array is: ");
        printarray(arr);
        System.out.println("Enter the sum: ");
        int target=s.nextInt();
        printarray(twosum1(arr,target));



    }
    static int[] twosum1(int arr[], int n)
    {
        for(int i=0;i<arr.length;i++)
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==n)
                    return new int[] {i,j};
            }
        return new int[] {};
    }
    static void printarray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
