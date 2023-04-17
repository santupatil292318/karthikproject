package kartik;

public class RevereString {

	public static void main(String[] args) {
		String s="Santosh";
		String rev="";
		for (int i = s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.print(rev);
	}

}
