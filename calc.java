import java.util.Scanner;

public class MathOperations {
	    public static void main(String[] args) {
		            Scanner scanner = new Scanner(System.in);

			             Input two numbers
				             System.out.print("Enter first number: ");
				                     double num1 = scanner.nextDouble();
				    
				                           System.out.print("Enter second number: ");
				                                   double num2 = scanner.nextDouble
				                                                     double multiplication = num1 * num2;
				                                                             double division = (num2 != 0) ? (num1 / num2) : Double.POSITIVE_INFINITY; 	    
				                                                                    
				                                                                             System.out.println("Multiplication: " + multiplication);
				                                                                                     if (num2 != 0) {
				                                                                                                 System.out.println("Division: " + division);
				                                                                                                         } else {
				                                                                                                                     System.out.println("Division not possible (cannot divide by zero)");
				                                                                                                                             }
				    
				                                                                                                                                     scanner.close();
				                                                                                                                                         }
				                                                                                                                                         }
				  
