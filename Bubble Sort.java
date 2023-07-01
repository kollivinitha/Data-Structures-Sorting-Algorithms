/*
BUBBLE SORT

INPUT:
6
1 4 7 0 3 2

OUTPUT:
0 1 2 3 4 7
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
        for(int j=0;j<n;j++)
        {
        for(int i=1;i<n;i++)
        {
            if(arr[i-1]>arr[i])
            {
               int temp=arr[i-1];
               arr[i-1]=arr[i];
               arr[i]=temp;
            }
        }
        }
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
  }
}
