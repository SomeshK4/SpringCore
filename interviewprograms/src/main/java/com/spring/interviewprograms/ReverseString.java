package com.spring.interviewprograms;


public class ReverseString {
	public static void main(String[] args) {
		String s = reverseFullString("Hello World");
		System.out.println(s);
	}
	
	static String reverseFullString(String inputString){
		String[] words = inputString.split(" ");
		StringBuffer str = new StringBuffer();
		for(int i=words.length-1;i>=0;i--){
			String word = words[i];
			String reverse = "";
			for(int j=word.length()-1;j>=0;j--){
				reverse = reverse+word.charAt(j);
			}
			str.append(reverse);
			str.append(" ");
		}
		return str.toString();
	}
	
	

}
