import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		
		 Scanner keyboard = new Scanner(System.in); 
		    
		    int days =0; 
		    String monthName;
		    
		    System.out.println("How many days?"); 
		    days= keyboard.nextInt();   
		    
		    switch(days){
		        
		        case 30: 
		            monthName = "April, June, September, November";
		        break;
		        
		        case 31:
		            monthName = "January, March, May, July, August, October, December"; 
		       
		        break; 
		        
		        case 29:
		            monthName = "February"; 
		       
		        break; 
		        
		        default: monthName = "no months have exactly " + days + " days";
		        break;
		    
		    }
		         System.out.println(" Month names : " + monthName);

		    
		      }
		    
		}