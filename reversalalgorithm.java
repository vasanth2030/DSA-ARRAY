package workout;
import java.util.Scanner;
public class reversalalgorithm {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in array: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        System.out.println("The array is");
        printarray(arr);
        System.out.println("Enter the number of elements to be rotated");
        int d=s.nextInt();
        System.out.println("The array after rotation is: ");
        rotate(arr,d,n);
    }
    static void rotate(int arr[], int d,int n)
    {
        if(d==0)
            return;
        d=d%n;
        reversal(arr,0,d-1);
        reversal(arr,d,n-1);
        reversal(arr,0,n-1);
        printarray(arr);
    }
    static void reversal(int arr[],int a,int b)
    {
        while(a<b)
        {
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
    }
    static void printarray(int arr[])
    {
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();

    }

}
