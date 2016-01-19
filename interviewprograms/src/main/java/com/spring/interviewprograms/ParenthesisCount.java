package com.spring.interviewprograms;


public class ParenthesisCount {
	public static void main(String[] args) {
		String str = "This is ((3) dumy (text";
		System.out.println(countParentheses(str));
	}
	
	static int countParentheses(String str){
		int length = str.length();
		int count = 0;
		for(int i =0;i<length;i++){
			char ch = str.charAt(i);
			if(ch=='('){
				count++;
			}
			
			if(ch==')'){
				count--;
			}
		
		}
		
		return count;
	}

}
