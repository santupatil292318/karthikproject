package kartik;

public class AscendingOrder {

	public static void main(String[] args) {
		int[] num= {1,3,2,5,4};
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if(num[i]>num[j])
				{
					int sum=num[i];
					num[i]=num[j];
					num[j]=sum;
				}
			}
			System.out.print(num[i]);
		}

	}

}
