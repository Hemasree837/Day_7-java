import java.util.*;
public class PrefixSumDividedbyZero
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int s=0;
        for(int i=0;i<n;i++)
        {
            s+=arr[i];
            int res=s/(i+1);
            arr[i]=res;

        }
        System.out.println(Arrays.toString(arr));

    }
    
}
/*
 *6
1
2
3
4
6
[1, 1, 2, 2, 3, 3]
 */
