package javaPrograms;

public class SegregateString {

	public static void main(String[] args) {
		String s="Santosh123@patil";
		String alpha="";
		String num="";
		String splchar="";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>='a'&&s.charAt(i)<='z' || s.charAt(i)>='A'&& s.charAt(i)<='Z') {
				alpha=alpha+s.charAt(i);
			}
			else if (s.charAt(i)>='0'&&s.charAt(i)<='9') {
				num=num+s.charAt(i);
			}
			else {
				splchar=splchar+s.charAt(i);
			}
			
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(splchar);
	}

}
