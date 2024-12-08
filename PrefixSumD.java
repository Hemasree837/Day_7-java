import java.util.Arrays;
import java.util.*;

public class PrefixSumD 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int pre[]=new int[n];
        pre[0]=arr[0];
        for(int i=1;i<n;i++)
        { 
        pre[i]=arr[i]+pre[i-1];
         }
        System.out.println(Arrays.toString(pre));
    }
    
}
/*
 5
1
2
3
4
5
[1, 3, 6, 10, 15]
 */
