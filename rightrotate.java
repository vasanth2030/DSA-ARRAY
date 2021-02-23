package workout;

import java.util.Scanner;

public class rightrotate {
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
        System.out.println("The array after right rotate: ");
        right(arr);
    }
    static void right(int arr[])
    {
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--)
            arr[i]=arr[i-1];
        arr[0]=temp;
        printarray(arr);
    }
    static void printarray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
