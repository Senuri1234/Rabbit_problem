
public class Rabbit_problem {
	
	

	    // Recursive method to calculate the number of rabbit pairs after n months
	    public static int rabbitPairs(int n) {
	        // Base cases
	        if (n <= 0) {
	            return 0; // No rabbits if the number of months is 0 or less
	        }
	        if (n == 1 || n == 2) {
	            return 1; // Only one pair of rabbits in the first or second month
	        }

	        // Recursive case: F(n) = F(n-1) + F(n-2)
	        return rabbitPairs(n - 1) + rabbitPairs(n - 2);
	    }

	    // Main method to test the Rabbit Problem solution
	    public static void main(String[] args) {
	        int months = 6; // Number of months
	        System.out.println("Number of rabbit pairs after " + months + " months: " + rabbitPairs(months));
	    }
	}



