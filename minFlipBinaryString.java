package Array;
import java.util.*;
public class minFlipBinaryString {
    public static void main(String[] args) {
        String s="00110011101";
        minFlips(s);
    }
    static void minFlips(String s)
    {
        //the general concept is that
        //the difference between 1 or 0 GROUPS in a given string is always 1 or 0
        //and the second repeating group has the minimum occurences
        //so we flip the second group
        char[]c=s.toCharArray();
        int n=c.length;
        char first=c[0];
        for(int i=1;i<n;i++)
        {
            if(c[i]!=c[i-1])
            {
                //we dont need to flip. we just have to return the indices
                if(c[i]!=first)
                {
                    if(i==n-1)
                        System.out.println("Flip "+i);
                    else
                        System.out.print("Flip from "+i+" to ");
                }
                else
                    System.out.print(i-1+"\n");
            }
        }

    }
}
