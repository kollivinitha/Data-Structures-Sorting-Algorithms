/*
INSERTION SORT

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
        for(int i=1;i<n;i++)
        {
            if(arr[i]<arr[i-1])
            {
                int j=i-1;
                int temp=arr[i];
                while(j>=0)
                {
                    if(arr[j]>temp)
                    {
                        arr[j+1]=arr[j];
                        j-=1;
                    }
                    else
                    {
                        break;
                    }
                }
                arr[j+1]=temp;
            }
        }
        for(int k=0;k<n;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
