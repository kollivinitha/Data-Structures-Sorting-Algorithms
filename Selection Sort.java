/*
SELECTION SORT

INPUT
9
1 8 4 6 3 2 3 2 0

OUTPUT:
0 1 2 2 3 3 4 6 8
*/

import java.io.*;
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
          {
            arr[i]=sc.nextInt();
          }
        for(int j=0;j<n-1;j++)
        {
            int ind=-1;
            int min=Integer.MAX_VALUE;
        for(int i=j;i<n;i++)
        {
            
            if(arr[i]<min)
            {
                min=arr[i];
                ind=i;
            }
        }
        if(ind != j)
        {
            int temp=arr[j];
            arr[j]=arr[ind];
            arr[ind]=temp;
        }
        }
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
