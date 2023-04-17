package kartik;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=7;
		int i=2;
		int count=0;
		while (num>i) {
			if (num%i==0) {
				count++;
				break;
			}
			i++;
		}
		num--;
		if(count==0)
		{
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}

	}

}
