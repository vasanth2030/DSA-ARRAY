package workout;
import java.util.Scanner;
public class largestnumber {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in array: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        System.out.print("The largest number in the array is ");
        System.out.println(largest(arr));
    }
    static int largest(int arr[])
    {
        int largestvalue=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[largestvalue])
                largestvalue=i;
        }
        return arr[largestvalue];
    }

}
