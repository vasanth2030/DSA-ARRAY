package workout;

import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in array: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        System.out.print("The second largest number in the array is: ");
        System.out.print(secondlarge(arr));
    }
    static int secondlarge(int arr[])
    {
        int second=-1;
        int largest=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[largest])
            {
                second=largest;
                largest=i;
            }
            else if(arr[i]!=arr[largest])
                if(second==-1 || arr[i]>arr[second])
                    second=i;
        }
        return arr[second];
    }
}
