import java.io.*;
import java.util.Scanner;
public class Main{
         public static void main(String [] args) {
                 //Write your code here
                int n, sum,p;
                Scanner sc = new Scanner(System.in);
                p=sc.nextInt();
                if(p>=1&&p<=1000){
                   int[] integers = new int[p];
                    for(int i = 0; i < p; i++)
                    {
                            integers[i] = sc.nextInt();
                    }
                    int a[]={1,5,7,10};
                    for(int j=0;j<p;j++){
                          n=integers[j];
                          sum=0;
                          while(n>0){
                                for(int i = 3;i>=0;i--){
                                      
                                        if(a[i]<=n){
                                            sum=sum+(n/a[i]);
                                            if(n==3 || n==9){
                                                sum=sum-1;
                                            }
                                            if(n==4){
                                                sum=sum-2;
                                            }
                                             n=n%a[i];
                                         }
                                         
                                }
                          }
                        System.out.println(sum);
                    }
                }         
            }
        }




