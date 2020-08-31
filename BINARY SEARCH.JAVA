import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
    
      char a[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
      char key;
      int pos;
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the first letter");
      key=scan.next().charAt(0);
      pos=binarysearch(a,a.length,key);
      if(pos==-1)
        System.out.println("not found");
      else
        System.out.println("key found"+pos);
      
    } 
    public static int binarysearch(char a[],int n,int key)
	{
		int lb, ub, mid;
		
		lb = 0; 
		ub = n-1;

		while(lb<=ub)   // fail means (lb>ub)
		{	
			mid = (lb+ub)/2;
			if(a[mid] == key)
				return mid;
			else
			if(a[mid]<key)	
				lb = mid+1;
			else
				ub = mid-1;
		}
		return -1;
	}	
}	


