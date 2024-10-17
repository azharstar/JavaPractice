package controlstatements;

public class Sequence2 {

	public static void main(String[] args) {
		//initialization
		int term=2;
		while(term<=442) {
			if(term%4==0)
				System.out.print(-term+",");  // Print negative terms
			else
				System.out.print(term+",");   // Print negative terms
			// update
			term=term+2;
		}

	}

}
