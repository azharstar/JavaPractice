package loopingstmt;
//WAP to print Odd numbers using While Loop
public class OddNum {

	public static void main(String[] args) {
		int i=1;
		while(i<=20) {
			if(i%2 != 0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
