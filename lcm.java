import java.io.*;
import java.util.Scanner;

class lcm
 {
     public static void main(String args[])throws IOException
       {
           int n,lcm_re;
         Scanner sc=new Scanner(System.in);
           n=sc.nextInt();
           int []a=new int[n];
           for(int i=0;i<n;i++)
             a[i]=sc.nextInt();
           lcm_re=lc(a[0], a[1]); 
           
         for(int i=2;i<n;i++)
           lcm_re=lc(a[i],lcm_re);
    System.out.println(lcm_re); 






       }
    static int lc(int x,int y)
     {
         int greater;
         if(x<y)
           greater=y;
        else
          greater=x;
        while(true)
         {
             if((greater%x==0)&&(greater%y==0))
               {
                return greater;
                

               }
               greater+=1;

         }

         
     }
 }