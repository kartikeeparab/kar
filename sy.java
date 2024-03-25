// Java code to demonstrate star pattern 
import java.util.*; 

public class sy  { 

	// function to print spaces 
	static void printspace(int space) 
	{ 
		// base case 
		if (space == 0) 
			return; 
		System.out.print(" "); 

		// recursively calling printspace() 
		printspace(space - 1); 
	} 

	// function to print asterisks 
	static void printstar(int asterisk) 
	{ 
		// base case 
		if (asterisk == 0) 
			return; 
		System.out.print("* "); 

		// recursively calling printstar() 
		printstar(asterisk - 1); 
	} 

	// function to print the pattern 
	static void printrow(int n, int num) 
	{ 
		// base case 
		if (n == 0) 
			return; 
		printspace(n - 1); 
		printstar(num - n + 1); 
		System.out.println(""); 

		// recursively calling printrow() 
		printrow(n - 1, num); 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in); 
		int rows = 5; 
		printrow(rows, rows); 
	} 
} 
// this code is contributed by Shivesh Kumar Dwivedi
