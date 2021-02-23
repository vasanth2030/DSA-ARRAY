package workout;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;

public class arrayreverse {
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
        System.out.println("The reversed array is: ");
        reverse(arr);

    }
    static void reverse(int arr[])
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
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
