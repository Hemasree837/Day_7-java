import java.util.*;
public class TwoPairSumArray1{
public static void main(String[] args) {
                 
        int n[]={1,8,12,16,18,20,25};
        int arr[] = n;
        Arrays.sort(arr);
        int k=20;
        int l=0;
        int r=arr.length-1;
        boolean g=false;
        while (l<=r)
        {
            int sum=arr[l]+arr[r];
            if(sum==k)
            {
                g=true;
                break;
            }
            else if(sum<k)
            { 
                l++;
            }
            else{
                r--;
            }
        }
         System.out.println(g);
        }
    }

