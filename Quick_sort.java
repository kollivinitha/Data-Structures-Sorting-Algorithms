/*                                                      QUICK SORT
Input:6
      1,8,4,6,7,89
Output:1,4,6,7,8,89
*/
import java.util.*;
import java.io.*;
class HelloWorld {
    
    public static void quick_sort(int[] arr,int lb,int ub)
    {
        if(lb<ub)
        {
        int pos=partition(arr,lb,ub);
        quick_sort(arr,lb,pos-1);
        if(pos+1<ub)
        {
        quick_sort(arr,pos+1,ub);
        }
        }
    }
    public static int partition(int[] arr,int lb,int ub)
    {
        int pivot=arr[lb];
        int start=lb;
        while(lb<ub)
        {
            while(arr[lb]<=pivot)
            {
                lb+=1;
            }
            while(arr[ub]>pivot)
            {
                ub-=1;
            }
            if(lb<ub)
            {
                swap(arr,lb,ub);
            }
        }
        swap(arr,start,ub);
        return ub;
    }
    public static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
        quick_sort(arr,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
