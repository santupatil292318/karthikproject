package javaPrograms;

import java.util.LinkedHashSet;

public class RemoveDupliacteCharacterPrint {

	public static void main(String[] args) {
		String s="santosh";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i <s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if (ch.equals(s.charAt(i))) {
					count++;
				}
			}
			if (count==1) {
				System.out.print(ch);
			}
		}

	}

}
