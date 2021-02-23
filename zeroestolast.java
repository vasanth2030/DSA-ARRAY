package workout;

import java.util.Scanner;

public class zeroestolast {
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
        System.out.println("The array after zeros to last is: ");
        zerostolast(arr);
    }
    static void zerostolast(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
        printarray(arr);
    }
    static void printarray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
