package workout;

import java.util.Scanner;

public class leftrotate {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the array: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the values of the array: ");
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        System.out.println("The arraym is: ");
        printarray(arr);
        System.out.println("The array after left rotate: ");
        left(arr);
    }
    static void left(int arr[])
    {
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++)
            arr[i]=arr[i+1];
        arr[arr.length-1]=temp;
        printarray(arr);
    }
    static void printarray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
