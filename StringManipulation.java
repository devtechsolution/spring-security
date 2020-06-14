package org.as.devtechsolution;

public class StringManipulation {
	
	
	public static void main(String[] args) {
		
		String s= "APPLE";
		
		char[] chStr= s.toCharArray();
		int len= s.length();
		System.out.println(chStr[len-1]+ " " +chStr[len-2] );
		
		String s1= "APPLE ORANGE";
		String[] split = s1.split(" ");
		for (int i = 0; i < split.length; i++) {
			char[] chSt= split[i].toCharArray();
			int le= chSt.length;
			System.out.println(chSt[le-1]+ " " +chSt[le-2] );
		}
		
		
	}

}


