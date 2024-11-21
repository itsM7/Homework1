package Homework_1.Homework_1;

//import ex1.ex1.DivisionByZeroException;

public class ComparingNumbers 
{
	public static String Comparing(double a, double b, String mod)
	{
		switch(mod)
		{
		// Case 1
		case "regular":
			if(a < b)
				return "B";
			else if(a > b)
				return "A";
			else
				return "Error";
			
		// Case 2
		case "negatives":
			if(a < b)
				return "A";
			else if(a > b)
				return "B";
			else 
				return "Error";
			
		// Case 3
		case "reciprocals":
			if(a == 0 || b == 0)
				return "Cannot divide by zero";
				//throw new DivisionByZeroException("Cannot divide by zero");
			else if((1/a) > (1/b))
				return "A";
			else if((1/a) < (1/b))
				return "B";
			else
				return "Error";
		}
		return "None";
	}
}
