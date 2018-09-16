package lcmahcf;
import java.util.Scanner;

public class lcmahcf{
	int hcf(int a,int b){
	  if(a!=0 && b==0)
	   return b; 
	  return a; 
	 }                                                               
	 int lcm(int a,int b,int x){
	 if((a%b)!=0) 
		  return lcm(a+x,b,x);
	 else
          return a;
	 }                                                         
 public static void main(String args[]){ 
  lcmahcf lh = new lcmahcf();
  Scanner s=new Scanner(System.in);
  int n,i,l,h;
  int[] a= {1,2,3,4,5,6,7,8,9};
  System.out.println("\nEnter the number of element :"); 
  n=s.nextInt();
  System.out.println("\nEnter the 1 Element:"); 
  a[0]=s.nextInt();
  l=a[0]; 
  h=a[0]; 
  System.out.println("\n************************************\n"); 
  for(i=1;i<n;i++) 
  { 
	 System.out.printf("\nEnter the %d Element:\n",i+1);
     a[i]=s.nextInt();
     System.out.println("\n************************************\n");
     if(l<a[i]) 
       l=lh.lcm(a[i],l,a[i]);                              
     else 
       l=lh.lcm(l,a[i],l);                                         
     h=lh.hcf(h,a[i]);                                                   
  }
  
  System.out.printf("\nLEAST COMMON MULTIPLE = %d\n",l);
  System.out.printf("\nHIGHEST COMMON FACTOR = %d\n",h); 
  s.close();
 }   
}