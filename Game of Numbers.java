import java.io.*;
import java.util.Scanner;
public class Main
   {
        public static void main(String []args) {
            int i,sum=0;
            int N=10;
            int arr[]=new int[100000];
            Scanner scan=new Scanner(System.in);
            for(i=0;i<N;i++)
            {
            arr[i]=scan.nextInt(); 
            }
             for(i=0;i<N;i++){
                  sum=sum^arr[i];
             }
               if(sum==0)
               {
                   System.out.println("JASBIR");
               }   
                else
                {
                   System.out.println("AMAN");
                }
        }
    }    



