import java.util.Scanner;       
import java.lang.Math.*;   

public class Distance {
	
	 public static void main(String args[])   
	  {
	    double x1,y1,x2,y2;                 
	    double distance;                   
	    
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the coordinates of the first point "+ " (put space in between them) : ");

	    x1=scan.nextDouble();              
	    y1=scan.nextDouble();              
	   
	    System.out.print("Enter the coordinates of the second point : ");

	    x2=scan.nextDouble();               
	    y2=scan.nextDouble();                

	    double x,y;
	    x=((x1-x2)*(x1-x2));                
	    y=((y1-y2)*(y1-y2));

	    double T;
	    T=(x+y);

	    distance=(Math.sqrt(T));           
	    

	    System.out.println("The distance between the points is : "+distance);  
	 }

}
