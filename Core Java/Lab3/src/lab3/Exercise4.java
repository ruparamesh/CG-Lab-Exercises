package lab3;

public class Exercise4 {
	public static void main(String args[]){ 
		   int y=0, z=0;
		   int x = Integer.parseInt(args[0]);
		   while(x>0)
		   {
		    y=(x%10);
		    x=x/10;
		    y=y-(x%10);
		    System.out.print(y);
		    
		   }
		   
		  }
}
