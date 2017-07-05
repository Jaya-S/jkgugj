# jkgugj
import java.util.Scanner;
public class classdigitcount {
	
	  private static Scanner get;

	public static void main(String []args){
	    
	    int n,i=0;
	    System.out.println("Enter the numbers"); 
		get = new Scanner(System.in);
	    n=get.nextInt();
	    while(n>0)
	    {
	      n=n/10;
	      i++;
	    }
	    System.out.println();
	    System.out.println("The number of digits are:"+i);
	  }
	}
