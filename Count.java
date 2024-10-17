package loopingstmt;
//WAP to count digits
public class Count {

	public static void main(String[] args) {
		int n =12345;
		int count=0;
		while(n!=0) {
			n=n/10;	//n=1234,123,12,1,0
			count++;
		}
		System.out.println(count);
	}

}
