package _interviewPreparation;

public class OrderDriver {
	    public static void main(String[] args) {
	        System.out.print(Order.result + " ");	
	        System.out.print(Order.result + " ");
	        new Order();
	        new Order();
	        System.out.print(Order.result + " ");
	    }
	}
	    class Order{
	    static String result = "a"; // aucrcr
	    				// print 	  au au aucrcr 
	        {
	            result += "c";
	        }
	        
	       static  {
	            result += "u";
	        }
	       
	        {
	            result += "r";
	        }
	  }


