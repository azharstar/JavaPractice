package controlstatements;

public class Pattern1_5 {
	public static void main(String[] args) {
		        // Number of rows for the pattern
		        int rows = 5;

		        //  loop for each row
		        for (int i = 1; i <= rows; i++) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print(j + " ");
		            }
		            // Move to the next line after each row
		            System.out.println();
		 }
	}
}
