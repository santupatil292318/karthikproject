package kartik;

public class Prime1to10 {

	public static void main(String[] args) {
		int num=100;
		
		for (int i= 2; i<num; i++) {
			for (int j = i; j <num; j++) {
				if (i/j==0) {
					System.out.println(i);
				}
			}
		}

	}

}
