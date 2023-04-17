package kartik;

public class SegregateString {

	public static void main(String[] args) {
		String s="santu123#%";
		String alpha="";
		String splchar="";
		String numbers="";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>='a'&& s.charAt(i)<='z'||s.charAt(i)>='A'&& s.charAt(i)<='Z') {
				alpha=alpha+s.charAt(i);
			}
			else if (s.charAt(i)>='0'&& s.charAt(i)<='9') {
				numbers=numbers+s.charAt(i);
			}
			else {
				splchar=splchar+s.charAt(i);
			}
//			
//			
//			
		}
		System.out.println("alpha ="+alpha);
		System.out.println("splchar ="+splchar);
		System.out.println("numbers ="+numbers);

	}

}
