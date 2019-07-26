import java.io.*;
import java.util.*;
class gcd
 {
     public static void main(String args[])throws IOException
      {
          int n;
          Scanner sc=new Scanner(System.in);
          n=sc.nextInt();
          int []a=new int[n];
          for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("gcd of the given values:"+gc(a));
      }
      static int gc(int [] temp)
       {
           int min=temp[0],count=0;
           for(int i=1;i<temp.length;i++)
             {
                 if(min>temp[i])
                   min=temp[i];
             }
            // System.out.println(min);
            for( int i=2;i<=min;i++)
              {
                  for(int j=0;j<temp.length;j++)
                    {
                        if(temp[j]%i!=0)
                          break;
                        else
                         count++;

                    }
                    //System.out.println("i="+i+",count="+count);
                    if(count==temp.length)
                      return i;
                count =0;
              }
        return 1;

       }
 }